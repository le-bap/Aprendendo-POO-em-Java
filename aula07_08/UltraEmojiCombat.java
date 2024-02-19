package aula07_08;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[3]; // cria uma "lista" de 3 posições e cada uma aramzenará um Lutador

        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 60.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript","Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 100.9f, 12, 2, 1);

        Luta UEM01 = new Luta();
        
        UEM01.marcarLuta(l[0],l[1]);
        UEM01.lutar();

        l[0].apresentar();
        l[1].apresentar();
    }
}

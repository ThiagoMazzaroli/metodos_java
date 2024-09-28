public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostraStatus();
        heroi.atacar("Hydra", "Soco");
        heroi.mostrarVida();

        Personagem heroi2 = new Personagem();
        heroi2.nome = "Teseu";
        heroi2.nivel = 4;
        heroi2.forca = 22;

        heroi2.mostraStatus();
        heroi2.atacar("Hydra", "Lançada");
        heroi2.mostrarVida();

    }
}
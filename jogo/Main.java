package jogo;

public class Main {
    public static void main(String[] args) {
        Cartas cartas = new Cartas();
        Personagem personagem1 = new Personagem("jogador 1", 100);
        Personagem personagem2 = new Personagem("jogador 2", 100);

        System.out.println(personagem1);
        System.out.println(personagem2);

        System.out.println(cartas.carta_1());
        System.out.println(cartas.carta_2());
        System.out.println(cartas.carta_3());
        System.out.println(cartas.carta_4());

    }
}

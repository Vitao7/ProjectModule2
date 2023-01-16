package principal;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Deck deck = new Deck();
        String nomePersonagem = leitor.lerString("Digite seu nome");

        Personagem personagem1 = new Personagem(nomePersonagem, deck.sortearMao());
        System.out.println("===");
        Personagem personagem2 = new Personagem(nomePersonagem, deck.sortearMao());


    }
}

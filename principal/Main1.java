package principal;

import utils.Leitor;

public class Main1 {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Deck1 deck = new Deck1();
        String nomePersonagem = leitor.lerString("Digite seu nome");

        Personagem1 personagem1 = new Personagem1(nomePersonagem, deck.sortearMao());
        System.out.println("===");
        Personagem1 personagem2 = new Personagem1(nomePersonagem, deck.sortearMao());


    }
}

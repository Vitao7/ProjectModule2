package jogo;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Carta carta;
        Personagem personagem = new Personagem();
        Deck deck = new Deck();

        personagem.nomearPersonagem();
        deck.sortearCartas();
        personagem.distribuirDeck();





//        carta.distribuirCartas();




    }
}

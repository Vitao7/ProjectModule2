package jogo;

import utils.Leitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    Personagem personagem = new Personagem();
    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Carta carta;

//    Atributos

    private int cartasPorDeck = 6;
    private int quantidadeDeCartas = 12;
    private int numeroCarta;
    private String[] cartasDoJogador = new String [quantidadeDeCartas];


    public void sortearCartas(){
        for (int i = 0; i<quantidadeDeCartas; i++){
            cartasDoJogador[i] = Carta.values()[dado.dadoSortearCarta()].getNome();
            System.out.printf("%s", cartasDoJogador[i]);
        }
    }




//    public boolean calcularChanceAcerto(){
//        int chanceDeAcerto = Carta.getCancheAcerto() + dado.dadoChanceAcerto();
//        if (chanceDeAcerto >= 10){
//            System.out.println("true");
//            return true;
//        }
//        return false;
//    }
//    public void calcularAtaque(){
//        if (calcularChanceAcerto()){
//            int teste = personagem.receberDano(Carta.values()[numeroCarta].getAtaque());
//            System.out.println(teste);
//            System.out.println("deu dano");
//        }
//        else {
//            System.out.println("não deu");
//        }
//
//    }
}

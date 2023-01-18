package jogo;

import utils.Leitor;

import java.util.List;

public class Personagem {

    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Carta carta;
    Deck deck = new Deck();
    List<Carta> mao;

//    Atributos personagem
    private  int hp = 100;
    private int quantidadeDePersonagem = 2;
    private String[] personagem = new String[quantidadeDePersonagem];


//    Construtor personagem



//    GET / SET

    public int getQuantidadeDePersonagem() {
        return quantidadeDePersonagem;
    }

    public String[] getPersonagem() {
        return personagem;
    }
    //Metodos

    public void nomearPersonagem(){
        for (int i = 0; i<quantidadeDePersonagem; i++){
            personagem[i] = leitor.lerString("Digite o nome do jogador " + (i+1));
        }

    }


    public int receberDano(int dano){
        hp -= dano;

        return hp;
    }
}
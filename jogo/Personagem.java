package jogo;

import utils.Leitor;

public class Personagem {

    Deck mao = new Deck();

    Leitor leitor = new Leitor();
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

//    Metodos

    public void nomearPersonagem(){
        for (int i = 0; i<quantidadeDePersonagem; i++){
            personagem[i] = leitor.lerString("Digite o nome do personagem: ");
        }


    }

    public void distribuirDeck(){
        for (int j = 0; j<quantidadeDePersonagem; j++){
            System.out.println(personagem[j]);
            for (int t = 0; t<mao.getQuantidadeDeCartas()/quantidadeDePersonagem; t++){
                System.out.println(mao.getCartasDoJogador());
            }
        }
    }


    public int receberDano(int dano){
        hp -= dano;

        return hp;
    }
}
package jogo;

public class Personagem {

//    Deck deck = new Deck();

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
        personagem[0] = "TORRE AZUL";
        personagem[1] = "TORRE VERMELHA";


    }

    public void distribuirDeck(){
//        personagem[0] = deck.getCartasDoJogador()[0];
    }


    public int receberDano(int dano){
        hp -= dano;

        return hp;
    }
}
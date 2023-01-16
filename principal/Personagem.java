package principal;

import utils.Leitor;

import java.util.List;

public class Personagem {

    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    List<Carta> mao;

//    Atributos personagem

    private String nome;
    private  int hp = 100;


//    Construtor personagem

    public Personagem(String nome, List<Carta> mao) {
        this.nome = nome;
        this.mao = mao;

        for(Carta carta : mao) {
            System.out.println(carta);
        }
    }
    public Personagem() {
        this.nome = nome;
    }


//    GET / SET


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //Metodos

    public void distribuirCarta(){
        setNome(leitor.lerString("Digite o nome do Jogador 1: "));
        System.out.printf("Jogador %s\n", getNome());
        for(int i = 0; i < 6; i++){
            int dadoNumero = dado.dadoSortearCarta();
            System.out.println(Carta.values()[dadoNumero] + "=" + dadoNumero);
        }
    }

//    public void personagem2(){
//        setNome(leitor.lerString("Digite o nome do Jogador 2: "));
//        System.out.printf("Jogador %s\n", getNome());
//        for(int i = 0; i < 6; i++){
//            int dadoNumero = dado.dadoSortearCarta();
//            System.out.println(Cartas.values()[dadoNumero] + "=" + dadoNumero);
//        }
//    }

    public int receberDano(int dano){
        hp -= dano;

        return hp;
    }
}
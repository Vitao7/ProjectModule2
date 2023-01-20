package principal;

import utils.Leitor;

import java.util.List;

public class Personagem1 {

    Dado1 dado = new Dado1();
    Leitor leitor = new Leitor();
    List<Carta1> mao;

//    Atributos personagem

    private String nome;
    private  int hp = 100;


//    Construtor personagem

    public Personagem1(String nome, List<Carta1> mao) {
        this.nome = nome;
        this.mao = mao;

        for(Carta1 carta : mao) {
            System.out.println(carta);
        }
    }
    public Personagem1() {
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
            System.out.println(Carta1.values()[dadoNumero] + "=" + dadoNumero);
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
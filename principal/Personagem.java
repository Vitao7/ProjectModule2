package principal;

import utils.Leitor;

public class Personagem {

    Dado dado = new Dado();
    Leitor leitor = new Leitor();

//    Atributos personagem

    private String nome;
    private  int hp = 100;


//    Construtor personagem

    public Personagem(String nome) {
        this.nome = nome;
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

    public void personagem1(){
        setNome(leitor.lerString("Digite o nome do Jogador 1: "));
        System.out.printf("Jogador %s\n", getNome());
        for(int i = 0; i < 6; i++){
            int dadoNumero = dado.dadoSortearCarta();
            System.out.println(Cartas.values()[dadoNumero] + "=" + dadoNumero);
        }
    }

    public void personagem2(){
        setNome(leitor.lerString("Digite o nome do Jogador 2: "));
        System.out.printf("Jogador %s\n", getNome());
        for(int i = 0; i < 6; i++){
            int dadoNumero = dado.dadoSortearCarta();
            System.out.println(Cartas.values()[dadoNumero] + "=" + dadoNumero);
        }
    }

    public int receberDano(int dano){
        hp -= dano;

        return hp;
    }
}
package jogo;

import utils.Leitor;

public class Personagem {

    Dado dado = new Dado();
    Leitor leitor = new Leitor();

     private String nome;
     private int hp = 100;

    public Personagem(String nome) {
        this.nome = nome;
    }
    public Personagem() {
        this.nome = nome;
    }

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


//    Metodos

    public void personagem1(){
        setNome(leitor.lerString("Digite o nome do Jogador 1: "));
        System.out.println(getNome());
        for (int i = 0; i<6; i++ ){
            System.out.println(AtributosDasCartas.values()[dado.dadoSortearCarta()]);
        }
//        return personagem1();
    }

    public void personagem2(){
        setNome(leitor.lerString("Digite o nome do Jogador 2: "));
        System.out.println(getNome());
        for (int i = 0; i<6; i++ ){
            System.out.println(AtributosDasCartas.values()[dado.dadoSortearCarta()]);
        }
//        return personagem2();
    }

    @Override
    public String toString() {
        return "nome = " + nome;
    }


}


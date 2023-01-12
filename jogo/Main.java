package jogo;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Personagem personagem = new Personagem();
        SelecionarEAtaque cartas = new SelecionarEAtaque();

//        Problema a resolver: Filtrar cartas de cada jogador
//        personagem.personagem1();
//        System.out.println("");
//        personagem.personagem2();

        System.out.println();

        while(personagem.getHp()>0){
            cartas.ataqueDaCarta();
        }


//        System.out.printf("%f");

    }

}

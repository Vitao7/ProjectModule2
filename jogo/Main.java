package jogo;

import utils.Leitor;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Personagem personagem = new Personagem();

        personagem.personagem1();
        System.out.println("");
        personagem.personagem2();

//        System.out.println(leitor.lerString("Digite sua carta"));

    }

}

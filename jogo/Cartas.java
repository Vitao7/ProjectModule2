package jogo;

import java.util.Arrays;

public class Cartas {
    private final int quantidadeDeCartas = 16;
    private String nome;
    private int ataque;
    private int chanceAcerto;

    public Cartas(String nome, int ataque, int chanceAcerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.chanceAcerto = chanceAcerto;
    }
    public Cartas() {
        this.nome = nome;
        this.ataque = ataque;
        this.chanceAcerto = chanceAcerto;
    }




    public void setChanceAcerto(int chanceAcerto) {
        this.chanceAcerto = chanceAcerto;
    }



}

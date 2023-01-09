package jogo;

import java.util.Arrays;
import java.util.Random;

public class Cartas {

    Random chance = new Random();

//    private final int quantidadeDeCartas = 16;
    private String nome;
    private int ataque;
    private int chanceAcerto;





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getChanceAcerto() {
        return chanceAcerto;
    }

    public void setChanceAcerto(int chanceAcerto) {
        this.chanceAcerto = chanceAcerto;
    }

    public void carta_1(){
        this.nome = "ravena";
        this.ataque = 20;
        this.chanceAcerto = 3;
    }

    public void carta_2(){
        this.nome = "tronco";
        this.ataque = 10;
        this.chanceAcerto = 5;
    }

    public void carta_3(){
        this.nome = "esqueleto";
        this.ataque = 5;
        this.chanceAcerto = 10;
    }

    public void carta_4(){
        this.nome = "dragão";
        this.ataque = 15;
        this.chanceAcerto = 7;
    }

    public boolean CalcularChanceDeAcerto(){
        int dado = chance.nextInt(0, 11);
        int calcular = chanceAcerto + dado;
        if(calcular>=10){
            return true;
        }

        return false;
    }



}

package jogo;

import java.util.Arrays;
import java.util.Random;

public class Cartas {

    Random chance = new Random();

//    private final int quantidadeDeCartas = 16;
    private String nome;
    private String ataque;
    private String chanceAcerto;





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getChanceAcerto() {
        return chanceAcerto;
    }

    public void setChanceAcerto(String chanceAcerto) {
        this.chanceAcerto = chanceAcerto;
    }

    public String carta_1(){
        this.nome = "ravena";
        this.ataque = "20";
        this.chanceAcerto = "3";
        return toString();
    }

    public String carta_2(){
        this.nome = "tronco";
        this.ataque = "10";
        this.chanceAcerto = "5";
        return toString();
    }

    public String carta_3(){
        this.nome = "esqueleto";
        this.ataque = "5";
        this.chanceAcerto = "10";
        return toString();
    }

    public String carta_4(){
        this.nome = "dragão";
        this.ataque = "15";
        this.chanceAcerto = "7";
        return toString();
    }

    public boolean CalcularChanceDeAcerto(){
        int acerto = Integer.parseInt(chanceAcerto);
        int dado = chance.nextInt(0, 11);
        int calcular = acerto + dado;
        if(calcular>=10){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "nome= " + nome + "\n" +
                "ataque= " + ataque + '\n' +
                "chanceAcerto= " + chanceAcerto + '\n';
    }
}

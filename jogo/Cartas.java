package jogo;

import java.util.Random;

public class Cartas {

    Random chance = new Random();
    Personagem personagem = new Personagem("Jogador1");

    private String nome;
    private double ataque;
    private double chanceDeAcerto;

    public String getNome() {
        return nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getChanceDeAcerto() {
        return chanceDeAcerto;
    }


    public boolean CalcularChanceDeAcerto(){
        double dado = chance.nextInt(0, 11);
        double calcular = chanceDeAcerto + dado;
        if(calcular>=10){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "nome= " + nome + "\n" +
                "ataque= " + ataque + '\n' +
                "chanceAcerto= " + chanceDeAcerto + '\n';
    }



}

package teste;

import java.util.Random;

public class Cts {
    Random random = new Random();

    private String nome;
    private int atk;
    private int chanceAcerto;
    private int numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getChanceAcerto() {
        return chanceAcerto;
    }

    public void setChanceAcerto(int chanceAcerto) {
        this.chanceAcerto = chanceAcerto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String Carta1(){
        this.nome = "ravena";
        this.atk = 10;
        this.chanceAcerto = 5;
        this.numero = 1;

        return toString();
    }

    public String Carta2(){
        this.nome = "Esqueleto";
        this.atk = 5;
        this.chanceAcerto = 7;
        this.numero = 2;

        return toString();
    }

    @Override
    public String toString() {
        return "nome= " + nome + "\n" +
                "ataque= " + atk + '\n' +
                "chanceAcerto= " + chanceAcerto + '\n';
    }

    //Escolher a carta

    public int escolherCarta(){
        double dadoCarta = random.nextDouble(0,3);
        if()
    }


    //Chance de acerto das cartas
    public boolean acerto(){
        double dadoACerto = random.nextDouble(0,11);
        double acerto = dadoACerto + atk;
        if(acerto >= 10){
            return true;
        }return  false;
    }

    //Ataque
}

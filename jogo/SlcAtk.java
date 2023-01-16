package jogo;

import utils.Leitor;

public class SlcAtk {

    Dado dado = new Dado();

    Leitor leitor = new Leitor();

    Personagem personagem = new Personagem();


    //Atributos

    int numeroCarta;


    //Metodo para selecionar a carta

    public int selecionarCarta(){
        numeroCarta = leitor.lerInteiro("Digite o numero da carta: ");
        System.out.println(numeroCarta);
        return numeroCarta;
    }

    public boolean calcularChanceAcerto(){
        int chanceDeAcerto = (int) Cartas.values()[selecionarCarta()].getChanceDeAcerto() + dado.dadoChance();
        if (chanceDeAcerto >= 10){
            System.out.println(chanceDeAcerto);
            System.out.println("true");
            return true;
        }
        return false;
    }

    public void calcularAtaque(){
        if (calcularChanceAcerto() == true){
            int teste = personagem.receberDano(Cartas.values()[numeroCarta].getAtaque());
            System.out.println(teste);
            System.out.println("deu dano");
        }
        else {
            System.out.println("não deu");
        }

    }
}

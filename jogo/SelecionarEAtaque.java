package jogo;

import utils.Leitor;

public class SelecionarEAtaque {

//    Objeto
    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Personagem personagem = new Personagem();

//    Metodos

    public double selecionarCarta(){
        int numeroDaCarta = leitor.lerInteiro("Digite o numero da carta:");
        System.out.println(Cartas.values()[numeroDaCarta]);
        System.out.println();
        return Cartas.values()[numeroDaCarta].getChanceDeAcerto() ;
    }
    public boolean calcularChanceDeAcerto(){
        selecionarCarta();
        double calcular = selecionarCarta() + dado.dadoChance();
        if(calcular>=10){
            System.out.printf("A carta acertou com %f de chance.", calcular);
            System.out.println(selecionarCarta());
            return true;
        }
        else {
            System.out.printf("A carta não acertou com %f de chance", calcular);

            return false;
        }
    }


}

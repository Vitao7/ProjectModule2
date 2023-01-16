package jogo;

import utils.Leitor;

public class SelecionarEAtaque {

//    Objeto
    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Personagem personagem = new Personagem();

//    Metodos

    public int selecionarCarta(){
        int numeroDaCarta = leitor.lerInteiro("Digite o numero da carta:");
        System.out.println(Cartas.values()[numeroDaCarta]);
        System.out.println();
        return  numeroDaCarta;
    }
    public boolean calcularChanceDeAcerto(){
        int numeroDaCarta = selecionarCarta();
        int calcular = (int) Cartas.values()[numeroDaCarta].getChanceDeAcerto() + dado.dadoChance();
        if(calcular>=10){
            System.out.printf("%s acertou com %d de chance. \n",Cartas.values()[numeroDaCarta].getNome(), calcular);
            return true;
        }
        else {
            System.out.printf("%s não acertou com %d de chance \n",Cartas.values()[numeroDaCarta].getNome(),calcular);

            return false;
        }
    }

//    public void ataqueDaCarta(){
//        if (calcularChanceDeAcerto() == true){
//            personagem.setHp(personagem.getHp() - (int) Cartas.values()[numeroDaCarta].getAtaque());
//            System.out.println();
//        }
//    }


}

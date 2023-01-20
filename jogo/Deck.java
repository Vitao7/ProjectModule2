package jogo;

import utils.Leitor;

public class Deck {
    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Personagem personagem = new Personagem();
    Carta carta;

//    Atributos

    private int cartasPorDeck = 6;
    private int quantidadeDeCartas = 12;
    private int numeroCarta;
    private String[] cartasDoJogador = new String [quantidadeDeCartas];

    public String[] getCartasDoJogador() {
        return cartasDoJogador;
    }

    public void sortearCartas(){
        for (int i = 0; i<quantidadeDeCartas; i++){
            cartasDoJogador[i] = Carta.values()[dado.dadoSortearCarta()].getNome();
            System.out.printf("%s\n", cartasDoJogador[i]);
        }
    }

    public void selecionarCarta(){
        numeroCarta = leitor.lerInteiro("Digite o numero da carta para selecionar:");
    }



    public boolean calcularChanceAcerto(){
        int chanceDeAcerto = Carta.values()[1].getCancheAcerto() + dado.dadoChanceAcerto();
        if (chanceDeAcerto >= 10){
            System.out.println("true");
            return true;
        }
        return false;
    }
    public void calcularAtaque(){
        if (calcularChanceAcerto()){
            int teste = personagem.receberDano(Carta.values()[numeroCarta].getAtaque());

        }
        else {
            System.out.println("não deu");
        }

    }
}

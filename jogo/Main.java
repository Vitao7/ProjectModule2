package jogo;

public class Main {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem("Vitor");
        Personagem personagem2 = new Personagem("Fernando");
        Dado dado = new Dado();

        System.out.println(personagem1);
        System.out.println(personagem2);

        for (int i = 0; i<7; i++ ){
            System.out.println(AtributosDasCartas.values()[dado.dadoSortearCarta()]);        }

    }

}

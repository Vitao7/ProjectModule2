package jogo;

import java.util.Random;

public class Dado {
    Random dado = new Random();

    public int dadoSortearCarta(){
        int dadoSorteioCarta = dado.nextInt(1, 13);
        return dadoSorteioCarta;
    }
    public int dadoChance(){
        int dadoChance = dado.nextInt(0,11);

        return dadoChance;
    }

}

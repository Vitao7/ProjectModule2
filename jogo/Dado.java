package jogo;

import java.util.Random;

public class Dado {
    Random dado = new Random();

    public int dadoSortearCarta(){
        int dadoSorteioCarta = dado.nextInt(0, 12 + 1);

        return dadoSorteioCarta;
    }
}

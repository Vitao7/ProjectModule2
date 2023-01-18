package jogo;

import java.util.Random;

public class Dado {

    Random random = new Random();

    public int dadoSortearCarta(){
        int dadoSortearCarta = random.nextInt(1,13);

        return dadoSortearCarta;
    }

    public int dadoChanceAcerto(){
        int ddChanceAcerto = random.nextInt(0,11);

        return ddChanceAcerto;
    }

}

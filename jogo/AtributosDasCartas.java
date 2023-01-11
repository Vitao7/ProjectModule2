package jogo;

import java.util.ArrayList;

public enum AtributosDasCartas {
    FALCAO("FALCÃO", 5, 9),
    REI("REI", 100, 0),
    FLECHA("FLECHA", 20, 5),
    ARQUEIRO("ARQUEIRO",10, 6),
    MAGO("MAGO", 10, 7),
    GOLEM("GOLEM",50,2),
    PRINCIPE("PRINCIPE",25,4),
    PRINCESA("PRINCESA",25,4),
    GUERREIRO("GUERREIRO",20,5),
    BRUXA("BRUXA",15,6),
    CATAPUTA("CATAPUTA",70,1),
    TRONCO("TRONCO",35,3),
    ;
    private String nome;
    private double ataque;
    private double chanceDeAcerto;

    AtributosDasCartas(String nome, double ataque, double chanceDeAcerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.chanceDeAcerto = chanceDeAcerto;
    }

    public String getNome() {
        return nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getChanceDeAcerto() {
        return chanceDeAcerto;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + "\n" +
                "Ataque=" + ataque + "\n" +
                "ChanceDeAcerto=" + chanceDeAcerto + "\n";

    }

    public void sortear(){
    ArrayList<AtributosDasCartas> listaCarta = new ArrayList<>();
        listaCarta.add(AtributosDasCartas.FALCAO);
        listaCarta.add(AtributosDasCartas.REI);
        listaCarta.add(AtributosDasCartas.FLECHA);
        listaCarta.add(AtributosDasCartas.ARQUEIRO);
        listaCarta.add(AtributosDasCartas.MAGO);
        listaCarta.add(AtributosDasCartas.GOLEM);
        listaCarta.add(AtributosDasCartas.PRINCIPE);
        listaCarta.add(AtributosDasCartas.PRINCESA);
        listaCarta.add(AtributosDasCartas.GUERREIRO);
        listaCarta.add(AtributosDasCartas.BRUXA);
        listaCarta.add(AtributosDasCartas.CATAPUTA);
        listaCarta.add(AtributosDasCartas.TRONCO);

    }
}

package jogo;

import java.util.ArrayList;

public enum Cartas {

//    Declaração de cada carta
    VAZIO("vazio",0,0),
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

//    Atributos
    private String nome;
    private double ataque;
    private double chanceDeAcerto;

//    Construtor
    Cartas(String nome, double ataque, double chanceDeAcerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.chanceDeAcerto = chanceDeAcerto;
    }

//    Get / Set
    public String getNome() {
        return nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getChanceDeAcerto() {
        return chanceDeAcerto;
    }



//    Metodos
    public void sortear(){
    ArrayList<Cartas> listaCarta = new ArrayList<>();
        listaCarta.add(Cartas.FALCAO);
        listaCarta.add(Cartas.REI);
        listaCarta.add(Cartas.FLECHA);
        listaCarta.add(Cartas.ARQUEIRO);
        listaCarta.add(Cartas.MAGO);
        listaCarta.add(Cartas.GOLEM);
        listaCarta.add(Cartas.PRINCIPE);
        listaCarta.add(Cartas.PRINCESA);
        listaCarta.add(Cartas.GUERREIRO);
        listaCarta.add(Cartas.BRUXA);
        listaCarta.add(Cartas.CATAPUTA);
        listaCarta.add(Cartas.TRONCO);

    }

//    ToString
    @Override
    public String toString() {
        return nome ;

    }
}

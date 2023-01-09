package jogo;

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
}

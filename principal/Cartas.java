package principal;

import utils.Leitor;

public enum Cartas {

    //Declaração de cada carta;

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

    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Personagem personagem = new Personagem();

    //Atributos das cartas;
    private  String nome;
    private int ataque;
    private int cancheAcerto;

    private int numeroCarta;

    //Get / Set das cartas;


    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getCancheAcerto() {
        return cancheAcerto;
    }

    //Construtor;
    Cartas(String nome, int ataque, int cancheAcerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.cancheAcerto = cancheAcerto;
    }

    //Metodo para selecionar a carta;





    //toString retorna o nome da carta

    @Override
    public String toString() {
        return nome;
    }
}

package jogo;

import utils.Leitor;

public enum Carta {

    //Declaração de cada carta;

    VAZIO("VAZIO",0,0),
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

//
    Dado dado = new Dado();
    Leitor leitor = new Leitor();
    Personagem personagem = new Personagem();

    //Atributos das cartas;
    private int cartaPorJogador = 6;
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

    public int getCartaPorJogador() {
        return cartaPorJogador;
    }

    //Construtor;
    Carta(String nome, int ataque, int cancheAcerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.cancheAcerto = cancheAcerto;
    }

    //Metodo para selecionar a carta;

    public void distribuirCartas(){
        for (int i = 0; i<personagem.getQuantidadeDePersonagem(); i++){
            System.out.printf("Jogador %s recebeu as seguintes cartas:\n\n", personagem.getPersonagem()[i]);
            for (int j = 0; j<6; j++){
                int numeroDaCarta = dado.dadoSortearCarta();
                System.out.println(Carta.values()[numeroDaCarta].getNome() + " = " + numeroDaCarta);
            }
        }
    }

    public int selecionarCarta(){
        numeroCarta = leitor.lerInteiro("Digite o numero da carta: ");
        return numeroCarta;
    }


    public boolean calcularChanceAcerto(){
        int chanceDeAcerto = getCancheAcerto() + dado.dadoChanceAcerto();
        if (chanceDeAcerto >= 10){
            System.out.println("true");
            return true;
        }
        return false;
    }

    public void calcularAtaque(){
        if (calcularChanceAcerto()){
            int teste = personagem.receberDano(Carta.values()[numeroCarta].getAtaque());
            System.out.println(teste);
            System.out.println("deu dano");
        }
        else {
            System.out.println("não deu");
        }

    }

    //toString retorna o nome da carta

    @Override
    public String toString() {
        return nome;
    }
}

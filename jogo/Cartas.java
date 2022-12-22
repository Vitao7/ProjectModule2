package jogo;

public class Cartas {
    private int quantidadeDeCartas = 16;
    private String[] nome = new String[quantidadeDeCartas];
    private int[] ataque = new int[quantidadeDeCartas];
    private int[] chanceAcerto = new int[quantidadeDeCartas];

    public Cartas(String[] nome, int[] ataque, int[] chanceAcerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.chanceAcerto = chanceAcerto;
    }
    public Cartas() {
        this.nome = nome;
        this.ataque = ataque;
        this.chanceAcerto = chanceAcerto;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getAtaque() {
        return ataque;
    }

    public void setAtaque(int[] ataque) {
        this.ataque = ataque;
    }

    public int[] getChanceAcerto() {
        return chanceAcerto;
    }

    public void setChanceAcerto(int[] chanceAcerto) {
        this.chanceAcerto = chanceAcerto;
    }

    Cartas ravena = new Cartas(new String[]{"Ravena"},
             new int[]{10}, new int[]{10});

    @Override
    public String toString() {
        return super.toString();
    }
}

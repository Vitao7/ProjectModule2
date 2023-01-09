package teste;

public enum Ct {
    RAVENA("Ravena", 10, 5),
    TRONCO("Tronco", 20, 1);

    private String nome;
    private int atk;
    private int chanceAcerto;

    Ct(String nome, int atk, int chanceAcerto) {
        this.nome = nome;
        this.atk = atk;
        this.chanceAcerto = chanceAcerto;
    }

    public String getNome() {
        return nome;
    }

    public int getAtk() {
        return atk;
    }

    public int getChanceAcerto() {
        return chanceAcerto;
    }
}

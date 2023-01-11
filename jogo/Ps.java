package jogo;

public class Ps {
     private String nome;

    public Ps(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome = " + nome;
    }
}


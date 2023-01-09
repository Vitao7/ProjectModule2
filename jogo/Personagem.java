package jogo;

public class Personagem {

    Cartas cartas = new Cartas();

    private String nome;
    private double hp = 100;

    public Personagem(String nome) {
        this.nome = nome;

    }

    public String getnome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getHp(){
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "nome= " + nome + '\n' +
                "hp=" + hp;
    }

    public String dano(){
        int ataque = Integer.parseInt(cartas.getAtaque());

        if(cartas.CalcularChanceDeAcerto() == true){
            hp = hp - ataque;
            return "personagem ficou com " + hp + " de HP";
        }
        return "Personagem continua com" + hp + " de HP";
    }
}

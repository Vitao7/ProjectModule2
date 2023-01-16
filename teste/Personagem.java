package teste;

public class Personagem {

    private String nome;
    private double hp = 100;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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
        return nome="" + nome;
    }

    //    public String dano(){
//
//        if(cartas.CalcularChanceDeAcerto() == true){
//            hp = hp - cartas.getAtaque();
//            return "personagem ficou com " + hp + " de HP";
//        }
//        return "Personagem continua com" + hp + " de HP";
//    }
}

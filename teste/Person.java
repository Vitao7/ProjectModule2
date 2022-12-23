package teste;

public class Person {

    private String nome;
    private int hp;

    public Person(String nome, int hp) {
        this.nome = nome;
        this.hp = hp;
    }

    public String getnome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getHp(){
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
}

package jogo;
import utils.Leitor;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        Personagem personagem = new Personagem();
        SlcAtk slcAtk = new SlcAtk();

        //Problema a resolver: Filtrar cartas de cada jogador
        personagem.personagem1();
        System.out.println();
    }
}
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck1 {
    private List<Carta1> cartas;
    private Random random = new Random();

    public Deck1() {
        cartas = new ArrayList<>();

        for(Carta1 carta: Carta1.values()) {
            cartas.add(carta);
        }
    }

    public Carta1 sortearCarta() {
        int sorteio = random.nextInt(cartas.size());
        return cartas.remove(sorteio);
    }

    public List<Carta1> sortearMao() {
        List cartas = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            cartas.add(sortearCarta());
        }
        return cartas;
    }
}

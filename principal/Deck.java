package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Carta> cartas;
    private Random random = new Random();

    public Deck() {
        cartas = new ArrayList<>();

        for(Carta carta: Carta.values()) {
            cartas.add(carta);
        }
    }

    public Carta sortearCarta() {
        int sorteio = random.nextInt(cartas.size());
        return cartas.remove(sorteio);
    }

    public List<Carta> sortearMao() {
        List cartas = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            cartas.add(sortearCarta());
        }
        return cartas;
    }
}

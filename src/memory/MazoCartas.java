package memory;


import java.util.ArrayList;
import java.util.Collections;

public class MazoCartas {
    private ArrayList<Carta> cartas;

    public MazoCartas() {
        cartas = new ArrayList<>();
    }

    // Método para agregar una carta al mazo
    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    // Método para barajar las cartas
    public void shuffle() {
        Collections.shuffle(cartas);
    }

    // Método para obtener las cartas del mazo
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}

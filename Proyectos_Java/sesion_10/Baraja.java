package org.ip.sesion010;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public abstract class Baraja {
    protected List<Carta> cartas;
    protected int indice;

    public Baraja() {
        this.cartas = new ArrayList<>();
        this.indice = 0;
        crearBaraja();
    }

    protected abstract void crearBaraja();

    public void barajar() {
        Collections.shuffle(cartas);
        this.indice = 0;
    }

    public void ordenar() {
        Collections.sort(cartas);
        this.indice = 0;
    }

    public Carta repartir() {
        if (indice >= cartas.size()) {
            return null;
        }
        return cartas.get(indice++);
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}

package org.ip.sesion08.cartamasalta;

import java.util.ArrayList;
import java.util.Collections;

public class Carta {
    private String palo;
    private int valor;

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String nombreCarta;
        switch (valor) {
            case 10:
                nombreCarta = "Sota";
                break;
            case 11:
                nombreCarta = "Caballo";
                break;
            case 12:
                nombreCarta = "Rey";
                break;
            default:
                nombreCarta = String.valueOf(valor);
        }
        return nombreCarta + " de " + palo;
    }
}

class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        cartas = new ArrayList<>();

        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) { 
                    cartas.add(new Carta(palo, i));
                }
            }
        }

        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        return cartas.remove(0);
    }
}

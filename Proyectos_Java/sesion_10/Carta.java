package org.ip.sesion010;

public abstract class Carta implements Comparable<Carta> {
    protected int numero;
    protected String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public abstract String getNombre();

    @Override
    public String toString() {
        return getNombre() + " de " + palo;
    }

    @Override
    public int compareTo(Carta o) {
        int paloComparison = this.palo.compareTo(o.palo);
        if (paloComparison != 0) {
            return paloComparison;
        } else {
            return Integer.compare(this.numero, o.numero);
        }
    }
}


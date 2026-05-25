package org.ip.sesion010;

public class BarajaEspañola extends Baraja {

    @Override
    protected void crearBaraja() {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                cartas.add(new CartaEspañola(numero, palo));
            }
        }
    }
}

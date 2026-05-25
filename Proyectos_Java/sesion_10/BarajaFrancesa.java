package org.ip.sesion010;

public class BarajaFrancesa extends Baraja {

    @Override
    protected void crearBaraja() {
        String[] palos = {"Tréboles", "Diamantes", "Corazones", "Picas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 13; numero++) {
                cartas.add(new CartaFrancesa(numero, palo));
            }
        }
    }
}

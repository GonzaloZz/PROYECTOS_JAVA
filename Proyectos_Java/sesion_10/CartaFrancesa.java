package org.ip.sesion010;

public class CartaFrancesa extends Carta {
    private static final String[] PALOS_VALIDOS = {"Tréboles", "Diamantes", "Corazones", "Picas"};
    private static final String[] NOMBRES_ESPECIALES = {null, "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "J", "Q", "K"};

    public CartaFrancesa(int numero, String palo) {
        super(numero, palo);
        boolean paloValido = false;
        for (String p : PALOS_VALIDOS) {
            if (p.equals(palo)) {
                paloValido = true;
                break;
            }
        }
        if (!paloValido) {
            throw new IllegalArgumentException("Palo no válido para baraja francesa");
        }
    }

    @Override
    public String getNombre() {
        if (numero >= 1 && numero <= 13) {
            return NOMBRES_ESPECIALES[numero];
        } else {
            return String.valueOf(numero);
        }
    }
}

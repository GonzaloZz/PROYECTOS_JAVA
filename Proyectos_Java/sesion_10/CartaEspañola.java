package org.ip.sesion010;

public class CartaEspañola extends Carta {
    private static final String[] PALOS_VALIDOS = {"Oros", "Copas", "Espadas", "Bastos"};
    private static final String[] NOMBRES_ESPECIALES = {null, "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey"};

    public CartaEspañola(int numero, String palo) {
        super(numero, palo);
        boolean paloValido = false;
        for (String p : PALOS_VALIDOS) {
            if (p.equals(palo)) {
                paloValido = true;
                break;
            }
        }
        if (!paloValido) {
            throw new IllegalArgumentException("Palo no válido para baraja española");
        }
    }

    @Override
    public String getNombre() {
        if (numero >= 1 && numero <= 12) {
            return NOMBRES_ESPECIALES[numero];
        } else {
            return String.valueOf(numero);
        }
    }
}


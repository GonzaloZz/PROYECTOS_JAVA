package org.ip.sesion08.cartamasalta;
import java.util.Scanner;
import java.util.Random;
public class CartaMasAlta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Baraja baraja = new Baraja();
        int puntuacionJugador = 0;
        int puntuacionOrdenador = 0;

        int opcion = -1;

        while (opcion != 3) {
            System.out.println("Menu: \n"
                    + "1. Jugar una partida.\n"
                    + "2. Mostrar puntuaciones.\n"
                    + "3. Salir.");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    
                    Carta cartaHumano = baraja.repartirCarta();
                    Carta cartaOrdenador = baraja.repartirCarta();

                    System.out.println("Jugador humano pide carta: " + cartaHumano);
                    System.out.println("Ordenador pide carta: " + cartaOrdenador);

                    if (cartaHumano.getValor() > cartaOrdenador.getValor()) {
                        System.out.println("¡El jugador humano ha ganado!");
                        puntuacionJugador++;
                    } else if (cartaOrdenador.getValor() > cartaHumano.getValor()) {
                        System.out.println("¡El ordenador ha ganado!");
                        puntuacionOrdenador++;
                    } else {
                        System.out.println("Empate.");
                    }
                    break;

                case 2:
                    
                    System.out.println("Las puntuaciones son: ");
                    System.out.println("- Puntuacion del jugador humano: " + puntuacionJugador);
                    System.out.println("- Puntuacion del ordenador: " + puntuacionOrdenador);
                    break;

                case 3:
                   
                    System.out.println("Saliendo. Gracias por jugar.");
                    break;

                default:
                    
                    System.out.println("Opcion no valida. Pruebe otra vez.");
            }
        }

        
        scanner.close();
    }
}

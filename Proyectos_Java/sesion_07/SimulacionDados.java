package org.ip.sesion07;
import java.util.Random;
public class SimulacionDados {

	public static void main(String[] args) {
		Random random = new Random();
		
		//clase random
		
		System.out.println("Ejemplos de Uso de la Clase Random: ");
		int numeroAleatorio = random.nextInt(100);
		System.out.println("Random Integer (0-99): " + numeroAleatorio);
		double numeroAleatorio2 = random.nextDouble(1);
		System.out.println("Random Double (0.1-1.0): "+ numeroAleatorio2);
		boolean aleatorio = random.nextBoolean();
		System.out.println("Random Boolean: " + aleatorio);
		double numeroGaussiano = random.nextGaussian();
		System.out.println("Random Gaussian Value: " + numeroGaussiano);
		
		//dado regular
		
		System.out.println("Simulacion de Dados Regulares (1000 tiradas):");
		System.out.println("Dados regulares: ");
		int[] resultados = new int[6];
		for (int i = 0; i < 1000; i++) {
			int tirada = random.nextInt(6) + 1;
			resultados[tirada - 1]++;
		}
		for (int i = 0; i < resultados.length; i++) {
			System.out.println("Numero " + (i + 1) + " : " + resultados[i] + " veces");
		}
		
		//dado cargado
		
		System.out.println("Simulacion de Dados Cargados (1000 tiradas):");
		System.out.println("Dados Cargados: ");
		int[] resultado = new int[6];
		for (int i = 0; i < 1000; i++) {
            int tirada = random.nextInt(6) + 1;
            resultado[tirada - 1]++;
        }

        for (int j = 0; j < resultado.length; j++) {
            System.out.println("Numero " + (j + 1) + " : " + resultado[j] + " veces");
        }
		
		//dado gaussiano
		
        System.out.println("Simulación de Dados Gaussianos (1000 tiradas):");
		System.out.println("Dados Gaussianos: ");
        int[] resultado2 = new int[6];
        double media = 3.5; // La media de los valores del dado (1-6)
        double desviacionEstandar = 1.0; // La desviación estándar

        for (int i = 0; i < 1000; i++) {
            int valor = (int) Math.round(random.nextGaussian() * desviacionEstandar + media);
            if (valor >= 1 && valor <= 6) {
                resultados[valor - 1]++;
            }
        }

        for (int i = 0; i < resultado2.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + resultados[i] + " veces");
        }
		
		
	}

}

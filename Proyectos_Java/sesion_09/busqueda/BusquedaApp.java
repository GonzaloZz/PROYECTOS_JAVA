package org.ip.sesion09.busqueda;
import java.util.Arrays;
import java.util.Scanner;
public class BusquedaApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int opcion = -1;
		int[] arrayEnteros = {23, 31, 13, 85, 57, 2, 71, 63, 17, 97};
		double[] arrayDouble = {32.965388838894384, 98.76868802763384, 13.015608494758268, 27.512589063483706, 3.7224940365544024, 23.583525334448964, 21.790747789104458, 76.28110961220015, 31.926127904526368, 39.72501076845909};
		
		while(opcion != 4) {
			System.out.println("Menu: \n"
					+ "1. Busqueda lineal en array de enteros.\n"
					+ "2. Busqueda lineal en array de dobles.\n"
					+ "3. Tiempo Lineal vs Binaria.\n"
					+ "4. Salir.");
			System.out.print("Seleccione un opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Array de enteros sin ordenar: " + Arrays.toString(arrayEnteros));
				System.out.print("Ingrese el valor a buscar: ");
				int valorEntero = scanner.nextInt();
				int resultadoEntero = Busqueda.busquedaLineal(arrayEnteros, valorEntero);
				System.out.println("Resultado de la busqueda Lineal: " + resultadoEntero);
				
				break;
				
			case 2:
				System.out.println("Array de double sin ordenar: " + Arrays.toString(arrayDouble));
				System.out.print("Ingrese el valor a buscar: ");
				int valorDouble = scanner.nextInt();
				int resultadoDouble = Busqueda.busquedaBinariaIterativa(arrayDouble, valorDouble);
				System.out.println("Resultado de la busqueda lineal: " + resultadoDouble);
				
				break;
				
			case 3:
				System.out.print("Ingrese el tamaño del array en la prueba de tiempos: ");
				int tamaño = scanner.nextInt();
				int[] arrayPrueba = new int[tamaño];
					for (int i = 0; i < tamaño; i++) {
						arrayPrueba[i] = i;
					}
				int valorPrueba = tamaño - 1;
				
				//Lineal
				long inicioLineal = System.nanoTime();
				int resultadoLineal = Busqueda.busquedaLineal(arrayPrueba, valorPrueba);
				long finLineal = System.nanoTime();
				long resLineal = finLineal - inicioLineal; 
				long inicioMili = System.currentTimeMillis();
				long finMili = System.currentTimeMillis();
				long resMili = finMili - inicioMili;
				
				//binaria
				
				long inicioBinaria = System.nanoTime();
				int resultadoBinaria = Busqueda.busquedaBinariaIterativa(arrayPrueba, valorPrueba);
				long finBinaria = System.nanoTime();
				long resBinaria = finBinaria - inicioBinaria;
				long inicioMiliseg = System.currentTimeMillis();
				long finMiliseg = System.currentTimeMillis();
				long resMiliseg = finMiliseg - inicioMiliseg;
				
				//mostrar resultado
				
				System.out.println("Resultado de la busqueda lineal: " + resultadoLineal);
				System.out.println("Tiempo de busqueda lineal: " + resLineal + " nanosegundos.");
				System.out.println("Tiempo de la buesqueda lineal: " + resMili + " milisegundos.");
				System.out.println("Resultado busqueda binaria: " + resultadoBinaria);
				System.out.println("Tiempo busqueda binaria: " + resBinaria + " nanosegundos.");
				System.out.println("Tiempo busqueda binaria: " + resMiliseg + " milisegundos.");
				
				break;
				
			case 4:
				System.out.println("Adios..."); 
				
				break;
				
				default: 
					System.out.println("Opcion no valida. Pruebe otra vez.");
				
			
			}			
		}		
		
		scanner.close();

	}

}

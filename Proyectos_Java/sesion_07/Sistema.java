package org.ip.sesion07;

public class Sistema {

	public static void main(String[] args) {
		
		System.out.println("Tiempo actual en milisegundos: " + System.currentTimeMillis());
		long init = System.nanoTime();
		System.out.print("Tiempo de ejecucion en nanosegundos: ");
		long end = System.nanoTime();
		long duration = end - init;
		System.out.println(duration);
		
		System.out.println("Version Java: " + System.getProperty("java.version"));
		System.out.println("Nombre del sistema operativo: " + System.getProperty("os.name"));
		System.out.println("Directorio de trabajo actual: " + System.getProperty("user.dir"));
		System.err.println("Profe apruebame ;) ");
		System.out.println("Nucleos disponibles: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Memoria total: " +  Runtime.getRuntime().totalMemory()/ (1024.0*1024.0) + " MB");
		System.out.println("Memoria libre: " +  Runtime.getRuntime().freeMemory()/ (1024*1024) + " MB" );
		// cambiar a printf para que se vean 2 decimales.

		System.out.printf("Memoria total: %.2f MB", Runtime.getRuntime().totalMemory() / (1024.0 * 1024.0));
		System.out.println();
		System.out.printf("Memoria libre: %.2f MB", Runtime.getRuntime().freeMemory() / (1024.0 * 1024.0));

	}
}

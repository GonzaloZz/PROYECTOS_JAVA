package org.ip.sesion07;

public class StringVSStringBuffer {

	public static void main(String[] args) {
		
		//texto ultilizado
		String texto =   "Es, pues, de saber, que este sobredicho hidalgo, los ratos que estaba ocioso (que eran los más del año) se daba a leer libros de"
				+ "	caballerías con tanta afición y gusto, que olvidó casi de todo punto el ejercicio de la caza, y aun la administración de su\r\n"
				+ "	 caballerías con tanta afición y gusto, que olvidó casi de todo punto el ejercicio de la caza, y aun la administración de su\r\n"
				+ "	hacienda; y llegó a tanto su curiosidad y desatino en esto, que vendió muchos acres de tierra de sembradura, por comprar\r\n"
				+ "	libros de caballerías en que leer, y así llevó a su casa todos cuantos pudo haber dellos; y de todos ningunos le parecían tan bien\r\n"
				+ "	como los que compuso el famoso Feliciano de Silva: porque la claridad de su prosa, y aquellas intrincadas razones suyas, le\r\n"
				+ "	parecían de perlas; y más cuando llegaba a leer aquellos requiebros y cartas de desafío, donde en muchas partes hallaba\r\n"
				+ "	escrito: la razón de la sinrazón que a mi razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de la\r\n"
				+ "	vuestra fermosura";	
		
		//Tiempo usando String
		
		String duracionString = " ";	
		long init = System.nanoTime();
			for (int i=0 ; i<1000; i++) {
				duracionString += texto;
			}
		long end = System.nanoTime();
		long duration = end - init;
		System.out.println("Tiempo usando String: " + duration + " nanosegundos.");
		
		//Tiempo usando stringbuffer
		
		StringBuffer duracionBuffer = new StringBuffer(); 
		long iniciar = System.nanoTime();
		for (int i=0 ; i<1000; i++) {
			duracionBuffer.append(texto);
		}
		long terminar = System.nanoTime();
		long duracion = terminar - iniciar;
		System.out.println("Tiempo usando StringBuffer: " + duracion + " nanosegundos.");
		
		//cual es mas eficiente
		if (duracion<duration) {
			System.out.println("Usar StringBuffer es mas eficiente en este caso.");
		}else { System.out.println("Usar String es mas eficiente en este caso.");}
		
		//diferencias observadas 
		long diferencia = duration - duracion;
		System.out.println("Las diferencias observadas entre String y StringBuffer son: " + diferencia + " nanosegundos de diferencia, esto se debe a que "
				+ "a que cada vez que concatenas algo con la clase String, se crea un nuevo objeto String, consumiendo mas tiempo. Por el contrario, la "
				+ "clase StringBuffer permite cambiar la cadena sin crear nuevos objetos, siendo mas eficiente. ");
		
		//situacion en la que usar string/stringbuffer
		
		System.out.println("Conviene usar String cuando la cadena cambia con poca frecuencia, mietras que StringBuffer es mejor para situaciones donde es necesario camiar la cadena con frecuencia. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

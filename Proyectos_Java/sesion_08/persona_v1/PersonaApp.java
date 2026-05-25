package org.ip.sesion08.persona_v1;

public class PersonaApp {

	public static void main(String[] args) {
		
		//nombres 
		 Persona persona1 = new Persona ("Manu" , 45);
		 Persona persona2 = new Persona ("Loli" , 25 , "Femenino");
		 Persona persona3 = new Persona();
		
		 
		 //mostrar datos 
		 System.out.println("Información de persona1 (Original): Nombre - " + persona1.getNombre() + " Edad - " + persona1.getEdad() + " Genero - " + persona1.getGenero());
		 System.out.println("Información de persona2: Nombre - " + persona2.getNombre() + " Edad - " + persona2.getEdad() + " Genero - " + persona2.getGenero());
		 System.out.println("Información de persona3 (Por defecto): Nombre - " + persona3.getNombre() + " Edad - " + persona3.getEdad() + " Genero - " + persona3.getGenero());
		 System.out.println();

		 //antes y depues persona 3
		 System.out.println("Modificando atributos de persona3: ");
		 System.out.println();
		 
		 //antes 
		 System.out.println("Antes de la modificacion");
		 System.out.println("Información de persona3 (Por defecto): Nombre - " + persona3.getNombre() + " Edad - " + persona3.getEdad() + " Genero - " + persona3.getGenero());
		 System.out.println();
		 
		 //modificar atributos persona3
		 
		 persona3.setNombre("Juan");
		 persona3.setEdad(33);
		 
		 //despues
		 System.out.println("Despues de la modificacion");
		 System.out.println("Información de persona3: Nombre - " + persona3.getNombre() + " Edad - " + persona3.getEdad() + " Genero - " + persona3.getGenero());
		 System.out.println();
		 //Comparacion	
		 
		 System.out.println("¿Es persona1 igual a persona3? " + persona1.equals(persona3));
		 
		 //persona4
		 
		 Persona persona4 = new Persona();
		 persona4.setEdad(45);
		 persona4.setNombre("Manu");
		 System.out.println("Información de persona4: Nombre - " + persona4.getNombre() + " Edad - " + persona4.getEdad() + " Genero - " + persona4.getGenero());
		 System.out.println();
		 
		 //mostrar todos los datos
		 System.out.println("Mostrar la informacion de las personas despues de los cambios:");
		 System.out.println();
		 System.out.println("Información de persona1 (Original): Nombre - " + persona1.getNombre() + " Edad - " + persona1.getEdad() + " Genero - " + persona1.getGenero());
		 System.out.println("Información de persona2: Nombre - " + persona2.getNombre() + " Edad - " + persona2.getEdad() + " Genero - " + persona2.getGenero());
		 System.out.println("Información de persona3 (Por defecto): Nombre - " + persona3.getNombre() + " Edad - " + persona3.getEdad() + " Genero - " + persona3.getGenero());
		 System.out.println("Información de persona4: Nombre - " + persona4.getNombre() + " Edad - " + persona4.getEdad() + " Genero - " + persona4.getGenero());
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

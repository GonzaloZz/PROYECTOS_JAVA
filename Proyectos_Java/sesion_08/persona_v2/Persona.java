package org.ip.sesion08.persona_v2;

import java.util.Random;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;

    // Constructor que permite crear una persona especificando su nombre, primer apellido y segundo apellido
    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Getters y Setters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters para apellido1
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    // Getters y Setters para apellido2
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    // Método equals para comparar dos objetos de tipo Persona
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre) &&
                apellido1.equals(persona.apellido1) &&
                apellido2.equals(persona.apellido2);
    }

    // Método hashCode para asegurar la consistencia con equals
    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellido1.hashCode();
        result = 31 * result + apellido2.hashCode();
        return result;
    }

    // Método toString generado con Eclipse
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                '}';
    }
}

class Utilidades {
    
    public static Persona[] generarPersonas(int numPersonas, String[] nombres, String[] apellidos) {
        Persona[] personas = new Persona[numPersonas];
        Random random = new Random();

        for (int i = 0; i < numPersonas; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido1 = apellidos[random.nextInt(apellidos.length)];
            String apellido2 = apellidos[random.nextInt(apellidos.length)];
            personas[i] = new Persona(nombre, apellido1, apellido2);
        }

        return personas;
    }

        public static int contarPersonasRepetidas(Persona[] personas) {
            int contador = 0;
            for (int i = 0; i < personas.length; i++) {
                for (int j = i + 1; j < personas.length; j++) {
                    if (personas[i].equals(personas[j])) {
                        contador++;
                        break;
                    }
                }
            }
            return contador;
        }

        public static int eliminarPersonasIguales(Persona[] personas) {
        	int eliminadas = 0;
        	for (int i = 0; i < personas.length; i++) {
        		for (int j = i + 1; j < personas.length; j++) {
        			if (personas[i] != null && personas[i].equals(personas[j])) {
        				personas[j] = null; eliminadas++;
        				}
        			}
        		}
        	return eliminadas;
        }
    }


	


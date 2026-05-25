package org.ip.sesion08.persona_v1;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    // Constructor predeterminado
    public Persona() {}

    // nombre y la edad como argumentos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // nombre, la edad y el género como argumentos
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos get y set para genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método equals para comprobar la igualdad de dos objetos Persona
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad &&
                nombre.equals(persona.nombre) &&
                (genero != null ? genero.equals(persona.genero) : persona.genero == null);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + edad;
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        return result;
        
        
    }
}

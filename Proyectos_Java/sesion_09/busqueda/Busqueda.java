package org.ip.sesion09.busqueda;

public class Busqueda {

    // Búsqueda lineal en array de enteros
    public static int busquedaLineal(int[] array, int buscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscado) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda lineal en array de doubles
    public static int busquedaLineal(double[] array, double buscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscado) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda lineal en array de objetos comparables
    public static int busquedaLineal(Comparable[] array, Comparable buscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(buscado) == 0) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda binaria iterativa en array de enteros
    public static int busquedaBinariaIterativa(int[] array, int buscado) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio] == buscado) {
                return medio;
            } else if (array[medio] < buscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    // Búsqueda binaria iterativa en array de doubles
    public static int busquedaBinariaIterativa(double[] array, double buscado) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio] == buscado) {
                return medio;
            } else if (array[medio] < buscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    // Búsqueda binaria iterativa en array de objetos comparables
    public static int busquedaBinariaIterativa(Comparable[] array, Comparable buscado) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio].compareTo(buscado) == 0) {
                return medio;
            } else if (array[medio].compareTo(buscado) < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}

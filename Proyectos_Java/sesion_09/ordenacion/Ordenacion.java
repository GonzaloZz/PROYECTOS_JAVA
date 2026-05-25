package org.ip.sesion09.ordenacion;

public class Ordenacion {

    // Ordenación por inserción para enteros
    public static void ordenacionInsercion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    // Ordenación por inserción para doubles
    public static void ordenacionInsercion(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    // Ordenación por inserción para objetos comparables
    public static void ordenacionInsercion(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            Comparable actual = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(actual) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    // Ordenación burbuja para enteros
    public static void ordenacionBurbuja(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Ordenación burbuja para doubles
    public static void ordenacionBurbuja(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Ordenación burbuja para objetos comparables
    public static void ordenacionBurbuja(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    Comparable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Ordenación por selección para enteros
    public static void ordenacionSeleccion(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Ordenación por selección para doubles
    public static void ordenacionSeleccion(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Ordenación por selección para objetos comparables
    public static void ordenacionSeleccion(Comparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}


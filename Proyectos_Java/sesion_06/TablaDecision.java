package org.ip.sesion06;

import java.util.Scanner;

public class TablaDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar la tabla de decisión
        String[] cursosAccion = null;
        String[] estadosNaturaleza = null;
        double[][] tablaDecision = null;
        int opcion = -1;

        
        while (opcion !=8 ) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Creación de la Tabla de Decisión");
            System.out.println("2. Visualizar la Tabla de Decisión");
            System.out.println("3. Toma de Decisión (Método de Laplace)");
            System.out.println("4. Toma de Decisión (Método Pesimista - Wald)");
            System.out.println("5. Toma de Decisión (Método Optimista)");
            System.out.println("6. Toma de Decisión (Método Hurwicz)");
            System.out.println("7. Ayuda");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            
             opcion = scanner.nextInt();
             

            switch (opcion) {
                case 1:
                    
                    tablaDecision = crearTablaDecision(scanner);
                    cursosAccion = new String[tablaDecision.length];
                    estadosNaturaleza = new String[tablaDecision[0].length];
                    break;
                case 2:
                   
                    visualizarTablaDecision(cursosAccion, estadosNaturaleza, tablaDecision);
                    break;
                case 3:
                 
                    metodoLaplace(cursosAccion, estadosNaturaleza, tablaDecision);
                    break;
                case 4:
                   
                    metodoPesimista(cursosAccion, estadosNaturaleza, tablaDecision);
                    break;
                case 5:
                  
                    metodoOptimista(cursosAccion, estadosNaturaleza, tablaDecision);
                    break;
                case 6:
                  
                    metodoHurwicz(cursosAccion, estadosNaturaleza, tablaDecision, scanner);
                    break;
                case 7:
                    
                    mostrarAyuda();
                    break;
                case 8:
                  
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

   
    public static double[][] crearTablaDecision(Scanner scanner) {
        System.out.println("¿Desea usar los datos precargados? : ");
        String respuesta = scanner.nextLine();
        double[][] tablaDecision;
        
        if (respuesta.equalsIgnoreCase("s")) {
          
            tablaDecision = new double[][] {
                {10.0, 8.0, 7.0},  
                {8.0, 7.0, 9.0},   
                {6.0, 9.0, 12.0}   
            };
            System.out.println("Datos precargados seleccionados.");
        } else {
            
            System.out.print("Introduzca el número de cursos de acción: ");
            int numCursos = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Introduzca el número de estados de la naturaleza: ");
            int numEstados = scanner.nextInt();
            scanner.nextLine();
            
            String[] cursosAccion = new String[numCursos];
            String[] estadosNaturaleza = new String[numEstados];
            tablaDecision = new double[numCursos][numEstados];
            
        
            for (int i = 0; i < numCursos; i++) {
                System.out.print("Nombre del Curso de Acción " + (i+1) + ": ");
                cursosAccion[i] = scanner.nextLine();
            }

           
            for (int i = 0; i < numEstados; i++) {
                System.out.print("Nombre del Estado de la Naturaleza " + (i+1) + ": ");
                estadosNaturaleza[i] = scanner.nextLine();
            }

            
            for (int i = 0; i < numCursos; i++) {
                for (int j = 0; j < numEstados; j++) {
                    System.out.print("Valor para " + cursosAccion[i] + " en " + estadosNaturaleza[j] + ": ");
                    tablaDecision[i][j] = scanner.nextDouble();
                }
            }
        }
        
        return tablaDecision;
    }

    
    public static void visualizarTablaDecision(String[] cursosAccion, String[] estadosNaturaleza, double[][] tablaDecision) {
        System.out.println("Tabla de Decisión:");
        System.out.print("Cursos / Estados | ");
        for (String estado : estadosNaturaleza) {
            System.out.print(estado + " | ");
        }
        System.out.println();
        
        for (int i = 0; i < cursosAccion.length; i++) {
            System.out.print(cursosAccion[i] + " | ");
            for (int j = 0; j < tablaDecision[i].length; j++) {
                System.out.print(tablaDecision[i][j] + " | ");
            }
            System.out.println();
        }
    }

    
    public static void metodoLaplace(String[] cursosAccion, String[] estadosNaturaleza, double[][] tablaDecision) {
        double maxValorEsperado = Double.NEGATIVE_INFINITY;
        String mejorCurso = "";

        for (int i = 0; i < tablaDecision.length; i++) {
            double suma = 0;
            for (int j = 0; j < tablaDecision[i].length; j++) {
                suma += tablaDecision[i][j];
            }
            double valorEsperado = suma / tablaDecision[i].length;
            System.out.println("Valor Esperado para " + cursosAccion[i] + ": " + valorEsperado);
            if (valorEsperado > maxValorEsperado) {
                maxValorEsperado = valorEsperado;
                mejorCurso = cursosAccion[i];
            }
        }
        System.out.println("Decisión (Método de Laplace): Se recomienda seleccionar \"" + mejorCurso + "\" como la mejor opción.");
    }

   
    public static void metodoPesimista(String[] cursosAccion, String[] estadosNaturaleza, double[][] tablaDecision) {
        double maxValorMinimo = Double.NEGATIVE_INFINITY;
        String mejorCurso = "";

        for (int i = 0; i < tablaDecision.length; i++) {
            double minValor = Double.POSITIVE_INFINITY;
            for (int j = 0; j < tablaDecision[i].length; j++) {
                minValor = Math.min(minValor, tablaDecision[i][j]);
            }
            System.out.println("Valor Mínimo para " + cursosAccion[i] + ": " + minValor);
            if (minValor > maxValorMinimo) {
                maxValorMinimo = minValor;
                mejorCurso = cursosAccion[i];
            }
        }
        System.out.println("Decisión (Método Pesimista - Wald): Se recomienda seleccionar \"" + mejorCurso + "\" como la mejor opción.");
    }

   
    public static void metodoOptimista(String[] cursosAccion, String[] estadosNaturaleza, double[][] tablaDecision) {
        double maxValorMaximo = Double.NEGATIVE_INFINITY;
        String mejorCurso = "";

        for (int i = 0; i < tablaDecision.length; i++) {
            double maxValor = Double.NEGATIVE_INFINITY;
            for (int j = 0; j < tablaDecision[i].length; j++) {
                maxValor = Math.max(maxValor, tablaDecision[i][j]);
            }
            System.out.println("Valor Máximo para " + cursosAccion[i] + ": " + maxValor);
            if (maxValor > maxValorMaximo) {
                maxValorMaximo = maxValor;
                mejorCurso = cursosAccion[i];
            }
        }
        System.out.println("Decisión (Método Optimista): Se recomienda seleccionar \"" + mejorCurso + "\" como la mejor opción.");
    }

 
    public static void metodoHurwicz(String[] cursosAccion, String[] estadosNaturaleza, double[][] tablaDecision, Scanner scanner) {
        System.out.print("Introduzca el coeficiente de optimismo (α, valor entre 0 y 1): ");
        double coeficienteOptimismo = scanner.nextDouble();

        double maxValorHurwicz = Double.NEGATIVE_INFINITY;
        String mejorCurso = "";

        for (int i = 0; i < tablaDecision.length; i++) {
            double maxValor = Double.NEGATIVE_INFINITY;
            double minValor = Double.POSITIVE_INFINITY;

            for (int j = 0; j < tablaDecision[i].length; j++) {
                maxValor = Math.max(maxValor, tablaDecision[i][j]);
                minValor = Math.min(minValor, tablaDecision[i][j]);
            }

            double valorHurwicz = coeficienteOptimismo * maxValor + (1 - coeficienteOptimismo) * minValor;
            System.out.println("Valor Hurwicz para " + cursosAccion[i] + ": " + valorHurwicz);
            if (valorHurwicz > maxValorHurwicz) {
                maxValorHurwicz = valorHurwicz;
                mejorCurso = cursosAccion[i];
            }
        }
        System.out.println("Decisión (Método Hurwicz): Se recomienda seleccionar \"" + mejorCurso + "\" como la mejor opción.");
    }

    
    public static void mostrarAyuda() {
        System.out.println("Este programa permite tomar decisiones bajo incertidumbre utilizando métodos como:");
        System.out.println("1. Método de Laplace: Asume probabilidades iguales para cada estado de la naturaleza.");
        System.out.println("2. Método Pesimista - Wald: Elige la opción con el valor mínimo más alto.");
        System.out.println("3. Método Optimista: Elige la opción con el valor máximo más alto.");
        System.out.println("4. Método Hurwicz: Combina los métodos pesimista y optimista con un coeficiente de optimismo.");
    }
}

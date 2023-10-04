package obligatorio1;

import java.util.*;

public class ClassInterfaz {

    public static void menu() {
        System.out.println("-------------------------SOLIFLIPS-------------------------");

        Scanner in = new Scanner(System.in);
        System.out.println("Desea Jugar?");
        String respuesta = in.nextLine();
        int opcion = 0;

        if (respuesta.toLowerCase().equals("si")) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("1)Tomar datos del archivo");
            System.out.println("2)Usar el tablero predefinido");
            System.out.println("3)Usar un tablero al azar");
            opcion = pedirEntero("\nEliga su opcion (1-3)", 1, 3);
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste tomar datos del archivo");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste el tablero predefinido");
//                    String[][] predefinido = {
//                        {" ", " ", "1", " ", "2", " ", "3", " ", "4", " ", "5", " ", "6"},
//                        {" ", "+---+---+---+---+---+---+"},
//                        {"1", "|", "|", "|", "|", "|", "-", "|", "/", "|", "|", "|", "-", "|"},
//                        {" ", "+---+---+---+---+---+---+"},
//                        {"2", "|", "-", "|", "/", "|", "/", "|", "|", "|", "-", "|", "-", "|"},
//                        {" ", "+---+---+---+---+---+---+"},
//                        {"3", "|", "-", "|", "-", "|", "|", "|", "-", "|", "/", "|", "-", "|"},
//                        {" ", "+---+---+---+---+---+---+"},
//                        {"4", "|", "\\", "|", "-", "|", "|", "|", "\\", "|", "|", "|", "|", "|"},
//                        {" ", "+---+---+---+---+---+---+"},
//                        {"5", "|", "\\", "|", "/", "|", "/", "|", "|", "|", "/", "|", "\\", "|"},
//                        {" ", "+---+---+---+---+---+---+"}};
//                    mostrarTableroPredefinido(predefinido);
                    TableroAzar tablero = new TableroAzar();
                    System.out.println(tablero);
                    jugar();
                    break;
                case 3:
                    System.out.println("Seleccionaste el tablero al azar");
                    int filas = pedirEntero("\nEliga la cantidad de filas del tablero: ", 3, 9);
                    int columnas = pedirEntero("\nEliga la cantidad de columnas del tablero: ", 3, 9);
                    int nivel = pedirEntero("\nEliga el nivel del juego: ", 1, 8);
                    jugar();
                    break;
            }
        } else {
            System.out.println("Â¡Hasta luego!");
        }

    }

    public static int pedirEntero(String mensaje, int minimo, int maximo) {
        Scanner in = new Scanner(System.in);
        int dato = 0;
        boolean ok = false;

        while (!ok) {
            try {
                System.out.print(mensaje);
                dato = in.nextInt();
                in.nextLine();
                if (dato >= minimo && dato <= maximo) {
                    ok = true;
                } else {
                    System.out.println("Valor fuera de rango (" + minimo + "-" + maximo + ")");
                }
            } catch (InputMismatchException var7) {
                System.out.println("Ingrese solo numeros");
                in.nextLine();
            }
        }

        return dato;
    }

    public static void mostrarTableroPredefinido(String[][] predefinido) {
        for (String[] row : predefinido) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void jugar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese numero de fila a cambiar");
        int fila = in.nextInt();
        System.out.println("Ingrese numero de columna a cambiar");
        int columna = in.nextInt();
        System.out.println("Ingrese el color a cambiar");
        String color = in.nextLine();
    }

    /*Codigo para calcular el tiempo de juego
      long startTime = System.currentTimeMillis();
      long endTime = System.currentTimeMillis();
      long elapsedTime = endTime - startTime;
      System.out.println("Tiempo transcurrido: " + elapsedTime + " milisegundos");}
     */
    
}

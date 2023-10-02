package obligatorio1;

import java.util.Random;

public class TableroAzar {

    // Método para generar un tablero aleatorio
    public static char[][] generarTablero(int filas, int columnas, int nivel) {
        char[][] tablero = new char[filas][columnas];
        Random random = new Random();
        char [][] predeterminado = {{'|', '|', '-', '/', '|', '-'},{'-', '/', '/', '|', '-', '-'},{'-', '-', '|', '-', '/', '-'},{'\\', '-', '|', '\\', '|', '|'},{'\\', '/', '/', '|', '/', '\\'}};
        // Inicializar el tablero con símbolos aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = obtenerSimboloAleatorio(random);
            }
        }

        // Resolver el tablero para que sea resoluble en 'nivel' pasos
        resolverTablero(tablero, nivel);

        return tablero;
    }

    // Método para obtener un símbolo aleatorio (/,\,-,|) con color aleatorio (R o A)
    private static char obtenerSimboloAleatorio(Random random) {
        char[] simbolos = {'/', '\\', '-', '|'};
        char[] colores = {'R', 'A'};

        char simbolo = simbolos[random.nextInt(simbolos.length)];
        char color = colores[random.nextInt(colores.length)];

        return simbolo == '/' || simbolo == '\\' ? color : simbolo;
    }

    // Método para resolver el tablero en un número determinado de pasos
    private static void resolverTablero(char[][] tablero, int pasos) {
        // Implementa la lógica para hacer el tablero resoluble en 'pasos' pasos
        // Puedes implementar algún algoritmo para cambiar aleatoriamente ciertos símbolos
        // mientras mantienes el tablero resoluble
        // ...
    }

    // Método para imprimir el tablero en la consola
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int nivel = 3;

        char[][] tablero = generarTablero(filas, columnas, nivel);

        System.out.println("Tablero generado:");
        imprimirTablero(tablero);
    }
}


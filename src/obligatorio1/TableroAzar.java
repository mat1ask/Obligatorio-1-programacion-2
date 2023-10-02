package obligatorio1;

import java.util.Random;

public class TableroAzar {

    private int filas;
    private int columnas;
    private int dificultad;
    private int solucion;
    private String[][] tablero;
    
    // Método para generar un tablero aleatorio
//    public static char[][] generarTablero(int filas, int columnas, int nivel) {
//        char[][] tablero = new char[filas][columnas];
//        Random random = new Random();
//        String[][] predefinido = {{"|A","-R","-R","\\R"},{"|A","/A","-R","-R","\\R"},{"-R","/A","|A","|R","/R"},{"/A","|A","-R","\\R","|A"},{"-R","-R","-R","|R","\\A"} };
//        // Inicializar el tablero con símbolos aleatorios
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                tablero[i][j] = obtenerSimboloAleatorio(random);
//            }
//        }
//
//        // Resolver el tablero para que sea resoluble en 'nivel' pasos
//        resolverTablero(tablero, nivel);
//
//        return tablero;
//    }

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
    public static void imprimirTablero(String[][] tablero) {
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

        String[][] tablero = generarTablero(filas, columnas, nivel);

        System.out.println("Tablero generado:");
        imprimirTablero(tablero);
    }
    
    public TableroAzar(int fil , int col , int dif){
        this.filas = fil;
        this.columnas = col;
        this.dificultad = dif;
        this.tablero = generarTablero(fil,col,dif);
    }
    public static String[][] generarTablero(int fila , int column , int dificul){
        String[][] tablero = new String[fila][column];
        
        Random r = new Random();
        String[] colores = {"R","A"};
        String colorAct = colores[r.nextInt(colores.length)];
        String[] simbolos = {"/", "\\", "-", "|"};
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = simbolos[r.nextInt(simbolos.length)]+colorAct;
            }
        }
        return tablero;
    }
}


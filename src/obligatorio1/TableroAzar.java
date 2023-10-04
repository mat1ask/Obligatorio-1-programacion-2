package obligatorio1;

import java.util.Random;

public class TableroAzar {

    private int filas;
    private int columnas;
    private int dificultad;
    private String solucion;
    private String[][] tablero;
    
    //Asignar el tablero predeterminado:
    public TableroAzar(){
        this.filas = 5;
        this.columnas = 6;
        this.dificultad = 3;
        this.tablero = new String[][] { {"|A" , "-R" , "-R" , "\\R" , "\\R"} , {"|A" , "/A" , "-R" , "-R" , "/R"} , {"-R" , "/A" , "|A" , "|R" , "/R"} , {"/A" , "|A" , "-R" , "\\R" , "|A"} , {"|R" , "-R" , "/R" , "|A" , "/A"} , {"-R" , "-R" , "-R" , "|R" , "\\A"} };
        this.solucion = "(4,4) (5,6) (5,4)";
    }
    
    // Método para resolver el tablero en un número determinado de pasos
    private static String resolverTablero() {
        return "0";
    }
    
    public TableroAzar(int fil , int col , int dif){
        this.filas = fil;
        this.columnas = col;
        this.dificultad = dif;
        this.tablero = generarTablero(fil,col,dif);
        this.solucion = resolverTablero();
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
    
    public String[][] coloresTablero(){
        String[] cols = {"\u001B[31m" , "\u001B[34m","\u001B[0m"};
        String[][] ret = this.tablero;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[0].length; j++) {
                if(this.tablero[i][j].charAt(1) == 'R'){
                    this.tablero[i][j] = cols[0] + ret[i][j].charAt(0) + cols[2];
                }else{
                    this.tablero[i][j] = cols[1] + ret[i][j].charAt(0) + cols[2];
                }
            }
        }
        return ret;
    }
   
    @Override
    public String toString() {
        String[][] conCol = this.coloresTablero();
        String divHoriz = "  ";
        String ret = "  ";
        for (int i = 0; i < this.columnas; i++) {
            int indice = i+1;
            ret += "  " + indice + " ";
            divHoriz += "+---";
        }
        divHoriz += "+";
        for (int i = 0; i < this.columnas; i++) {
            int indice = i+1;
            ret += "\n" + divHoriz + "\n" + indice + " " ;
            for (int j = 0; j < this.filas; j++) {
                ret+= "|" + " " + conCol[i][j] + " ";
            }
            ret += "|";
        }
            ret += "\n" + divHoriz;
        return ret.toString();
    }
}



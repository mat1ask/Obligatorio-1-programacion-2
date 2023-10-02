
package obligatorio1;

import java.util.*;

public class ClassInterfaz {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Desea Jugar?");
        String respuesta = in.nextLine();
        TableroAzar tablero;
        int opcion = 0;

        if(respuesta.toLowerCase().equals("si")){
            System.out.println("1)Tomar datos del archivo");
            System.out.println("2)Usar el tablero predefinido");
            System.out.println("3)Usar un tablero al azar");
            opcion = pedirEntero("\nEliga su opcion (1-3)",1,3);
            switch(opcion){
                case 1:
                    System.out.println("Seleccionaste tomar datos del archivo");
                break;
                case 2:
                    System.out.println("Seleccionaste el tablero predefinido");
                    char [][] predefinido = {{'|', '|', '-', '/', '|', '-'},{'-', '/', '/', '|', '-', '-'},{'-', '-', '|', '-', '/', '-'},{'\\', '-', '|', '\\', '|', '|'},{'\\', '/', '/', '|', '/', '\\'}};
                    System.out.println(predefinido);
                break;
                case 3:
                    System.out.println("Seleccionaste el tablero al azar");
                    int filas = pedirEntero("\nEliga la cantidad de filas del tablero",3,9);
                    int columnas = pedirEntero("\nEliga la cantidad de columnas del tablero",3,9);
                    int nivel = pedirEntero("\nEliga el nivel del juego",1,8);
                    tablero = new TableroAzar(filas,columnas,nivel);
                break;
            }
    
        }else {
            System.out.println("¡Hasta luego!");
        }
    }
    
    public static int pedirEntero(String mensaje, int minimo, int maximo) {
      Scanner in = new Scanner(System.in);
      int dato = 0;
      boolean ok = false;

      while(!ok) {
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
}


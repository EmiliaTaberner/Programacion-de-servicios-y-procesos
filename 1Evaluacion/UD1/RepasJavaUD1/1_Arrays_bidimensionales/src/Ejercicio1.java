import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] matriz = new String[8][8];
        String[] caracteres = {"A", "B","C","D","E","F","G","H"};
        int fila = 0, columna = 0;


        List <String> posiciones = new ArrayList<String>();

        boolean existe = false;

//        El siguiente for nos rellena la matriz
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                matriz[i][j] = String.valueOf(caracteres[i]+(j+1));
            }
        }

//      Imprimimos la matriz haciendo uso de formato en string
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%4s", matriz[i][j]);
            }
            System.out.println();
        }

        // mientras la variable existe sea false nos volverá a pedir que introduzcamos
        // la posición del alfil.
        do {
            System.out.println("\nIntroduzca la posición del alfil:");
            String alfil = sc.next().toUpperCase();

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (alfil.equals(matriz[i][j])) {
                        existe = true;
                        fila = i;
                        columna = j;
                    }
                }
            }
            if (!existe){
                System.out.println("La posición seleccionada no existe.");
            }
        }while (!existe);

        System.out.println("\nEl alfil puede moverse a las siguientes posiciones: ");

        //Variable que contiene columna para poder utilizarla en la un for sin modificar el valor de columna
        int columnaTemporl = columna;
        int columnaTemporl2 = columna;
        int columnaTemporl3 = columna;
        int columnaTemporl4 = columna;

        //Utilizaremos try catch para evitar que salte error por salirse de la matriz
        //Diagonal principal en positivo
        try{
            //recorremos las filas de la matriz sumando uno a la columna para que nos imprima uno más
            for (int i = fila; i < matriz.length; i++) {
                columnaTemporl += 1;
                System.out.printf("%4s", matriz[i+1][columnaTemporl]);
            }
        }catch(Exception e){}

        //Diagonal secundaria en negativo
        try{
            //recorremos las filas de la matriz sumando uno a la columna para que nos imprima uno más
            for (int i = fila; i < matriz.length; i++) {
                columnaTemporl2 -= 1;
                System.out.printf("%4s", matriz[i+1][columnaTemporl2]);
            }
        }catch(Exception e){}

        //Diagonal secundaria en positivo
        try {
            for (int i = fila; i < matriz.length; i--) {
                columnaTemporl3 -= 1;
                System.out.printf("%4s", matriz[i-1][columnaTemporl3]);
            }
        }catch (Exception e){}

        //Diagonal secundaria en negativo
        try {
            for (int i = fila; i < matriz.length; i--) {
                columnaTemporl4 += 1;
                System.out.printf("%4s", matriz[i-1][columnaTemporl4]);
            }
        }catch (Exception e){}
    }
}

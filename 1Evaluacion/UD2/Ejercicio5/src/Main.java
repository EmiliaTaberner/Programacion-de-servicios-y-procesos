import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int coches = 0;
        Scanner sc = new Scanner(System.in);

        while (coches == 0) {
            try {
                System.out.print("Introduzca numero de coches a competir:");
                    coches = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                coches = 0;
                System.out.println("El valor introducido es inválido.");
            }
        }



        int contador = 1;
        String marca = "";

        ArrayList <Coche> listaCoches = new ArrayList<>();

        while (contador <= coches) {
            try {
                System.out.print("Introduzca marca del coche "+contador+":");
                    marca = sc.nextLine();

                listaCoches.add(new Coche(contador, marca));
                System.out.println("Coche creado:" +marca+"("+contador+")");
            } catch (Exception e) {
                coches = 0;
                System.out.println("El valor introducido es inválido.");
            }finally {
                contador++;
            }
        }

        for (int i = 0; i < listaCoches.size(); i++) {
            listaCoches.get(i).start();
        }
        System.out.println("Que empiece la carrera!");


        for (int i = 0; i < listaCoches.size(); i++) {
            try {
                listaCoches.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
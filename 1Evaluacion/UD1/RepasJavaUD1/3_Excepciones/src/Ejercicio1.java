import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("Por favor, vaya introduciendo números enteros: (Para parar introduzca el número -1)");

        do {
            try {
                System.out.print("N: ");
                n = sc.nextInt();
                if (n != -1) {
                    System.out.println("Número introducido: " + n);
                }
            } catch (Exception e) {
                sc.next();
                System.out.println("El dato introducido no es correcto, debe ser un número entero.\n" +
                        "Por favor, inténtelo de nuevo.");
            }
        } while (n != -1);

        System.out.println("Programa finalizado.");
    }
}
import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Lanzador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Introduzca el número desde el que comenzará a sumar:");
            numero1 = sc.nextInt();

        System.out.println("Introduzca el número hasta el que sumará:");
            numero2 = sc.nextInt();

        String directorio = System.getProperty("user.dir");
        ProcessBuilder processBuilder = new ProcessBuilder("java", "Sumador",
                String.valueOf(numero1), String.valueOf(numero2));

        File directory = new File(directorio + "/out/production/Ejercicio7");
        System.out.println(directory);
        processBuilder.directory(directory);

        try{
            Process process = processBuilder.start();

            InputStream is = process.getInputStream();
            int c;

            while ((c = is.read()) != -1){
                System.out.print((char) c);
            }

            is.close();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
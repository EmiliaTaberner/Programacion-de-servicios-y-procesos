import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class LanzadorPalindroma {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String cadena = " ";
        boolean salir = false;

        do {
            System.out.println("Introduzca una cadena para saber si es palíndroma: (Para finalizar el programa escriba: Salir o S)");
            cadena = sc.nextLine();
            if (cadena.equalsIgnoreCase("salir") || cadena.equalsIgnoreCase("s")) {
                salir = true;
            }else {
                String directorio = System.getProperty("user.dir");
                ProcessBuilder processBuilder = new ProcessBuilder("java", "CadenaPalindroma", cadena);
                File directory = new File(directorio + "/out/production/Ejercicio8");
                processBuilder.directory(directory);
                Process process = processBuilder.start();

                OutputStream os = process.getOutputStream();
                os.write(cadena.getBytes());

                try {
                    InputStream is = process.getInputStream();
                    int c;

                    while ((c = is.read()) != -1) {
                        System.out.print((char) c);
                    }

                    is.close();

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }while (!salir);

    }
}

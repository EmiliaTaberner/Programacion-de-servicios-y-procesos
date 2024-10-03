import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class LanzadorMayusculas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena para convertirla a mayúsculas: ");
        String cadena = sc.nextLine();

        String directorio = System.getProperty("user.dir");
        ProcessBuilder processBuilder = new ProcessBuilder("java", "CadenaMayusculas", cadena);
        File directory = new File(directorio + "/out/production/Ejercicio8");
        processBuilder.directory(directory);
        Process process = processBuilder.start();

        OutputStream os = process.getOutputStream();
        os.write(cadena.getBytes());
        os.flush();

        try {
            InputStream is = process.getInputStream();
            int c;

            while ((c = is.read()) != -1){
                System.out.print((char)c);
            }
            is.close();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

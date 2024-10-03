import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ProcessListPNG {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la ruta para mostrar una lista de todas las imágenes PNG encontradas en ella: ");
        String directory = sc.nextLine();

        // Crear un proceso para listar solo los archivos PNG
        ProcessBuilder process = new ProcessBuilder("bash", "-c", "ls " + directory + " /*.jpg" );

        try {
            Process proc = process.start();
            InputStream is = proc.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Error al intentar listar los archivos PNG.");
            e.printStackTrace();
        }
    }


}

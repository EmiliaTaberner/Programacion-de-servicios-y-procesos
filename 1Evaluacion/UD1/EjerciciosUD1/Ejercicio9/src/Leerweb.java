import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class Leerweb {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 1, 2 o 3 páginas web en la misma línea diferenciándolas por un @" +
                "\n como por ejemplo: www.uv.es@www.uji.es@www.ua.es:");

        String cadena = sc.nextLine();
//        String cadena = "www.uv.es@www.uji.es@www.ua.es";

//        String directorio = System.getProperty("user.dir");
//        System.out.println("Directorio actual: " + directorio);

        String directorio = "E:\\PSP\\1Evaluacion\\1Evaluacion\\UD1\\EjerciciosUD1\\Ejercicio9\\out\\production\\Ejercicio9";
//
        File directory = new File(directorio);

        if (!directory.exists()) {
            System.out.println("Error: El directorio no existe. Verifica la ruta.");
            return;  // Detenemos la ejecución si no se encuentra el directorio
        }

        //E:\PSP\1Evaluacion\1Evaluacion\UD1\EjerciciosUD1\Ejercicio9\out\production\Ejercicio9\Visitaweb.class
        ProcessBuilder processBuilder = new ProcessBuilder("java", "Visitaweb", cadena);
        processBuilder.directory(directory);

        try{
        Process process = processBuilder.start();
        System.out.println("Proceso iniciado...");

        //Verificación de errores
        InputStream salida = process.getInputStream();
        int fila;
        while ((fila = salida.read()) != -1) {
            System.out.print((char) fila);
        }
        salida.close();

        int exitCode = process.waitFor();
        if (exitCode == 0){

        }else {
            System.out.println("El proceso terminó con errores. Código de salida: " + exitCode);
        }
        }catch (IOException | InterruptedException e){
            System.out.println("Ocurrió un error al intentar ejecutar la clase Visitaweb.");
            e.printStackTrace();
        }
        System.out.println("Finalizando el programa.");
    }
}

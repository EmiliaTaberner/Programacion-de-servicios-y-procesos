import java.io.*;

public class CadenaPalindroma {
    public static void main(String[] args) throws IOException {
        String cadena = args[0];
        boolean palindroma = isPalindroma(cadena);
        escribirEnArchivo("E:\\PSP\\1 Evaluacion\\1Evaluacion\\UD1\\EjerciciosUD1\\Ejercicio8\\todas.txt", cadena);

        if (palindroma){
            System.out.println("La cadena "+cadena+" es palíndroma");
            escribirEnArchivo("E:\\PSP\\1 Evaluacion\\1Evaluacion\\UD1\\EjerciciosUD1\\Ejercicio8\\palindromo.txt", cadena);

        }else {
            System.out.println("La cadena "+cadena+" no es palíndroma");
            escribirEnArchivo("E:\\PSP\\1 Evaluacion\\1Evaluacion\\UD1\\EjerciciosUD1\\Ejercicio8\\Nopalindromo.txt", cadena);

        }
    }

    private static void escribirEnArchivo(String nombreArchivo, String cadena) throws IOException {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        if (archivo.canWrite()) {
            BufferedWriter write = new BufferedWriter(new FileWriter(archivo, true)); // 'true' para modo append
            write.write(cadena);
            write.newLine();  // Para escribir en nueva línea
            write.flush();
            write.close();
        } else {
            System.out.println("No se puede escribir en el archivo " + nombreArchivo);
        }
    }
    private static boolean isPalindroma(String cadena) {
        String cadenaConvertida = "";

        cadena = cadena.strip().toLowerCase();
        int finalCadena = cadena.length();

        for (int i = finalCadena-1; 0 <= i ; i--) {
            cadenaConvertida += cadena.charAt(i);
        }

        if (cadenaConvertida.equals(cadena)) {
            return true;
        }
        return false;
    }
}

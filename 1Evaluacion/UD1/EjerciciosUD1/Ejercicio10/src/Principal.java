import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File directorio = new File("E:\\PSP\\1Evaluacion\\1Evaluacion\\UD1\\EjerciciosUD1\\Ejercicio10\\out\\production\\Ejercicio10");

        int intentos = 0;
        boolean emailValido = false;

        while (intentos < 3 && !emailValido) {
            System.out.println("Introduzca un e-mail válido con: mínimo 3 caracteres iniciales, @ y un dominio válido (.org, .es, .com):");
            String email = sc.nextLine();

            ProcessBuilder pb = new ProcessBuilder("java", "ValidaMail");
            pb.directory(directorio);

            Process proceso = pb.start();

            // Enviar el email al proceso ValidaMail
            OutputStream os = proceso.getOutputStream();
            os.write(email.getBytes());
            os.flush();
            os.close();

            // Leer la salida estándar del proceso ValidaMail (incluirá tanto errores como resultados)
            InputStream is = proceso.getInputStream();
            StringBuilder respuesta = new StringBuilder();
            int c;

            while ((c = is.read()) != -1) {
                respuesta.append((char) c);
            }
            is.close();

            // Comprobar la respuesta
            String resultado = respuesta.toString().trim();

            if (resultado.equals("true")) {
                System.out.println("Felicidades!! E-mail válido.");
                emailValido = true;
            } else {
                System.out.println(resultado);  // Mostrar mensaje de error desde ValidaMail
                intentos++;
                if (intentos == 3) {
                    System.out.println("ERROR: Has superado el número máximo de intentos.");
                }
            }
        }
    }
}

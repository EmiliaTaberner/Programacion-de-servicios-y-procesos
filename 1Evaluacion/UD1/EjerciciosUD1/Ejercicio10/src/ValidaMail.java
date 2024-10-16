import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ValidaMail {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String email = br.readLine();
            br.close();

            if (esEmailValido(email)) {
                System.out.println("true");  // Email válido
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean esEmailValido(String email) {
        // 1. Verificar que contiene "@"
        if (!email.contains("@")) {
            System.out.println("ERROR: El email no contiene una @!");
            return false;
        }

        String[] partes = email.split("@");

        // 2. Verificar que hay un segundo identificador después de "@"
        if (partes.length != 2 || partes[1].isEmpty()) {
            System.out.println("ERROR: No existe segundo identificador!");
            return false;
        }

        // 3. Verificar que el primer identificador tiene al menos 3 caracteres
        if (partes[0].length() < 3) {
            System.out.println("ERROR: El primer identificador ha de tener una longitud mínima de 3 caracteres!");
            return false;
        }

        // 4. Verificar que el dominio es válido (".com", ".es", ".org")
        if (!tieneDominioValido(partes[1])) {
            System.out.println("ERROR: El dominio no es ni com/es/org!");
            return false;
        }

        return true;
    }

    public static boolean tieneDominioValido(String dominio) {
        String[] dominioPartes = dominio.split("\\.");
        if (dominioPartes.length < 2) {
            return false;
        }

        String extension = dominioPartes[dominioPartes.length - 1];
        return extension.equals("com") || extension.equals("es") || extension.equals("org");
    }
}

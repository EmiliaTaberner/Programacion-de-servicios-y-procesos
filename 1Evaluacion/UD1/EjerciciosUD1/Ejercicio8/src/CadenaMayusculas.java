public class CadenaMayusculas {
    public static void main(String[] args) {
        String cadena = args[0];
//     String cadena = "hola";

        System.out.println("La palabra '"+cadena+ "' en mayúsculas es: '" +conversion(cadena)+"'.");
    }

    public static String conversion(String cadena) {
        return cadena.toUpperCase();
    }
}
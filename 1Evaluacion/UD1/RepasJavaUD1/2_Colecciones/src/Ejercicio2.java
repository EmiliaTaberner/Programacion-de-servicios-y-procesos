import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Para acotar la busqueda de numeros tenemos que sumar a la diferencia del máximo y el minimo en codigo
        //queremos poner 21 para que llegue hasta el 20, a este le restamos 10 que es el minimo y nos da 11.
        // el máximo es la diferencia.

        int longitud = (int) (Math.random() * 11+10);

        ArrayList <Integer> lista = new ArrayList<>();

        //para anyadir al arraylist la cantidad de longitud ponemos el parámetro en el for para acotar.
        for (int i = 0; i < longitud; i++) {
            lista.add((int)(Math.random() * 101));
        }

        System.out.println("La lista es la siguiente:");
        for (int numero: lista ){
            System.out.printf("%5s", numero);
        }
        System.out.println();

        int suma = lista.stream().mapToInt(a1 -> a1).sum();

        double media = Math.round(lista.stream().mapToDouble(a1 -> a1).average().getAsDouble() *100d)/100d;

        //el mapToInteger convierte cada elemento que coge el stream en int usando el Integer:intValue,
        //pasando los Integers de la lista a int, simula un paseInt. Y para que nos devuleva un int con el max
        //utilizamos el getAssInt. Sobreentendemos que la lista no está vacía.
        int maximo = lista.stream().mapToInt(Integer::intValue).max().getAsInt();

        //forma más práctica es la siguiente:
        //int maxim = (int)lista.stream().mapToInt(a1 -> a1).max().getAsInt();
        int minimo = lista.stream().mapToInt(Integer::intValue).min().getAsInt();


        System.out.println("\nLa suma de la lista es: "+suma+
                "\nLa media de la lista es: "+media+
                "\nEl máximo de la lista es: "+maximo+
                "\nEl mínimo de la lista es: "+minimo);
    }
}


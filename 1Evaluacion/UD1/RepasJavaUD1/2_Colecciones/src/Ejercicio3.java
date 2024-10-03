import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("ph");
        lista.add("java");
        lista.add("c");
        lista.add("c++");
        lista.add("c#");
        lista.add("javascript");
        lista.add("python");
        lista.add("pascal");
        lista.add("SQL");
        lista.add("Ruby");

        System.out.println("Lista original: "+lista);

        Collections.sort(lista);

        System.out.println("Lista ordenada alfabéticamente: " + lista);
    }
}

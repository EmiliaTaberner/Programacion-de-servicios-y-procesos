import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> companyeros = new ArrayList<String>();

        companyeros.add("Alejandro");
        companyeros.add("Pruden");
        companyeros.add("Nacho");
        companyeros.add("Enrique");
        companyeros.add("Raúl");
        companyeros.add("Iván");

        System.out.println("El listado de compañeros es:");
        for (String companyero : companyeros){
            System.out.println(companyero);
        }

    }
}


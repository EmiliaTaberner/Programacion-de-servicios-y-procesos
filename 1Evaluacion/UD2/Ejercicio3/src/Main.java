public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(400);

        SacarDinero ana = new SacarDinero("Ana", cuenta);
        SacarDinero juan = new SacarDinero("Juan", cuenta);
        SacarDinero melisa = new SacarDinero("Melisa", cuenta);

        ana.start();
        juan.start();
        melisa.start();

    }
}
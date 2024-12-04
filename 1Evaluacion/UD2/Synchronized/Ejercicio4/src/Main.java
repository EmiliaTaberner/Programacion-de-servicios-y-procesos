public class Main {
    public static void main(String[] args) {
        int limite = 5;
        DatoCompartido datoCompartido = new DatoCompartido(limite);

        Productor productor = new Productor(datoCompartido);
        Consumidor consumidor = new Consumidor(datoCompartido);

        productor.start();
        consumidor.start();
    }
}
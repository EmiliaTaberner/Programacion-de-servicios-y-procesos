public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo[] hilos = new Hilo[10];

        for (int i = 1; i < hilos.length; i++) {
            hilos[i] = new Hilo(i);
        }
        for (int i = 1; i < hilos.length; i++) {
            hilos[i].start();
        }
        for (int i = 1; i < hilos.length ; i++) {
            hilos[i].join();
        }
        System.out.println("Total entradas vendidas: " + Hilo.entradasVendidas);
    }
}
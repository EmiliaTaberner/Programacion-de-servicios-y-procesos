public class Productor extends Thread{
    private final DatoCompartido datoCompartido;

    public Productor(DatoCompartido datoCompartido) {
        this.datoCompartido = datoCompartido;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                datoCompartido.poner(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

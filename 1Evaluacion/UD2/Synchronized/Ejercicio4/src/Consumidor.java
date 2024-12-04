public class Consumidor extends Thread{
    private final DatoCompartido datoCompartido;

    public Consumidor(DatoCompartido datoCompartido){
        this.datoCompartido = datoCompartido;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i <= 10; i++){
                datoCompartido.obtener();
                Thread.sleep(100);
            }
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

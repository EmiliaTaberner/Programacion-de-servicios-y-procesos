public class Hilo extends Thread{
    private int entradas;
    static int entradasDisponible = 100;
    static int entradasVendidas = 0;
    int clienteId;

    public Hilo(int clienteId) {
        this.clienteId = clienteId;
        entradas = (int)(Math.random()*11);
    }

    @Override
    public void run() {
        reservaEntradas();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void reservaEntradas(){
        if (entradasDisponible >= entradas) {
            entradasDisponible -= entradas;
            entradasVendidas += entradas;
            System.out.println(entradas+ " reservadas para Cliente " + clienteId);
        }else {
            System.out.println("No quedan entradas suficientes.");
        }

    }
}

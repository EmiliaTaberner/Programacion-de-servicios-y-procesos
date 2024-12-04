public class Seca extends Thread{
    int numero;
    PilaPlatos pilaPlatos;
    public Seca(int numero, PilaPlatos pilaPlatos){
        this.numero = numero;
        this.pilaPlatos = pilaPlatos;
    }

    @Override
    public void run() {
        for (int i = 1; i <= numero; i++) {
            try {
                pilaPlatos.secar();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Error en el hilo Seca: " + e.getMessage());
            }
        }
    }
}

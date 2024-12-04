public class Friega extends Thread{
    int numero;
    PilaPlatos pilaPlatos;
    public Friega(int numero, PilaPlatos pilaPlatos){
        this.numero = numero;
        this.pilaPlatos = pilaPlatos;
    }

    @Override
    public void run() {
        for (int i = 1; i <= numero; i++) {
            try {
                Plato plato = new Plato(i);
                pilaPlatos.lavar(plato);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.err.println("Error en el hilo Friega: " + e.getMessage());
            }
        }
    }
}

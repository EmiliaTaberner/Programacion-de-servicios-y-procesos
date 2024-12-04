import java.util.ArrayList;

public class PilaPlatos {
    private final int MAXIMOPLATOS = 5;
    ArrayList <Plato> pila = new ArrayList<>();

    Plato plato;

    public void lavar(Plato plato){
        synchronized (this){
            while (pila.size() == MAXIMOPLATOS) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            pila.add(plato);
            System.out.println("Lavado plato #" + plato.numeroPlato + ". Pila: " + pila.size());
            notifyAll();
        }
    }
    public Plato secar(){
        synchronized(this) {
            while (pila.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Plato plato = pila.remove(pila.size() - 1);
            System.out.println("Secado plato #" + plato.numeroPlato + ". Pila: " + pila.size());
            notifyAll();
            return plato;
        }
    }

}

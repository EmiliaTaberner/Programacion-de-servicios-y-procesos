import java.util.ArrayList;

public class DatoCompartido {
    int limite;
    int dato;
    ArrayList<Integer> datos = new ArrayList<>();
    public DatoCompartido(int limite) {
        this.limite = limite;
    }

    public int obtener(){
        synchronized (this) {
            while (datos.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            dato = datos.remove(0);
            System.out.println("Obtener(" + dato + ")");
            notifyAll();
            return dato;
        }
    }

    public void poner(int nuevoDato){
        synchronized (this) {
            while (datos.size() == limite) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            datos.add(nuevoDato);
            System.out.println("Poner(" + nuevoDato + ")");
            notifyAll();
            dato = nuevoDato;
        }
    }
}

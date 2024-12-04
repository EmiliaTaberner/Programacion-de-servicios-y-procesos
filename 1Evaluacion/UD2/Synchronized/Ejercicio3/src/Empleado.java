public class Empleado extends Thread{
    public static Saludo saludo;
    boolean esJefe;
    static boolean haLlegadoJefe;

    public Empleado(String nombre, Saludo saludo, boolean esJefe) {
        super(nombre);
        this.saludo = saludo;
        this.esJefe = esJefe;
    }

    @Override
    public void run() {
        synchronized (saludo) {
            if (esJefe) {
                saludo.saludoJefe(getName());
                haLlegadoJefe = true;
                saludo.notifyAll();
            } else {
                while (!haLlegadoJefe) {
                    System.out.println("Empleado " + getName() + " ha llegado.");
                    try {
                        saludo.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (haLlegadoJefe) {
                    saludo.saludoEmpleado(getName());
                }
            }
        }


    }
}

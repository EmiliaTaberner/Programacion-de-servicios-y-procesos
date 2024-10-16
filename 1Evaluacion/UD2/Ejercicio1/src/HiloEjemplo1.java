public class HiloEjemplo1 {


    public static void main(String[] args) {
        Hilo a = new Hilo("Hilo 1");
        Hilo b = new Hilo("Hilo 2");
        Hilo c = new Hilo("Hilo 3");
        a.start();
        b.start();
        c.start();
        System.out.println("3 HILOS INICIADOS...y finalizados");
    }

}

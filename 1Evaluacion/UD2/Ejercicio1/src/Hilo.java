public class Hilo extends Thread{

    public Hilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("CREANDO HILO:" + getName());

        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo: " + getName() + " = " + i);
        }
    }


}

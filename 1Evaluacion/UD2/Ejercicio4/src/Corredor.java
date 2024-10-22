public class Corredor extends Thread{
    public Corredor(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1500; i++) {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("El corredor "+getName()+" ha terminado");
    }
}

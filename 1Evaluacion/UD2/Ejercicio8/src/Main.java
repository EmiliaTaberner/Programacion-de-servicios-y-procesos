public class Main {
    public static void main(String[] args) {
        
        Thread pares = new Thread(()->{
            for (int i = 0; i <= 50; i+=2) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Número par ---> "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread impares = new Thread(()->{
            for (int i = 1; i <= 50; i+=2) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Número impar ---> "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        pares.start();
        impares.start();

        try {
            pares.join();
            impares.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
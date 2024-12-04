public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(0);

        Thread incrementa = new Thread(() -> {
            while (contador.getValor() != 100) {
                contador.incrementar();
                System.out.println("Incrementado: "+contador.getValor());
            }
        });

        Thread decrementa = new Thread(() -> {
            while (contador.getValor() != 100) {
                contador.decrementar();
                System.out.println("Decrementado: "+contador.getValor());
            }
        });

        incrementa.start();
        decrementa.start();

        try {
            incrementa.join();
            decrementa.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final del contador: " + contador.getValor());
    }
}

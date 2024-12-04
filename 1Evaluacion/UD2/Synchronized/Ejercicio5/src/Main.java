public class Main {
    public static void main(String[] args) {
        PilaPlatos pilaPlatos = new PilaPlatos();
        int numeroPlatos = 20;

        Friega fregar = new Friega(numeroPlatos, pilaPlatos);
        Seca secar = new Seca(numeroPlatos, pilaPlatos);

        fregar.start();
        secar.start();

        try {
            fregar.join();
            secar.join();
        } catch (InterruptedException e) {
            System.err.println("Error principal: " + e.getMessage());
        }

        System.out.println("Todos los platos han sido lavados y secados.");


    }
}
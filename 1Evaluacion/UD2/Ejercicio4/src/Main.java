public class Main {
    public static void main(String[] args) {
        String[] corredores = { "Hicham El Guerrouj", "Noah Ngeny", "Mohamed Farah", "Bernard Lagat",
                "Rashid Ramzi", "Ryan Gregson", "Fermín Cacho", "Teddy Flack" };

        Corredor[] hilos = new Corredor[corredores.length];

        for (int i = 0; i < 8; i++) {
            hilos[i] = new Corredor(corredores[i]);
            hilos[i].start();
        }
        System.out.println("La carrera ha comenzado...");

        for (int i = 0; i < 8; i++) {
            try {
                hilos[i].join();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
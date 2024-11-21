import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número de virus a cargar...");
        int numeroVirus = sc.nextInt();
        sc.close();

        for (int i = 1; i <= numeroVirus; i++) {
            int idVirus = i;
            Thread virus = new Thread(() -> { cargaVirus(idVirus); });
            virus.start();
            virus.join();
        }
        System.out.println("HAS SIDO INFECTADO!");
    }
    public static void cargaVirus(int idVirus){
        int barra = 0;
        System.out.print("Virus"+idVirus+": ");
        while (barra < 100){
            //ThreadLocalRandom.current(): obtiene una instancia de ThreadLocalRandom, clase que permite generar números
            // aleatorios en un entorno multi-hilo de forma eficiente.

            //nextInt(0, 2) -> número aleatorio de 0 a 1.
            int aumento = ThreadLocalRandom.current().nextInt(0, 2);

            if(barra > 100){
                barra = 100;
            }

            if (aumento == 0 && barra < 100){
                barra += 5;
                System.out.print("X");
            }else if (aumento == 1 && barra < 95){
                barra += 10;
                System.out.print("XX");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(" 100%\n");



    }
}
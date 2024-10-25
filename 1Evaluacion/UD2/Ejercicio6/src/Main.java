import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File[] archivos = {new File("primeros.txt"), new File("segundos.txt"), new File("postres.txt")};

        for (int i = 0; i < archivos.length; i++) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivos[i], false));
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Hilo primeros = new Hilo("Hilo 1");
        Hilo segundos = new Hilo("Hilo 2");
        Hilo postres = new Hilo("Hilo 3");

        primeros.start();
        segundos.start();
        postres.start();

    }
}

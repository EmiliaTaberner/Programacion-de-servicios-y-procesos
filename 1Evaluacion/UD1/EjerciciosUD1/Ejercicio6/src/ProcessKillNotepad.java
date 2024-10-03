import java.io.IOException;
import java.io.InputStream;

public class ProcessKillNotepad {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder processBuilder = new ProcessBuilder("notepad");

        try {
            Process process = processBuilder.start();

            Thread.sleep(10000);

            process.destroy();
            System.out.println("Proceso terminado tras 10 segundos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Visitaweb {
    public static void main(String[] args) throws IOException {

        String cadena = args[0];

        String[] webs = cadena.split("@");

        Process p;

        switch (webs.length){
            case 1:
                p = new ProcessBuilder("cmd", "/c", "start", "chrome"
                        , webs[0]).start();
                break;
            case 2:
                p = new ProcessBuilder("cmd", "/c", "start", "chrome"
                        , webs[0], webs[1]).start();
                break;
            case 3:
                p = new ProcessBuilder("cmd", "/c", "start", "chrome"
                        , webs[0], webs[1], webs[2]).start();
                break;
            default:
                System.out.println("Error, demasiadas web!! Máximo 3 webs permitidas.");
                break;
        }

    }
}

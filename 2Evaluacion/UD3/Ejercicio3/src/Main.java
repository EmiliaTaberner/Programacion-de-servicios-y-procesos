import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        URL url=null;

        try { url=new
                URL("https://www.elmundo.es/");
        } catch (MalformedURLException e) { }

        BufferedReader in;

        try {
            InputStream is = url.openStream();
            in=new BufferedReader(new InputStreamReader(is));
            boolean h2Check = false;
            String inputLine = "";

            StringBuilder content = new StringBuilder();

            // Usaremos un patrón regex para encontrar el contenido dentro de las etiquetas <h2>
            Pattern pattern = Pattern.compile("<h2[^>]*>(.*?)</h2>", Pattern.DOTALL);

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }

            Matcher matcher = pattern.matcher(content.toString());
            while (matcher.find()) {
                System.out.println(matcher.group(1).trim());
            }

//            while((inputLine=in.readLine()) != null){
//                if (inputLine.startsWith("<h2")) {
//                    h2Check = true;
//                }
//
//                if (h2Check){
//                    System.out.println(inputLine);
//                }
//                if (inputLine.endsWith("</h2>")){
//                    h2Check = false;
//                }
//            }

            in.close();
            is.close();

        } catch (IOException e) {  }
    }
}
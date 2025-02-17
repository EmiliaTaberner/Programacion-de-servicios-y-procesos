import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GeneradorSuperheroes {

    public static void main(String[] args) {
        List<String[]> marvelHeroes = new ArrayList<>();
        List<String[]> dcHeroes = new ArrayList<>();

        String marvel = "marvel.html";
        String archivo = "superheroes.txt";
        String dc = "dcweb.html";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 4) {
                    if (data[0].startsWith("M")) {
                        marvelHeroes.add(data);
                    } else if (data[0].startsWith("D")) {
                        dcHeroes.add(data);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        generateHtml(marvel, "Héroes de Marvel", marvelHeroes);
        generateHtml(dc, "Héroes de DC", dcHeroes);

    }

    private static void generateHtml(String fileName, String title, List<String[]> heroes) {
        String imagen = "http://mural.uv.es/franpevi/index.html";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("<html><head><title>" + title + "</title></head><body>");
            writer.write("<h1>" + title + "</h1>");
            writer.write("<table border='1'>");
            writer.write("<tr><th>Nombre</th><th>Identidad Secreta</th><th>Descripción</th><th>Imagen</th></tr>");

            for (String[] hero : heroes) {
                String imgUrl = fetchImageUrl(hero[0], imagen);
                writer.write("<tr>");
                writer.write("<td>" + hero[1] + "</td>");
                writer.write("<td>" + hero[2] + "</td>");
                writer.write("<td>" + hero[3] + "</td>");
                writer.write("<td><img src='" + imgUrl + "' width='100'></td>");
                writer.write("</tr>");
            }

            writer.write("</table></body></html>");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo HTML: " + e.getMessage());
        }
    }

    private static String fetchImageUrl(String heroId, String img) {
        try {
            URL url = new URL(img);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("class=\"" + heroId + "\"")) {
                    int startIndex = line.indexOf("src=\"") + 5;
                    int endIndex = line.indexOf("\"", startIndex);
                    return line.substring(startIndex, endIndex);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al obtener la imagen de " + heroId + ": " + e.getMessage());
        }
        return "";
    }
}

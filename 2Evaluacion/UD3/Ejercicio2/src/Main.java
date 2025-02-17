import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String link = "http://docs.oracle.com/";

        try {
            System.out.println("Método 1:");
            URL url = new URL(link);

            System.out.println("URL completa: "+link);
            System.out.println("getProtocol: "+url.getProtocol());
            System.out.println("getHost: "+url.getHost());
            System.out.println("getPort: "+url.getPort());
            System.out.println("getFile: "+url.getFile());
            System.out.println("getUserInfo: "+url.getUserInfo());
            System.out.println("getPath: "+url.getPath());
            System.out.println("getAuthority(): "+url.getAuthority());
            System.out.println("getQuery(): "+url.getQuery());
            System.out.println("getDefaultPort(): "+url.getDefaultPort());
            System.out.println("-----------------------------------------------------");
            System.out.println("Método 2:");
            url = new URL("http", "docs.oracle.com", "javase/23" );

            System.out.println("URL completa: "+url);
            System.out.println("getProtocol: "+url.getProtocol());
            System.out.println("getHost: "+url.getHost());
            System.out.println("getPort: "+url.getPort());
            System.out.println("getFile: "+url.getFile());
            System.out.println("getUserInfo: "+url.getUserInfo());
            System.out.println("getPath: "+url.getPath());
            System.out.println("getAuthority(): "+url.getAuthority());
            System.out.println("getQuery(): "+url.getQuery());
            System.out.println("getDefaultPort(): "+url.getDefaultPort());

            System.out.println("-----------------------------------------------------");
            System.out.println("Método 3:");
            url = new URL("http", "docs.oracle.com",123, "javase/23" );

            System.out.println("URL completa: "+url);
            System.out.println("getProtocol: "+url.getProtocol());
            System.out.println("getHost: "+url.getHost());
            System.out.println("getPort: "+url.getPort());
            System.out.println("getFile: "+url.getFile());
            System.out.println("getUserInfo: "+url.getUserInfo());
            System.out.println("getPath: "+url.getPath());
            System.out.println("getAuthority(): "+url.getAuthority());
            System.out.println("getQuery(): "+url.getQuery());
            System.out.println("getDefaultPort(): "+url.getDefaultPort());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
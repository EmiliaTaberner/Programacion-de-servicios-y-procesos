import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("SALIDA PARA LOCALHOST:");
            System.out.println("-----> Constructor getByName()");
            InetAddress objetoLocalhost = InetAddress.getByName("localhost");
            System.out.println("Método getByName(): "+objetoLocalhost);
            System.out.println("Método getHostName(): "+ objetoLocalhost.getHostName());
            System.out.println("Método toString(): "+ objetoLocalhost.toString());
            System.out.println("Método getCanonicalHostName(): "+ objetoLocalhost.getCanonicalHostName());

            System.out.println("\n-----> Constructor getLocalHost()");
            InetAddress miEquipoLan = InetAddress.getLocalHost();
            System.out.println("Método getLocalHost(): "+ miEquipoLan);
            System.out.println("Método getHostName(): "+ miEquipoLan.getHostName());
            System.out.println("Método getHostAddress(): "+ miEquipoLan.getHostAddress());
            System.out.println("Método toString(): "+ miEquipoLan.toString());
            System.out.println("Método getCanonicalHostName(): "+ miEquipoLan.getCanonicalHostName());

            System.out.println("=========================================");
            System.out.println("SALIDA PARA UNA URL:");

            InetAddress objetoWeb = InetAddress.getByName("www.google.es");
            System.out.println("Método getByName(): "+objetoWeb);
            System.out.println("Método getLocalHost(): "+miEquipoLan);
            System.out.println("Método getHostName(): "+ objetoWeb.getHostName());
            System.out.println("Método getHostAddress(): "+ objetoWeb.getHostAddress());
            System.out.println("Método toString(): "+ objetoWeb.toString());
            System.out.println("Método getCanonicalHostName(): "+ objetoWeb.getCanonicalHostName());
            System.out.println("DIRECCIONES IP PARA: www.google.es");

            InetAddress[] objetoWebParaArray = InetAddress.getAllByName("www.google.es");
            for (int i = 0; i < objetoWebParaArray.length; i++) {
                System.out.println(objetoWebParaArray[i]);
            }

            System.out.println("=========================================");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
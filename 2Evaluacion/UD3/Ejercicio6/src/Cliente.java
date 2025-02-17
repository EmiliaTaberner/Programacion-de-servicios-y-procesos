import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
//    static final String Host = "192.168.124.64";
    static final String Host = "localhost";
    static final int Puerto=2000;
    public static void main( String[] arg ) {
        try{
            Scanner sc = new Scanner(System.in);
            Socket sCliente = new Socket( Host, Puerto );

            System.out.println("Introduce un producto para añadir a la lista de la compra: ");
            String producto = sc.nextLine();

            OutputStream salida = sCliente.getOutputStream();
            DataOutputStream flujoSalida = new DataOutputStream(salida);
            flujoSalida.writeUTF(producto);
            System.out.println("Se ha enviado el producto: " + producto);

            InputStream entrada = sCliente.getInputStream();
            DataInputStream flujoEntrada = new DataInputStream(entrada);
            System.out.println("Recibido de Servidor: " + flujoEntrada.readUTF());

            sCliente.close();

        } catch( Exception e ) {
            System.out.println("Error:" +e.getMessage() );
        }
    }
}

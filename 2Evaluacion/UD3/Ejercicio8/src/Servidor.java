import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    static final int Puerto = 2000;
    public static void main( String[] arg ) {
        try {

            ServerSocket skServidor = new ServerSocket(Puerto);

            System.out.println("\nEsperando conexión del cliente...");
            Socket sCliente1 = skServidor.accept();
            System.out.println("¡Cliente conectado!");

            InputStream entrada = null;
            entrada = sCliente1.getInputStream();
            ObjectInputStream flujoEntrada = new ObjectInputStream(entrada);

            Object lista = flujoEntrada.readObject();
            System.out.println("Objeto recibido del cliente: " +lista);

            OutputStream salida = sCliente1.getOutputStream();
            DataOutputStream flujoSalida = new DataOutputStream(salida);
            flujoSalida.writeUTF("Mensaje recibido correctamente en el servidor");

            sCliente1.close();
            skServidor.close();

        } catch( Exception e ) {
            System.out.println( "Error: "+e.getMessage() );
        }
        System.out.println("Conexión cerrada.");
    }
}

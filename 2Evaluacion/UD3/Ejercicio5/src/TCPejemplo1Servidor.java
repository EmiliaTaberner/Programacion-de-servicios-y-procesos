import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPejemplo1Servidor {
    static final int Puerto = 2000; public static void main( String[] arg ) {
        try {

            ServerSocket skServidor = new ServerSocket(Puerto);

            System.out.println("\nEscuchando en el puerto "+Puerto);
            System.out.println("Escuchando al Cliente 1 ");
            Socket sCliente1 = skServidor.accept();

            InputStream recibe = sCliente1.getInputStream();
            DataInputStream flujoRecibe = new DataInputStream(recibe);
            String cadenaRecibida = flujoRecibe.readUTF();
            System.out.println("Recibiendo del cliente: " +cadenaRecibida);

            OutputStream envia = sCliente1.getOutputStream();
            DataOutputStream flujo = new DataOutputStream(envia);
            flujo.writeUTF("Hola caracola");
            System.out.println("Enviado");

            skServidor.close();

        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }
        System.out.println("Servidor cerrado. ");
    }
}

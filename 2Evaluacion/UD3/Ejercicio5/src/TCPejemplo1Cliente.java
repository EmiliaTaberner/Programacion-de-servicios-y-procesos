import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPejemplo1Cliente {
//    static final String Host = "192.168.124.64";
    static final String Host = "localhost";
    static final int Puerto=2000;
    public static void main( String[] arg ) {
        try{
            Socket sCliente = new Socket( Host, Puerto );
            InetAddress i = sCliente.getInetAddress();

            System.out.println("Host Remoto: "+i.getHostName());
            System.out.println("IP Host Remoto: "+i.getHostAddress());

            OutputStream recibe = sCliente.getOutputStream();
            DataOutputStream flujo = new DataOutputStream(recibe);
            flujo.writeUTF("Hola caracola");
            System.out.println("Enviado");

            InputStream envia = sCliente.getInputStream();
            DataInputStream flujoEnvio = new DataInputStream(envia);
            System.out.println("Recibido de Servidor: " + flujoEnvio.readUTF());


            sCliente.close();
        } catch( Exception e ) {
            System.out.println( e.getMessage() );
        }
    }
}

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Cliente {
    static final String Host = "localhost";
    static final int Puerto=2000;
    public static void main( String[] arg ) {

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Juan Pérez");
        clientes.add("María López");
        clientes.add("Carlos García");
        clientes.add("Ana Martínez");

        try{
            Socket sCliente = new Socket( Host, Puerto );

            System.out.println("Iniciando conexión con el servidor...");

            ObjectOutputStream salida = new ObjectOutputStream(sCliente.getOutputStream());
            salida.writeObject(clientes);
            System.out.println("Se ha enviado el producto: Lista de clientes." );

            InputStream entrada = sCliente.getInputStream();
            DataInputStream flujoEntrada = new DataInputStream(entrada);
            System.out.println("Objeto recibido del servidor: " + flujoEntrada.readUTF());
            System.out.println("Conexión cerrada.");
            sCliente.close();

        } catch( Exception e ) {
            System.out.println("Error:" +e.getMessage() );
        }
    }
}

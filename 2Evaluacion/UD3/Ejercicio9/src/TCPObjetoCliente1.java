import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class TCPObjetoCliente1 {
    static final String Host = "localhost";
    static final int Puerto=2000;
    public static void main( String[] arg ) {


        try{
            Socket sCliente = new Socket( Host, Puerto );

            System.out.println("Iniciando conexión con el servidor...");
            Persona persona;

            InputStream entrada = null;
            entrada = sCliente.getInputStream();

            ObjectInputStream flujoEntrada = new ObjectInputStream(entrada);
            Object object = flujoEntrada.readObject();
            System.out.println("Objeto recibido del servidor: " +object);

            if (object instanceof Persona){
                persona = (Persona)object;
                persona.setNombre("Alejandro");
                persona.setEdad(32);
                ObjectOutputStream salida = new ObjectOutputStream(sCliente.getOutputStream());
                salida.writeObject(persona);
                System.out.println("Se ha enviado: "+persona.toString() );

                InputStream entradaMensaje = sCliente.getInputStream();
                DataInputStream flujoEntradaMensaje = new DataInputStream(entradaMensaje);
                System.out.println("Mensaje del servidor: " + flujoEntradaMensaje.readUTF());
                sCliente.close();
            }



        } catch( Exception e ) {
            System.out.println("Error:" +e.getMessage() );
        }
        System.out.println("Conexión cerrada.");
    }
}

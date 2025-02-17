import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servidor {
    static final int Puerto = 2000;
    public static void main( String[] arg ) {

        Boolean salir = false;
        try {
                ServerSocket skServidor = new ServerSocket(Puerto);
                System.out.println("\nEscuchando en el puerto "+Puerto);
                Socket sCliente1 = skServidor.accept();
                System.out.println("Cliente conectado.");

            while (!salir){
                InputStream entrada = sCliente1.getInputStream();
                DataInputStream flujoEntrada = new DataInputStream(entrada);

                String producto = flujoEntrada.readUTF();
                System.out.println("Producto recibido del cliente: " +producto);

                if(producto.equalsIgnoreCase("salir")){
                    salir = true;
                    OutputStream salida = sCliente1.getOutputStream();
                    DataOutputStream flujoSalida = new DataOutputStream(salida);
                    flujoSalida.writeUTF("Salir");

                }else {
                    salir = false;

                    String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                    File nombreArchivo = new File(fecha+".txt");

                    BufferedWriter bf = new BufferedWriter(new FileWriter(nombreArchivo, true));

                    bf.write(producto+"\n");
                    bf.flush();
                    bf.close();

                    OutputStream salida = sCliente1.getOutputStream();
                    DataOutputStream flujoSalida = new DataOutputStream(salida);
                    flujoSalida.writeUTF("Se ha recibido el producto "+producto);


                    System.out.println("Producto " + producto + " almacenado en " + nombreArchivo);
                }

            }

            sCliente1.close();
            skServidor.close();

        } catch( Exception e ) {
            System.out.println( "Error: "+e.getMessage() );
        }
        System.out.println("Servidor cerrado. ");
    }
}

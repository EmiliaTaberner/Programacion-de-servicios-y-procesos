import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Servidor {

    public static void main(String[] args) {

        byte[] buffer = new byte[1024];

        System.out.println("Iniciado el servidor UDP...");
        DatagramPacket recibo = new DatagramPacket(buffer, buffer.length);

        try {
            System.out.println("Esperando mensaje...");
            DatagramSocket socketUDP = new DatagramSocket(12345);
            socketUDP.receive(recibo);
            String mensaje = new String(recibo.getData(), 0, recibo.getLength());

            System.out.println("Mensaje recibido: "+mensaje);

            String cadena = mensaje.strip();
            int cantidadLetras = cadena.length();
            System.out.println("El mensaje contiene "+cantidadLetras+" letras.");

            socketUDP.close();
            System.out.println("Servidor desconectado.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}

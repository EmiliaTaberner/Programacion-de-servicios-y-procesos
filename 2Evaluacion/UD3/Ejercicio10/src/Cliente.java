import java.io.IOException;
import java.net.*;

public class Cliente {

    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        final int puerto = 12345;
        try {
            System.out.println("Cliente esperando conexión...");
            InetAddress destino = InetAddress.getLocalHost();
            System.out.println("Cliente conectado a servidor "+destino.getHostName()+".");

            String mensaje = "Hola caracola";

            buffer = mensaje.getBytes();

            DatagramPacket envio = new DatagramPacket(buffer, buffer.length, destino, puerto);
            DatagramSocket socketUDP = new DatagramSocket(34567);
            socketUDP.send(envio);

            System.out.println("El mensaje \""+mensaje+"\" ha sido enviado.");

            socketUDP.close();
            System.out.println("Cliente desconectado.");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}

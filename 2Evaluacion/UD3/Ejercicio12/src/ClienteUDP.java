import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteUDP {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {

            socket = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 6000;


            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca una palabra en inglés: ");
            String palabra = sc.nextLine();

            byte[] bufferEnviar = palabra.getBytes();
            DatagramPacket enviado = new DatagramPacket(bufferEnviar, bufferEnviar.length, serverAddress, serverPort);
            socket.send(enviado);

            byte[] buffer = new byte[1024];
            DatagramPacket recibido = new DatagramPacket(buffer, buffer.length);

            socket.setSoTimeout(5000);

            try {
                socket.receive(recibido);
                String traduccion = new String(recibido.getData(), 0, recibido.getLength());
                if (traduccion.isEmpty()) {
                    System.out.println("No se encontró traducción.");
                } else {
                    System.out.println("Traducción: " + traduccion);
                }
            } catch (SocketTimeoutException e) {
                System.out.println("No se encontró traducción.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}


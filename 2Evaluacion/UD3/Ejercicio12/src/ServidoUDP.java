import java.net.*;
import java.util.*;

public class ServidoUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(6000);

            Map<String, String> dictionary = new HashMap<>();
            dictionary.put("hello", "hola");
            dictionary.put("world", "mundo");
            dictionary.put("dog", "perro");
            dictionary.put("cat", "gato");
            dictionary.put("food", "comida");

            System.out.println("Servidor UDP en espera...");

            boolean salir = false;

            while (!salir) {
                byte[] buffer = new byte[1024];
                DatagramPacket recibido = new DatagramPacket(buffer, buffer.length);
                socket.receive(recibido);

                if (!recibido.equals("salir")){

                    String palabra = new String(recibido.getData(), 0, recibido.getLength());

                    String traduccion = dictionary.getOrDefault(palabra, "");

                    InetAddress cliente = recibido.getAddress();
                    int clientPort = recibido.getPort();
                    byte[] sendData = traduccion.getBytes();
                    DatagramPacket enviado = new DatagramPacket(sendData, sendData.length, cliente, clientPort);
                    socket.send(enviado);
                }else {
                    salir = true;
                }

            }

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int puerto = 12345;
        InetAddress cliente = InetAddress.getLocalHost();

        boolean salir = false,error = false;
        String menu = "\n--------------------------------------------------\n" +
                "===TICKETSERVER===\nSeleccione la opción que desea realizar.\n1. Listar Butacas" +
                "\n2. Reservar butacas\n3. Anular butacas\n4. Salir";


        while (!salir){
            do {
                error = false;
                try{
                    DatagramSocket socketUDP;
                    System.out.println(menu);
                    String mensaje = sc.nextLine();
                    int opcion = 0;
                    opcion = Integer.parseInt(mensaje);
                    switch (opcion){
                        case 1:
                            socketUDP = enviarMensaje(mensaje, cliente, puerto);
                            break;
                        case 2:
                            socketUDP = enviarMensaje(mensaje, cliente, puerto);
                            System.out.println("Introduzca su nombre para la reserva:");
                            mensaje = sc.nextLine();
                            socketUDP = enviarMensaje(mensaje, cliente, puerto);
                            break;
                        case 3:
                            socketUDP = enviarMensaje(mensaje, cliente, puerto);
                            System.out.println("Introduzca su nombre para anular la reserva:");
                            mensaje = sc.nextLine();
                            socketUDP = enviarMensaje(mensaje, cliente, puerto);
                            break;
                        case 4:
                            salir = true;
                            break;
                        case 123:
                            socketUDP = enviarMensaje(mensaje, cliente, puerto);
                            byte[] buffer = new byte[1024];
                            DatagramPacket recibido = new DatagramPacket(buffer, buffer.length);

                            try (DatagramSocket socket = new DatagramSocket(123)) {
                                socket.receive(recibido);
                                mensaje = new String(recibido.getData(), 0, recibido.getLength());
                                System.out.println(mensaje);
                                socket.close();
                            } catch (IOException e) {
                                System.out.println("Error al recibir el mensaje del servidor.");
                                e.printStackTrace();
                            }

                            salir = true;
                            socketUDP.close();
                            break;
                        default:
                            System.out.println("La opción elegida no existe.");
                            error = true;
                            break;

                    }

                }catch (Exception e){
                    sc.nextLine();
                    e.getMessage();
                    System.out.println("El valor introducido no es válido.");
                    error = true;
                }
            }while (error);
        }
        System.out.println("Programa finalizado.");

    }

    private static DatagramSocket enviarMensaje(String mensaje, InetAddress cliente, int puerto) throws IOException {
        byte[] buffer = mensaje.getBytes();
        DatagramPacket envio = new DatagramPacket(buffer, buffer.length, cliente, puerto);
        DatagramSocket socketUDP = new DatagramSocket();
        socketUDP.send(envio);
        return socketUDP;
    }
}

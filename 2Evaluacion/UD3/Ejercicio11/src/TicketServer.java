import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;

public class TicketServer {
    private final int ENTRADASMAXIMAS = 4;

    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        final int puerto = 123;
        DatagramPacket recibido = new DatagramPacket(buffer, buffer.length);
        String mensaje = "";
        System.out.println("Servidor arrancado...");

        ArrayList<String> butacas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            butacas.add("LIBRE!!");
        }

        ArrayList<String> listaEspera = new ArrayList<>();
        listaEspera.add("Antonio");
        listaEspera.add("Pepe");

        llenarButacas(listaEspera, butacas);

        boolean salir = false, error = false;
        int opcion = 0;

        DatagramSocket socket = new DatagramSocket(12345);

        while (!salir) {
            do {
                error = false;
                socket.receive(recibido);
                mensaje = new String(recibido.getData(), 0, recibido.getLength());

                try {
                    switch (mensaje) {
                        case "1":
                            System.out.println("\n====BUTACAS====");
                            for (int i = 0; i < butacas.size(); i++) {
                                System.out.println(String.valueOf(i + 1) + " -> " + butacas.get(i));
                            }
                            if (listaEspera.size() > 0) {
                                System.out.println("\n====EN COLA====");
                                for (int i = 0; i < listaEspera.size(); i++) {
                                    System.out.println(String.valueOf(i + 1) + " -> " + listaEspera.get(i));
                                }
                            } else {
                                System.out.println("\nNo hay nadie esperando una butaca.\n");
                            }
                            break;

                        case "2":
                            socket.receive(recibido);
                            mensaje = new String(recibido.getData(), 0, recibido.getLength());

                            if (butacas.contains(mensaje)){
                                System.out.println(mensaje + " tiene asignada la butaca " + getButacaAsignada(butacas, mensaje));
                            } else if (listaEspera.contains(mensaje)) {
                                int posicionCola = listaEspera.indexOf(mensaje)+1;
                                System.out.println(mensaje + " está esperando butaca en la cola con la posición"
                                        + posicionCola);
                            } else {
                                listaEspera.add(mensaje);
                                if (butacas.contains("LIBRE!!")){
                                    llenarButacas(listaEspera, butacas);
                                    System.out.println("Se le ha asignado la butaca "+getButacaAsignada(butacas, mensaje)+" a" +mensaje+".");
                                }else {
                                    int posicionEspera = listaEspera.indexOf(mensaje)+1;
                                    System.out.println(mensaje+" se ha añadido a la lista de espera en la posición "+posicionEspera);
                                }
                            }
                            break;

                        case "3":
                            socket.receive(recibido);
                            mensaje = new String(recibido.getData(), 0, recibido.getLength());

                            if (butacas.contains(mensaje)){
                                int butaca = butacas.indexOf(mensaje);
                                System.out.println(mensaje+" tiene asignada la butaca " + getButacaAsignada(butacas, mensaje));
                                System.out.println("La butaca "+getButacaAsignada(butacas, mensaje)+" queda libre.");

                                if (!listaEspera.isEmpty()){
                                    System.out.println("Se le adjudica a la primera persona de la lista que " +
                                            "es: "+listaEspera.getFirst());

                                    butacas.set(butaca, listaEspera.getFirst());
                                    listaEspera.removeFirst();
                                }else {
                                    butacas.set(butaca, "LIBRE!!");
                                }
                            }else if(listaEspera.contains(mensaje)){
                                int posicionCola = listaEspera.indexOf(mensaje)+1;
                                System.out.println(mensaje+" no tiene asignada butaca, está en la cola en " +
                                        "la posición " + posicionCola);
                                listaEspera.remove((posicionCola-1));
                                System.out.println("Se ha eliminado de la cola a "+ mensaje+ "coge su posición"
                                        +listaEspera.get(posicionCola));
                            }else {
                                System.out.println(mensaje+" no tiene reserva, ni está en lista de espera.");
                            }
                            break;

                        case "123":
                            try {
                                InetAddress servidor = InetAddress.getLocalHost();
                                System.out.println(Arrays.toString(servidor.getAddress()));

                                mensaje = "MODO ROOT: Apagando el servidor desde el Cliente...";
                                buffer = mensaje.getBytes();
                                DatagramPacket envio = new DatagramPacket(buffer, buffer.length, servidor, puerto);

                                try (DatagramSocket socketUDP = new DatagramSocket()) {
                                    socketUDP.send(envio);
                                    System.out.println("Mensaje de apagado enviado al cliente.");
                                } catch (IOException e) {
                                    System.out.println("Error al enviar mensaje de apagado.");
                                    e.printStackTrace();
                                }

                                socket.close();
                                salir = true;
                                System.out.println("Servidor apagado. Cerrando servidor...");
                            } catch (Exception e) {
                                e.printStackTrace();
                                System.out.println("Error al procesar la opción 123.");
                            }
                            break;

                        default:
                            System.out.println("La opción seleccionada no existe.");
                            break;
                    }
                } catch (Exception e) {
                    e.getMessage();
                    System.out.println("El valor introducido no es válido.");
                    error = true;
                }
            } while (error);
        }
        socket.close();
    }

    private static int getButacaAsignada(ArrayList<String> butacas, String mensaje) {
        int butacaAsignada = butacas.indexOf(mensaje)+1;
        return butacaAsignada;
    }

    private static void llenarButacas(ArrayList<String> listaEspera, ArrayList<String> butacas) {
        while (!listaEspera.isEmpty() && butacas.contains("LIBRE!!")) {
            int butacaLibre = butacas.indexOf("LIBRE!!");
            butacas.set(butacaLibre, listaEspera.remove(0));
        }
    }
}

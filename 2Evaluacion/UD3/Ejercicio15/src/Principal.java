import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "SOFTWARE DE GESTIÓN DEL IBIS SPORT CLUB \n======================================= " +
                "\n1. Introducir datos de un profesional " +
                "\n2. Consulta con filtro \n" +
                "3. Listado de nombres " +
                "\n4. Salir";
        String submenu = "\nSubmenú de Consultas\n-------------------" +
                "\n1. Profesionales por género " +
                "\n2. Profesionales por tipo " +
                "\n3. Profesionales por edad " +
                "\n4. Volver";
        boolean error = false;
        boolean salir = false;
        int opcionMenuPrincipal = 0;
        ArrayList <Profesional> profesionales = new ArrayList<Profesional>();

        profesionales.add(new Profesional("Maria", 25, 'f', 2));
        profesionales.add(new Profesional("Jose", 21, 'm', 1));
        profesionales.add(new Profesional("Laura", 19, 'f', 1));
        profesionales.add(new Profesional("Lucía", 45, 'f', 2));
        profesionales.add(new Profesional("Carlos", 22, 'm', 1));
        profesionales.add(new Profesional("Rober", 32, 'm', 3));
        profesionales.add(new Profesional("Carolina", 26, 'f', 3));

        do {
            error = false;
            try {
                System.out.println(menu);
                opcionMenuPrincipal = sc.nextInt();

                switch (opcionMenuPrincipal){
                    case 1:
                        addProfesional(sc, profesionales);
                        break;
                    case 2:
                        error = isError(submenu, sc, profesionales);
                        break;
                    case 3:
                        String p =
                        profesionales.stream().map(Profesional::getNombre)
                                .collect(Collectors.joining(",","Listado de nombres:", "."));
                        System.out.println(p);
                        break;
                    case 4:
                        System.out.println("Finalizando programa...\nPrograma finalizado.");
                        salir = true;
                        break;
                    default:
                        System.out.println("La opción que ha elegido no está disponible.");
                        break;
                }


            } catch (InputMismatchException e) {
                sc.nextLine();
                error = true;
                throw new RuntimeException(e);
            }

        }while (!salir || error);
    }

    private static boolean isError(String submenu, Scanner sc, ArrayList<Profesional> profesionales) {
        boolean error;
        boolean errorAdd = false;
        boolean salirSubmenu = false;
        do {
            error = true;
            try{
                int opcionSubmenu = 0;
                System.out.println(submenu);
                opcionSubmenu = sc.nextInt();

                switch (opcionSubmenu){
                    case 1:
                        filtradoGenero(profesionales);
                        break;
                    case 2:
                        filtradoTipo(profesionales);
                        break;
                    case 3:
                        filtradoEdad(sc, profesionales);

                        break;
                    case 4:
                        salirSubmenu = true;
                        break;
                    default:
                        System.out.println("La opción que ha elegido no está disponible.");
                        break;
                }

            } catch (InputMismatchException e) {
                errorAdd = true;
                System.out.println("El valor introducido es inválido como Clarita...");
            }
        }while (errorAdd || !salirSubmenu);
        return error;
    }

    private static void filtradoEdad(Scanner sc, ArrayList<Profesional> profesionales) {
        boolean errorEdad = false;
        do {
            errorEdad = false;
            try{
                int edadMin = 0, edadMax = 0;
                System.out.println("Introduzca la edad mínima de los profesionalies que quiere visualizar:");
                edadMin = sc.nextInt();
                System.out.println("Introduzca la edad maxima de los profesionalies que quiere visualizar:");
                edadMax = sc.nextInt();
                System.out.println("\nProfesionales por edad:");

                if (edadMin > edadMax){
                    errorEdad = true;
                }else {
                    int finalEdadMin = edadMin;
                    int finalEdadMax = edadMax;
                    profesionales.stream().filter(p -> p.getEdad() >= finalEdadMin
                            && p.getEdad() <= finalEdadMax)
                            .sorted((p1,p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
                            .forEach(System.out::println);
                }

            } catch (Exception e) {
                errorEdad = true;
                sc.nextLine();
                throw new RuntimeException(e);
            }
        }while (errorEdad);
    }

    private static void filtradoTipo(ArrayList<Profesional> profesionales) {
        System.out.println("\nProfesionales por tipo de profesión:");

        System.out.println("Jugadores (1):");
        profesionales.stream().filter(p -> p.getTipoProfesional() == 1)
                .sorted((p1, p2)-> (p1.getNombre().compareTo(p2.getNombre())))
                .forEach(System.out::println);
        System.out.println("\nDirectivos (2):");
        profesionales.stream().filter(p -> p.getTipoProfesional() == 2)
                .sorted((p1, p2)-> (p1.getNombre().compareTo(p2.getNombre())))
                .forEach(System.out::println);
        System.out.println("\nFisioterapeutas (3):");
        profesionales.stream().filter(p -> p.getTipoProfesional() == 3)
                .sorted((p1, p2)-> (p1.getNombre().compareTo(p2.getNombre())))
                .forEach(System.out::println);
    }

    private static void filtradoGenero(ArrayList<Profesional> profesionales) {
        System.out.println("\nProfesionales por género:");
        System.out.println("Masculino:");
        profesionales.stream().filter(p -> p.getGenero() == 'm')
                .sorted((p1, p2) -> (p1.getNombre().compareTo(p2.getNombre())))
                .forEach(System.out::println);
        System.out.println("\nFemenino:");
        profesionales.stream().filter(p -> p.getGenero() == 'f')
                .sorted((p1, p2) -> (p1.getNombre().compareTo(p2.getNombre())))
                .forEach(System.out::println);
    }

    private static void addProfesional(Scanner sc, ArrayList<Profesional> profesionales) {
        boolean errorAdd = false;
        do {
            errorAdd = false;
            System.out.println("----------------------------------\nIntroduzca los datos solicitados:");
            String nombre = "";
            int edad = 0, tipoProfesional = 0;
            char genero = ' ';

            try{
                System.out.println("Introduzca el nombre del profesional:");
                nombre = sc.nextLine();
                sc.nextLine();

                System.out.println("Introduzca su edad:");
                edad = sc.nextInt();
                sc.nextLine();

                System.out.println("Introduzca la letro correspondiente al género ('m' -> masculino, 'f' -> femenino):");
                String generoSTR = "";
                generoSTR = sc.nextLine().toLowerCase();
                genero = generoSTR.charAt(0);

                System.out.println("Introduzca el número correspondiente al tipo de profesional:\n" +
                        "1. Jugador" +
                        "\n2. Directivo" +
                        "\n3. Fisio");
                tipoProfesional = sc.nextInt();

                profesionales.add(new Profesional(nombre, edad, genero, tipoProfesional));

            }catch (Exception e) {
                errorAdd = true;
                System.out.println("Error al introducir algun dato.");
            }
        }while (errorAdd);
    }
}

import java.io.*;

public class Hilo extends Thread{
    public Hilo(String name){
        super(name);
    }

    @Override
    public void run() {
        lecturaYEscritura();
    }

    private void lecturaYEscritura(){
        try {
            if (new File("menu.txt").exists()) {
                BufferedReader br = new BufferedReader(new FileReader(new File("menu.txt")));
                String linea;

                while ((linea = br.readLine()) != null) {
                    String primerCaracter = String.valueOf(linea.charAt(0));

                    if (primerCaracter.equals("1") && getName().equals("Hilo 1")) {
                        extraccionLecturaEscritura("PRIMEROS","primeros.txt", linea, "1-");

                    } else if (primerCaracter.equals("2") && getName().equals("Hilo 2")) {
                        extraccionLecturaEscritura("SEGUNDOS","segundos.txt", linea, "2-");

                    }else if (primerCaracter.equals("3") && getName().equals("Hilo 3")) {
                        extraccionLecturaEscritura("POSTRES","postres.txt", linea, "3-");
                    }
                }
                br.close();
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private void extraccionLecturaEscritura(String plato, String file, String linea, String regex) throws IOException {
        File archivo = new File(file);

        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        String[] palabra = linea.split(regex);

        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));

        if (!palabra[1].equals(plato)) {
            bw.write(palabra[1].trim());
            bw.newLine();
            System.out.println("El " + getName() + " escribe..." + palabra[1].trim());
        }

        bw.close();
    }
}


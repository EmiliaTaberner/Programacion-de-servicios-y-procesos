import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {


        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String datos = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        byte dataBytes[] = datos.getBytes();

        md.update(dataBytes);

        FileOutputStream fileout = new FileOutputStream("Datos.dat");
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout);

        byte resumen[] = md.digest();

        dataOS.writeObject(datos);
        dataOS.writeObject(resumen);


    }
}
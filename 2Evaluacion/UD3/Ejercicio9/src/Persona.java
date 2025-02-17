import java.io.Serializable;

public class Persona implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public Persona(int edad, String nombre) {
        setEdad(edad);
        setNombre(nombre);
    }

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

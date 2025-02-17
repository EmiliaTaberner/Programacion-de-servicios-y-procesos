import java.util.Arrays;

public class Profesional {
    private String nombre;
    private int edad;
    private char genero;
    private int tipoProfesional;
    final private char[] GENEROS = {'m', 'f'};
    final private int[] TIPOSPROFESIONAL = {1, 2, 3};
    public Profesional(String nombre, int edad, char genero, int tipoProfesional) {
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setTipoProfesional(tipoProfesional);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if (genero == GENEROS[0] || genero == GENEROS[1]){
            this.genero = genero;
        }
    }

    public int getTipoProfesional() {

        return tipoProfesional;
    }

    public String getTipo() {
        String tipo = "";
        switch (tipoProfesional){
            case 1:
                tipo = "Jugador";
                break;
            case 2:
                tipo = "Directivo";
                break;
            case 3:
                tipo ="Fisioterapeuta";

        }
        return tipo;
    }

    public void setTipoProfesional(int tipoProfesional) {
        for (int i = 1; i<=TIPOSPROFESIONAL.length; i++){
            if (tipoProfesional == i){
                this.tipoProfesional = tipoProfesional;
            }
        }
    }

    @Override
    public String toString() {
        return "Profesional: " +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", genero=" + getGenero()+
                ", tipoProfesional=" + getTipo();
    }
}

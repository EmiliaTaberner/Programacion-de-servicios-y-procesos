public class Hilo extends Thread{
    public Hilo(String name){ super(name);}

    public static int contador = 0;

    @Override
    public void run() {
        for (int i = 0; contador < 1000; i++) {
            contador++;
        }
        getContador();
    }

    public void getContador(){
        System.out.println(getName() +" ----> "+contador);
    }

}

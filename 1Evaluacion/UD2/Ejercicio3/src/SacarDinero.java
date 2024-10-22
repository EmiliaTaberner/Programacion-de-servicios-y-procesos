public class SacarDinero extends Thread{

    private Cuenta c ;

    public SacarDinero(String name, Cuenta cuenta){
        super(name);
        c = cuenta;}

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {
            c.RetirarDinero(40, getName());
        }
    }
}

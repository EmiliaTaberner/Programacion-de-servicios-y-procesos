public class Cuenta {

    private int saldo;

    public Cuenta(int saldo) {
        setSaldo(saldo);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void restar(int cantidad){
        setSaldo(getSaldo()-cantidad);
    }
    public void RetirarDinero(int cant, String nom){
        if (cant <= getSaldo()){
            restar(cant);
            System.out.println(nom+": SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo()+")");
        }else {
            System.out.println("No puede retirar dinero, NO HAY SALDO (ACTUAL ES: " + getSaldo()+")");
        }
    }
}

public class Coche extends Thread{
    private final int id;

    public Coche(int id, String name){
        super(name);
        this.id = id;
    }


    @Override
    public void run() {
        boolean terminado = false;
        int recorrido = 0;
        do {
            int random = (int)(Math.random()*100);
            recorrido += random;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (recorrido >= 500){
                terminado = true;
                System.out.println("---------------------------------------------------");
                System.out.println("El "+getName()+" ("+this.id+") ha finalizado al recorrer "+recorrido+"km.");
            }else {
                System.out.println(getName() + "(" + this.id + ") lleva recorrido " + recorrido + "km!");
            }
        }while(!terminado);
    }
}

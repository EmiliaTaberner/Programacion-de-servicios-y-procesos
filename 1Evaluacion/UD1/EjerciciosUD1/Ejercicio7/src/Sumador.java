public class Sumador {
    public static int sumadorIntervalos(int numero1, int numero2){
        int sumatorio = 0;

        if (numero1 > numero2){
            System.out.println("El primer número debe ser menor que el segundo.");
        } else if (numero1 == numero2) {
            sumatorio = numero1;
        }else {
            for (int i = numero1; i <= numero2; i++ ){
                sumatorio += i;
            }
        }

        return sumatorio;
    }

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);

        System.out.print("La suma de de los número comprendidos entre "+numero1+" y "+
                numero2+" ambos inclusive es: " + sumadorIntervalos(numero1, numero2));

    }
}

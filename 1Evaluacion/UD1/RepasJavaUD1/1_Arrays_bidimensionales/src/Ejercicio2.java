public class Ejercicio2 {
    public static void main(String[] args)  {

        int[][] num = {{0, 30, 2, 0, 0, 5},
                {75, 0, 0, 0, 0, 0},
                {0, 0, -2, 9, 0, 11}};


        for (int i = 0; i < 6; i++) {
            System.out.printf("%18s","Column "+i);
        }
        System.out.println();
        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-14s", "Fila " + i);
                for (int j = 0; j < 6; j++) {
                    System.out.printf("%-18s", num[i][j]);
                    Thread.sleep(300);
                }
                System.out.println();
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
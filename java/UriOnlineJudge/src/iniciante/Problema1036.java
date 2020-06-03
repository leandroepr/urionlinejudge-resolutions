package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 30/05/2020
 */
public class Problema1036 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();

        double Delta = Math.pow(B, 2) - 4 * A * C;

        if (A == 0 || Delta < 0) {
            System.out.println("Impossivel calcular");
            return;
        }
        double R1, R2;
        R1 = (-B + Math.sqrt(Delta)) / (2 * A);
        R2 = (-B - Math.sqrt(Delta)) / (2 * A);
        System.out.format("R1 = %.5f\n", R1);
        System.out.format("R2 = %.5f\n", R2);

    }
}

package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1002 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        double R = read.nextDouble();
        double n = 3.14159;
        double A = n * Math.pow(R,2);
        System.out.printf("A=%.4f\n",A);
    }
}

package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1006 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        double MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}

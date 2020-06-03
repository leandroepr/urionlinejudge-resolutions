package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1005 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        double A = read.nextDouble();
        double B = read.nextDouble();
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}

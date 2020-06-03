package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1011 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int raio = read.nextInt();
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}

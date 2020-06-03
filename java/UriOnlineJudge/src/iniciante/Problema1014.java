package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1014 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        int x = read.nextInt();
        float y = read.nextFloat();
        float cm = x / y;
        
        System.out.printf("%.3f km/l\n", cm);
    }
}

package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1015 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        float x1 = read.nextFloat();
        float y1 = read.nextFloat();
        float x2 = read.nextFloat();
        float y2 = read.nextFloat();
        
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.printf("%.4f\n", distancia);
    }
}

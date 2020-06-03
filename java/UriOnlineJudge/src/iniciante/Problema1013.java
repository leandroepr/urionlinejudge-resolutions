package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1013 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.printf("%d eh o maior\n", maior);
    }
}

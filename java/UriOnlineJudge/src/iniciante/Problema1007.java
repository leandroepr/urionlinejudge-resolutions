package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1007 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();
        int D = read.nextInt();
        int DIFERENCA = A * B - C * D;
        System.out.printf("DIFERENCA = %s\n",DIFERENCA);
    }
}

package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1010 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int codigoPecao1 = read.nextInt();
        int numeroPeca1 = read.nextInt();
        double valorPeca1 = read.nextDouble();
        
        int codigoPeca2 = read.nextInt();
        int numeroPeca2 = read.nextInt();
        double valorPeca2 = read.nextDouble();
        
        double total = valorPeca1 * numeroPeca1 + valorPeca2 * numeroPeca2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}

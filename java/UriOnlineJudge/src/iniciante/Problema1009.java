package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1009 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        String nome = read.nextLine();
        double salarioFixo = read.nextDouble();
        double totalDeVendasNoMes = read.nextDouble();
        double salario = salarioFixo + totalDeVendasNoMes * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", salario);
    }
}

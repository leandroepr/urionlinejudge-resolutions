package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1008 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int numeroDoFuncionario = read.nextInt();
        int numeroDeHorasTrabalhadas = read.nextInt();
        double valorQueRecebePorHora = read.nextDouble();
        double salario = numeroDeHorasTrabalhadas * valorQueRecebePorHora;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",numeroDoFuncionario, salario);
    }
}

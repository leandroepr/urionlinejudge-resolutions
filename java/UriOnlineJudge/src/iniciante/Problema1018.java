package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 29/05/2020
 */
public class Problema1018 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int valor = read.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println(valor);
        for (int nota : notas) {
            int qtd = valor / nota;
            valor = valor - qtd * nota;
            System.out.format("%d nota(s) de R$ %d,00\n", qtd, nota);
        }
    }
}

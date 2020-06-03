package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 30/05/2020
 */
public class Problema1037 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        float entrada = read.nextFloat();
        System.out.println(getClassificacaoDoIntervalo(entrada));
    }

    private static String getClassificacaoDoIntervalo(float entrada) {
        if (entrada > 0 && entrada <= 25) {
            return "Intervalo [0,25]";
        }

        if (entrada > 25 && entrada <= 50) {
            return "Intervalo (25,50]";
        }

        if (entrada > 75 && entrada <= 100) {
            return "Intervalo (75,100]";
        }

        return "Fora de intervalo";
    }
}

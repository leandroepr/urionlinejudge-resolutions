package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1017 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        int tempoGasto = read.nextInt();
        int velocidadeMedia = read.nextInt();
        double consumoDoCarroEmKmL = 12.0;
        double litrosGastos = tempoGasto * velocidadeMedia / consumoDoCarroEmKmL;
        
        System.out.printf("%.3f\n", litrosGastos);
    }
}

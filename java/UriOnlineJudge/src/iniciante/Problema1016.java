package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1016 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        int distancia = read.nextInt();        
        int tempo = distancia * 2;
        
        System.out.printf("%d minutos\n", tempo);
    }
}

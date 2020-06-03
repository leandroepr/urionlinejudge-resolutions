package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 30/05/2020
 */
public class Problema1035 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        int A = read.nextInt();
        int B = read.nextInt();
        int C = read.nextInt();
        int D = read.nextInt();

        boolean valoresAceitos = B > C
                && D > A
                && C + D > A + B
                && C > 0 && D > 0
                && A % 2 == 0;
        
        String mensagem = valoresAceitos ? "Valores aceitos" : "Valores nao aceitos";
        
        System.out.println(mensagem);

    }

}

package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 29/05/2020
 */
public class Problema1020 {
    public static void main(String[] args) {        
        java.util.Scanner read = new java.util.Scanner(System.in);
        int idadeEmDias = read.nextInt();
        
        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias - (anos * 365)) / 30;
        int dias = (idadeEmDias - (anos * 365)) % 30;
        
        System.out.format("%d ano(s)\n", anos);
        System.out.format("%d mes(es)\n", meses);
        System.out.format("%d dia(s)\n", dias);
    }
}

package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 30/05/2020
 */
public class Problema1038 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        
        int opcao = read.nextInt();
        int quantidade = read.nextInt();
        
        java.util.Map<Integer, Double> menu = new java.util.HashMap<>();
        menu.put(1, 4.0);
        menu.put(2, 4.5);
        menu.put(3, 5.0);
        menu.put(4, 2.0);
        menu.put(5, 1.5);
        
        double total = menu.get(opcao) * quantidade;
        
        System.out.format("Total: R$ %.2f\n", total);
    }
}

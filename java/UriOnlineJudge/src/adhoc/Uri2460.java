package adhoc;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Uri2460 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        int quantidadeDePessoasNaFila = read.nextInt();
        Map<Integer, String> mapa = new LinkedHashMap<>();
        for (int i = 0; i < quantidadeDePessoasNaFila; i++) {
            int ingresso = read.nextInt();
            mapa.put(ingresso, ingresso+"");
        }
        
        int quantidadeDePessoasQueSairaDaFila = read.nextInt();
        for (int i = 0; i < quantidadeDePessoasQueSairaDaFila; i++) {
            mapa.remove(read.nextInt());
        }
        
        String texto = mapa.values().toString().replaceAll("([\\[,\\]])", "");
        System.out.println(texto);
    }
}

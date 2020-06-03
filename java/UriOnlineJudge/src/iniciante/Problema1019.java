package iniciante;

import java.time.Duration;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 29/05/2020
 */
public class Problema1019 {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int tempoEmSegundos = read.nextInt();
        
        Duration duracao = Duration.ofSeconds(tempoEmSegundos);
        long h = duracao.toHours();
        long m = duracao.minusHours(h).toMinutes();
        long s = duracao.minusHours(h).minusMinutes(m).getSeconds();
        
        System.out.format("%d:%d:%d\n", h, m, s);
    }
}

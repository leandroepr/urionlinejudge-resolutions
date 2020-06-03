package iniciante;

import java.math.BigDecimal;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 29/05/2020
 */
public class Problema1021 {

    public static void main(String[] args) {        
        float valor = lerEntrada();
        float[] notas = {100, 50, 20, 10, 5, 2};
        float[] moedas = {1f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f};

        System.out.println("NOTAS:");
        valor = imprimirDinheiroTrocado(valor, notas, "%d nota(s) de R$ %.2f\n");

        System.out.println("MOEDAS:");
        imprimirDinheiroTrocado(valor, moedas, "%d moeda(s) de R$ %.2f\n");        
    }

    private static float lerEntrada() {
        java.util.Scanner read = new java.util.Scanner(System.in);
        return read.nextFloat();
    }

    public static float arredondarComDuasCasas(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    private static float imprimirDinheiroTrocado(float valor, float[] notas, String msg) {
        for (float nota : notas) {
            int qtd = (int) (valor / nota);
            valor = arredondarComDuasCasas((valor - qtd * nota), 2);
            System.out.format(msg, qtd, nota);
        }
        return valor;
    }
}
/*
IMPUT
576.73

OUTPUT
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01
 */

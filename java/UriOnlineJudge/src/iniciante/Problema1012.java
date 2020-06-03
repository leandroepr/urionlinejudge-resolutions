package iniciante;

/**
 * @author Leandro Reis <leandro.e.reis@gmail.com>
 * @date 28/05/2020
 */
public class Problema1012 {

    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);

        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();

        double areaDoTriangulo = a * c / 2;
        double areaDoCirculo = 3.14159 * Math.pow(c, 2);
        double areaDoTrapezio = (a + b) * c / 2;
        double areaDoQuadrado = b * b;
        double areaDoRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaDoTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);
    }
}

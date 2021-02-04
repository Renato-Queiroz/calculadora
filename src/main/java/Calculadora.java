import java.io.IOException;
import java.math.BigDecimal;

public class Calculadora {

    public void apagaMenu() throws IOException, InterruptedException {
        new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
    }

    public BigDecimal somar(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    public BigDecimal subtrair(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    public BigDecimal multiplicar(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    public BigDecimal divisao(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }

    public double raizQuadrada(double num) {
        num = Math.sqrt(num);
        return num;
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double fatorial(double num) {
        double f = num;
        while (num > 1) {
            f = f * (num - 1);
            num--;
        }
        return (f);
    }

    public double logaritmo(double num) {
        return Math.log10(num);
    }

    public BigDecimal areaDeUmPoligonoRegular(double perimetro, double apotema) { // formula para calculo de um poligono regular: 1/2 * perimetro * apótema.
        return BigDecimal.valueOf(0.5 * perimetro * apotema);
    }

    public double hipotenusaDeUmTrianguloRetangulo(double catetoA, double catetoB) {// formula matemática: h² = a² + b².
        double somaQuadradoCatetos = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        return Math.sqrt(somaQuadradoCatetos);
    }
}

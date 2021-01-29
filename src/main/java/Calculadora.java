import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("#############################\n" + "#### CALCULADORA MONSTRA #### \n" + "#############################\n");
        System.out.println("- Escolha uma das Operações abaixo listadas ou digite [X] para sair.");
        System.out.print("==========\n" + "OPERAÇÕES:\n" + "==========");
        System.out.print("\n" + "[A] - ADIÇÃO \n" + "[B] - SUBTRAÇÃO\n" + "[C] - MULTIPLICAÇÃO\n" + "[D] - DIVISÃO\n" +
                "[E] - RAIZ QUADRADA\n" + "[F] - POTÊNCIA DE N\n" + "[G] - NÚMERO FATORIAL\n" + "[H] - LOGARITIMO BASE 10\n" +
                "[I] - AREA DE UM POLÍGONO REGULAR\n" + "[J] - CALCULAR A HIPOTENUSA DE UM TRIÂNGULO RETÂNGULO\n" + "\n" + "OPÇÃO ESCOLHIDA: ");
        char opcao;
        do {
            opcao = scanner.next().toUpperCase().charAt(0);
            switch (opcao) {
                case 'X' -> {
                }
                case 'A' -> {
                    apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Soma = " + somaDoisNumeros(num1, num2));
                    return;
                }
                case 'B' -> {
                    apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Diferença = " + subtraiDoisNumeros(num1, num2));
                    return;
                }
                case 'C' -> {
                    apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Produto = " + multiplicaDoisNumeros(num1, num2));
                    return;
                }
                case 'D' -> {
                    apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Divisão = " + divisaoDeDoisNumeros(num1, num2));
                    return;
                }
                case 'E' -> {
                    apagaMenu();
                    System.out.print("Digite o numero que deseja saber a raiz quadrada: ");
                    double num = scanner.nextDouble();
                    System.out.println("A raiz quadrada do número é: " + raizQuadradaDeUmNumero(num));
                    return;
                }
                case 'F' -> {
                    apagaMenu();
                    System.out.print("Digite o numero da base: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o numero do expoente: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("A potencia do número é: " + potenciaDeUmNumero(num1, num2));
                    return;
                }
                case 'G' -> {
                    apagaMenu();
                    System.out.print("Digite o numero a ser calculado: ");
                    double num = scanner.nextDouble();
                    System.out.println("O fatorial do número " + num + " é: " + fatorialDeUmNumero(num));
                    return;
                }
                case 'H' -> {
                    apagaMenu();
                    System.out.print("Digite um numero: ");
                    double num = scanner.nextDouble();
                    System.out.println("O log base 10 do número " + num + " é: " + logaritmoBaseDez(num));
                    return;
                }
                case 'I' -> {
                    apagaMenu();
                    System.out.print("Digite o valor do perímetro: ");
                    double perimetro = scanner.nextDouble();
                    System.out.print("Digite o valor da apótema: ");
                    double apotema = scanner.nextDouble();
                    System.out.println("A área do polígono regular é: " + areaDeUmPoligonoRegular(perimetro, apotema));
                    return;
                }
                case 'J' -> {
                    apagaMenu();
                    System.out.print("Digite o valor do cateto a: ");
                    double catetoA = scanner.nextDouble();
                    System.out.print("Digite o valor do cateto b: ");
                    double catetoB = scanner.nextDouble();
                    System.out.println("A hipotenusa do triângulo retângulo é: " + hipotenusaDeUmTrianguloRetangulo(catetoA, catetoB));
                    return;
                }
                default -> System.out.print("OPÇÃO INVÁLIDA, POR FAVOR DIGITE NOVAMENTE: ");
            }
        } while (opcao != 'X');
    }

    private static void apagaMenu() throws IOException, InterruptedException {
        new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
    }

    private static BigDecimal somaDoisNumeros(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    private static BigDecimal subtraiDoisNumeros(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    private static BigDecimal multiplicaDoisNumeros(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    private static BigDecimal divisaoDeDoisNumeros(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }

    private static double raizQuadradaDeUmNumero(double num) {
        num = Math.sqrt(num);
        return num;
    }

    private static double potenciaDeUmNumero(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    private static double fatorialDeUmNumero(double num) {
        double f = num;
        while (num > 1) {
            f = f * (num - 1);
            num--;
        }
        return (f);
    }

    private static double logaritmoBaseDez(double num) {
        return Math.log10(num);
    }

    private static BigDecimal areaDeUmPoligonoRegular(double perimetro, double apotema) { // formula para calculo de um poligono regular: 1/2 * perimetro * apótema.
        return BigDecimal.valueOf(0.5 * perimetro * apotema);
    }

    private static double hipotenusaDeUmTrianguloRetangulo(double catetoA, double catetoB) {// formula matemática: h² = a² + b².
        double somaQuadradoCatetos = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        return Math.sqrt(somaQuadradoCatetos);
    }
}
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Calculadora calculadora = new Calculadora();
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
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = scanner.nextBigDecimal();
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = scanner.nextBigDecimal();
                    new Soma().calcular(num1,num2, BigDecimal.valueOf(0));
                    System.out.println("soma = " +ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ);
                    return;
                }
                case 'B' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Diferença = " + calculadora.subtrair(num1, num2));
                    return;
                }
                case 'C' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Produto = " + calculadora.multiplicar(num1, num2));
                    return;
                }
                case 'D' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero 1: ");
                    BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.print("Digite o numero 2: ");
                    BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
                    System.out.println("Divisão = " + calculadora.divisao(num1, num2));
                    return;
                }
                case 'E' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero que deseja saber a raiz quadrada: ");
                    double num = scanner.nextDouble();
                    System.out.println("A raiz quadrada do número é: " + calculadora.raizQuadrada(num));
                    return;
                }
                case 'F' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero da base: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o numero do expoente: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("A potencia do número é: " + calculadora.potencia(num1, num2));
                    return;
                }
                case 'G' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero a ser calculado: ");
                    double num = scanner.nextDouble();
                    System.out.println("O fatorial do número " + num + " é: " + calculadora.fatorial(num));
                    return;
                }
                case 'H' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite um numero: ");
                    double num = scanner.nextDouble();
                    System.out.println("O log base 10 do número " + num + " é: " + calculadora.logaritmo(num));
                    return;
                }
                case 'I' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o valor do perímetro: ");
                    double perimetro = scanner.nextDouble();
                    System.out.print("Digite o valor da apótema: ");
                    double apotema = scanner.nextDouble();
                    System.out.println("A área do polígono regular é: " + calculadora.areaDeUmPoligonoRegular(perimetro, apotema));
                    return;
                }
                case 'J' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o valor do cateto a: ");
                    double catetoA = scanner.nextDouble();
                    System.out.print("Digite o valor do cateto b: ");
                    double catetoB = scanner.nextDouble();
                    System.out.println("A hipotenusa do triângulo retângulo é: " + calculadora.hipotenusaDeUmTrianguloRetangulo(catetoA, catetoB));
                    return;
                }
                default -> System.out.print("OPÇÃO INVÁLIDA, POR FAVOR DIGITE NOVAMENTE: ");
            }
        } while (opcao != 'X');
    }
}
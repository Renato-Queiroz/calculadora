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
            Number[] numeros = new Number[1];
            if(opcao == 'A' || opcao == 'B' || opcao == 'C'|| opcao == 'D'){
                numeros = new Number[2];
                System.out.print("Digite o numero 1: ");
                numeros[0] = scanner.nextBigDecimal();
                System.out.print("Digite o numero 2: ");
                numeros[1] = scanner.nextBigDecimal();
            }
            switch (opcao) {
                case 'X' -> {
                }
                case 'A' -> {
                    calculadora.apagaMenu();
                    System.out.println("Resultado = " + new Soma().calcular(numeros));
                    return;
                }
                case 'B' -> {
                    calculadora.apagaMenu();
                    System.out.println("Resultado = " + new Subtracao().calcular(numeros));
                    return;
                }
                case 'C' -> {
                    calculadora.apagaMenu();
                    System.out.println("Resultado = " + new Multiplicacao().calcular(numeros));
                    return;
                }
                case 'D' -> {
                    calculadora.apagaMenu();
                    System.out.println("Resultado = " + new Divisao().calcular(numeros));
                    return;
                }
                case 'E' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero que deseja calcular a raiz: ");
                    numeros[0] = scanner.nextBigDecimal();
                    System.out.println("Resultado = " + new RaizQuadrada().calcular(numeros[0]));
                    return;
                }
                case 'F' -> {
                    calculadora.apagaMenu();
                    numeros = new Number[2];
                    System.out.print("Digite o numero da base: ");
                    numeros[0] = scanner.nextBigDecimal();
                    System.out.print("Digite o numero do expoente: ");
                    numeros[1] = scanner.nextBigDecimal();
                    System.out.println("Resultado = " + new Potencia().calcular(numeros[0],numeros[1]));
                    return;
                }
                case 'G' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o numero a ser calculado: ");
                    numeros[0] = scanner.nextBigDecimal();
                    System.out.println("O fatorial do número " + numeros[0] + " é: " + new Fatorial().calcular(numeros[0]));
                    return;
                }/*
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
                    BigDecimal perimetro = scanner.nextBigDecimal();
                    System.out.print("Digite o valor da apótema: ");
                    BigDecimal apotema = scanner.nextBigDecimal();
                    BigDecimal resultado = new AreaDeUmPoligonoRegular().calcular(perimetro,apotema);
                    System.out.println("Resultado = " + resultado);
                    return;
                }
                case 'J' -> {
                    calculadora.apagaMenu();
                    System.out.print("Digite o valor do cateto a: ");
                    BigDecimal catetoA = scanner.nextBigDecimal();
                    System.out.print("Digite o valor do cateto b: ");
                    BigDecimal catetoB = scanner.nextBigDecimal();
                    BigDecimal resultado = new HipotenusaTrianguloRetangulo().calcular(catetoA,catetoB);
                    System.out.println("Resultado = " + resultado);
                    return;
                }
                */
                default -> System.out.print("OPÇÃO INVÁLIDA, POR FAVOR DIGITE NOVAMENTE: ");
            }
        } while (opcao != 'X');
    }
}
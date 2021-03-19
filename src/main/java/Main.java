import java.io.IOException;
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
            calculadora.apagaMenu();
            Number[] numeros = new Number[2];
            if (opcao == 'A' || opcao == 'B' || opcao == 'C' || opcao == 'D') {
                System.out.print("Digite o numero 1: ");
                numeros[0] = scanner.nextBigDecimal();
                System.out.print("Digite o numero 2: ");
                numeros[1] = scanner.nextBigDecimal();
            }
            if (opcao == 'E' || opcao == 'G' || opcao == 'H') {
                System.out.print("Digite o numero a ser calculado: ");
                numeros[0] = scanner.nextBigDecimal();
            }
            if (opcao == 'F') {
                System.out.print("Digite o numero da base: ");
                numeros[0] = scanner.nextBigDecimal();
                System.out.print("Digite o numero do expoente: ");
                numeros[1] = scanner.nextBigDecimal();
            }
            if (opcao == 'I') {
                System.out.print("Digite o valor do perímetro: ");
                numeros[0] = scanner.nextBigDecimal();
                System.out.print("Digite o valor da apótema: ");
                numeros[1] = scanner.nextBigDecimal();
            }
            if (opcao == 'J') {
                System.out.print("Digite o valor do cateto a: ");
                numeros[0] = scanner.nextBigDecimal();
                System.out.print("Digite o valor do cateto b: ");
                numeros[1] = scanner.nextBigDecimal();
            }
            switch (opcao) {
                case 'X' -> {
                }
                case 'A' -> {
                    System.out.println("Resultado = " + new Soma().calcular(numeros));
                    return;
                }
                case 'B' -> {
                    System.out.println("Resultado = " + new Subtracao().calcular(numeros));
                    return;
                }
                case 'C' -> {
                    System.out.println("Resultado = " + new Multiplicacao().calcular(numeros));
                    return;
                }
                case 'D' -> {
                    System.out.println("Resultado = " + new Divisao().calcular(numeros));
                    return;
                }
                case 'E' -> {
                    System.out.println("Resultado = " + new RaizQuadrada().calcular(numeros));
                    return;
                }
                case 'F' -> {
                    System.out.println("Resultado = " + new Potencia().calcular(numeros));
                    return;
                }
                case 'G' -> {
                    System.out.println("O fatorial do número " + numeros[0] + "! " + "= " + new Fatorial().calcular(numeros));
                    return;
                }
                case 'H' -> {
                    System.out.println("O log base 10 do número " + numeros[0] + " é: " + new LogaritmoBaseDez().calcular(numeros));
                    return;
                }
                case 'I' -> {
                    System.out.println("Resultado = " + new AreaDeUmPoligonoRegular().calcular(numeros));
                    return;
                }
                case 'J' -> {
                    System.out.println("Resultado = " + new HipotenusaTrianguloRetangulo().calcular(numeros));
                    return;
                }
                default -> System.out.print("OPÇÃO INVÁLIDA, POR FAVOR DIGITE NOVAMENTE: ");
            }
        } while (opcao != 'X');
    }
}
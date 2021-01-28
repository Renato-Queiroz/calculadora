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
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    Calculadora.somaDoisNumeros();
                    return;
                }
                case 'B' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    Calculadora.subtraiDoisNumeros();
                    return;
                }
                case 'C' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    multiplicaDoisNumeros();
                    return;
                }
                case 'D' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    divisaoDeDoisNumeros();
                    return;
                }
                case 'E' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    raizQuadradaDeUmNumero();
                    return;
                }
                case 'F' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    potenciaDeUmNumero();
                    return;
                }
                case 'G' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    fatorialDeUmNumero();
                    return;
                }
                case 'H' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    logaritmoBaseDez();
                    return;
                }
                case 'I' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    areaDeUmPoligonoRegular();
                    return;
                }
                case 'J' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    hipotenusaDeUmTrianguloRetangulo();
                    return;
                }
                default -> System.out.print("OPÇÃO INVÁLIDA, POR FAVOR DIGITE NOVAMENTE: ");
            }
        } while (opcao != 'X');
    }

    private static void apagaMenu() throws IOException, InterruptedException {
        new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
    }

    private static void somaDoisNumeros() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o numero 1: ");
        BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.print("Digite o numero 2: ");
        BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println("A soma dos números é: " + num1.add(num2));
    }

    private static void subtraiDoisNumeros() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o numero 1: ");
        BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.print("Digite o numero 2: ");
        BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println("A subtração dos números é: " + num1.subtract(num2));
    }

    private static void multiplicaDoisNumeros() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o numero 1: ");
        BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.print("Digite o numero 2: ");
        BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println("O produto dos números é: " + num1.multiply(num2));
    }

    private static void divisaoDeDoisNumeros() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o numero 1: ");
        BigDecimal num1 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.print("Digite o numero 2: ");
        BigDecimal num2 = BigDecimal.valueOf(scanner.nextDouble());
        System.out.println("A divisão dos números é: " + num1.divide(num2));
    }

    private static void raizQuadradaDeUmNumero() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite um numero: ");
        double num1 = scanner.nextDouble();
        num1 = Math.sqrt(num1);
        BigDecimal result = BigDecimal.valueOf(num1);
        System.out.println("A raiz quadrada do número é: " + result);
    }

    private static void potenciaDeUmNumero() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o numero da base: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o numero do expoente: ");
        double num2 = scanner.nextDouble();
        double result = Math.pow(num1, num2);
        System.out.println("A potencia do número é: " + result);
    }

    private static void fatorialDeUmNumero() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite um numero: ");
        double x = scanner.nextInt();
        double f = x;
        while (x > 1) {
            f = f * (x - 1);
            x--;
        }
        System.out.println(f);
    }

    private static void logaritmoBaseDez() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite um numero: ");
        double num = scanner.nextDouble();
        num = Math.log10(num);
        System.out.println(num);
    }

    private static void areaDeUmPoligonoRegular() {
        // formula para calculo de um poligono regular: 1/2 * perimetro * apótema.
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double constante = 0.5;
        System.out.print("Digite o valor do perímetro: ");
        double perimetro = scanner.nextDouble();
        System.out.print("Digite o valor da apótema: ");
        double apotema = scanner.nextDouble();
        System.out.println("A área do polígono regular é: " + BigDecimal.valueOf(constante * perimetro * apotema));
    }

    private static void hipotenusaDeUmTrianguloRetangulo() {
        // formula matemática: h² = a² + b².
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o valor do cateto a: ");
        double catetoA = scanner.nextDouble();
        System.out.print("Digite o valor do cateto b: ");
        double catetoB = scanner.nextDouble();
        double somaQuadradoCatetos = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        System.out.println("A hipotenusa do triângulo retângulo é: " + Math.sqrt(somaQuadradoCatetos));
    }
}
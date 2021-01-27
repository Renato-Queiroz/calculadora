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
                "[E] - RAIZ QUADRADA\n" + "[F] - POTÊNCIA DE N\n" + "[G] - NUMERO FATORIAL\n" + "[H] - LOGARITIMO BASE 10\n" +
                "[I] - AREA DE UM POLIGONO\n" + "[J] - CALCULAR A HIPOTENUSA\n" + "\n" + "OPÇÃO ESCOLHIDA: ");
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
                    return;
                }
                case 'E' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    return;
                }
                case 'F' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    return;
                }
                case 'G' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    return;
                }
                case 'H' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    return;
                }
                case 'I' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
                    return;
                }
                case 'J' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao);
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
}
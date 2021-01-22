import java.io.IOException;
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("#############################\n" + "#### CALCULADORA MONSTRA #### \n" + "#############################\n");
        System.out.println("- Escolha uma das Operações abaixo listadas ou digite [X] para sair.");
        System.out.print("==========\n" + "OPERAÇÕES:\n" + "==========");
        System.out.print("\n" + "[A] - ADIÇÃO \n" + "[B] - SUBTRAÇÃO\n" + "[C] - MULTIPLICAÇÃO\n" + "[D] - DIVISÃO\n" +
                "[E] - RAIZ QUADRADA\n" + "[F] - POTÊNCIA DE N\n" + "[G] - NUMERO FATORIAL\n" + "[H] - LOGARITIMO BASE 10\n" +
                "[I] - AREA DE UM POLIGONO\n" + "[J] - CALCULAR A HIPOTENUSA\n" + "\n" + "OPÇÃO ESCOLHIDA: ");
        String opcao = scanner.next();
        opcao = opcao.toUpperCase();
        while (opcao.charAt(0) != 'X') {
            switch (opcao.charAt(0)) {
                case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' -> {
                    apagaMenu();
                    System.out.println("A OPÇÃO SELECIONADA FOI A: " + opcao.charAt(0));
                    return;
                }
                default -> {
                    System.out.print("OPÇÃO INVÁLIDA, POR FAVOR DIGITE NOVAMENTE: ");
                    opcao = scanner.next();
                    opcao = opcao.toUpperCase();
                }
            }
        }
    }
    private static void apagaMenu() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
    }
}
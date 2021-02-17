import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Subtracao implements Ioperacoes {

    @Override
    public BigDecimal calcular() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite o numero 1: ");
        BigDecimal num1 = scanner.nextBigDecimal();
        System.out.print("Digite o numero 2: ");
        BigDecimal num2 = scanner.nextBigDecimal();
        return num1.subtract(num2);
    }
}

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Soma implements Ioperacoes{


    @Override
    public BigDecimal calcular(BigDecimal num1, BigDecimal num2, BigDecimal resultado) {
        resultado = num1.add(num2);
        return resultado;
    }
}

import java.math.BigDecimal;

public class Divisao implements Ioperacoes {

    @Override
    public BigDecimal calcular(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }
}

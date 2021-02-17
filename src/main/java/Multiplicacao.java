import java.math.BigDecimal;

public class Multiplicacao implements Ioperacoes {

    @Override
    public BigDecimal calcular(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}

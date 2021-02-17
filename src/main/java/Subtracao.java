import java.math.BigDecimal;

public class Subtracao implements Ioperacoes {

    @Override
    public BigDecimal calcular(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}

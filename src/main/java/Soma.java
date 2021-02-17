import java.math.BigDecimal;

public class Soma implements Ioperacoes {

    @Override
    public BigDecimal calcular(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}

import java.math.BigDecimal;

public class Potencia implements Ioperacoes{
    @Override
    public BigDecimal calcular(BigDecimal num1, BigDecimal num2) {
        double num3 = num1.doubleValue();
        double num4 = num2.doubleValue();
        double result = Math.pow(num3,num4);
        return BigDecimal.valueOf(result);
    }
}

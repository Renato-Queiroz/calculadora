import java.math.BigDecimal;

public class Soma implements Ioperacoes {
    @Override
    public Number calcular(Number... numeros) {
        Number soma = 0;
        for (Number num:numeros) {
            soma = soma.doubleValue() + num.doubleValue();
        }
        return soma;
    }
}

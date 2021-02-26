public class Fatorial implements Ioperacoes {

    @Override
    public Number calcular(Number... numeros) {
        double num = numeros[0].doubleValue();
        double f = num;
        while (num > 1) {
            f = f * (num - 1);
            num--;
        }
        return (f);
    }
}

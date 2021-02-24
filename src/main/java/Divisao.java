public class Divisao implements Ioperacoes {
    @Override
    public Number calcular(Number... numeros) {
        return numeros[0].doubleValue() / numeros[1].doubleValue();
    }
}

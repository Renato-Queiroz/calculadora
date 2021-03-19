public class Potencia implements Ioperacoes{
    @Override
    public Number calcular(Number... numeros) {
        return Math.pow(numeros[0].doubleValue(),numeros[1].doubleValue());
    }
}

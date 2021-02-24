public class RaizQuadrada implements Ioperacoes{
    @Override
    public Number calcular(Number... numeros) {
        return Math.sqrt(numeros[0].doubleValue());
    }
}

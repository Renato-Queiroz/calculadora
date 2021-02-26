public class LogaritmoBaseDez implements Ioperacoes{
    @Override
    public Number calcular(Number... numeros) {
        return Math.log10(numeros[0].doubleValue());
    }
}

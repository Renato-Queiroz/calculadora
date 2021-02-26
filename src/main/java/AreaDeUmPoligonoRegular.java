public class AreaDeUmPoligonoRegular implements Ioperacoes {
    @Override
    public Number calcular(Number... numeros) {
        return (0.5 * numeros[0].doubleValue() * numeros[1].doubleValue());
    }
}

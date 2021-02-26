public class HipotenusaTrianguloRetangulo implements Ioperacoes {
    @Override
    public Number calcular(Number... numeros) {
        double somaQuadradoCatetos = Math.pow(numeros[0].doubleValue(), 2) + Math.pow(numeros[1].doubleValue(), 2);
        return Math.sqrt(somaQuadradoCatetos);
    }
}

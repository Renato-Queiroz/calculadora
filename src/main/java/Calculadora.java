import java.io.IOException;

public class Calculadora {

    public void apagaMenu() throws IOException, InterruptedException {
        new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
    }

    public double raizQuadrada(double num) { num = Math.sqrt(num); return num; }

    public double fatorial(double num) {
        double f = num;
        while (num > 1) {
            f = f * (num - 1);
            num--;
        }
        return (f);
    }

    public double logaritmo(double num) {
        return Math.log10(num);
    }
}

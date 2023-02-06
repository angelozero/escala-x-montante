public class Main {
    public static void main(String[] args) {

        int escala = 2;
        int montante = 100;
        double valorCalculado = (double) montante / (double) getEscalaMontanteCalculada(escala);

        double valorFinal = valorCalculado < 0.01 ? 0.00 : valorCalculado;

        System.out.printf("%.2f%n", valorFinal);
    }

    private static int getEscalaMontanteCalculada(int escala) {
        return Integer.parseInt("1" + "0".repeat(Math.max(0, escala)));
    }
}
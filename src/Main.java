public class Main {
    public static void main(String[] args) {
        try {
            // O programa irá tentar executar os seguintes operações
            int resultado = dividirPorZero(10, 0);
            System.out.println("Resultado: " + resultado);

            // Ele irá cair no catch, porque não é possível dividir 0
        } catch (ArithmeticException e) {

            // Ele irá exibir a mensagem abaixo
            System.out.println("Não é possível dividir por 0 " + e);
        } finally {

            // O finally sempre irá executar
            // Independente de ocorrer uma exceção ou não
            System.out.println("Encerrando o Programa");
        }
    }

    public static int dividirPorZero(int numerador, int denominador) {
        return numerador / denominador;
    }
}
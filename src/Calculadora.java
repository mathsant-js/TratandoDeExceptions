import java.util.Scanner;

public class Calculadora {
     static void calculadora() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número...");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número...");
            int numero2 = scanner.nextInt();

            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int multiplicacao = numero1 * numero2;
            int divisao = numero1 / numero2;

            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Multiplicação: " + multiplicacao);
            System.out.println("Divisão: " + divisao);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
}

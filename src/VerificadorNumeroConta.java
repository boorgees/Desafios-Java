import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
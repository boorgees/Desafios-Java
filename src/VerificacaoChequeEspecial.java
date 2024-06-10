import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o saldo atual da conta bancária: ");
            double saldo = scanner.nextDouble();
            System.out.println("Informe o valor do saque: ");
            double saque = scanner.nextDouble();
            double limiteChequeEspecial = 500;
            if (saque <= saldo) {
                System.out.println("Transação realizada com sucesso.");
            } else {
                if (saque > (saldo + limiteChequeEspecial)) {
                    System.out.println("Transação não realizada. Limite do cheque especial excedido.");
                } else {
                    System.out.println("A transação foi realizada com sucesso, utilizando o cheque especial.");
                }
            }
            scanner.close();
        }
    }
}
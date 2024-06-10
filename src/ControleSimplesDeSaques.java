import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o valor de limite diário: ");
            double limiteDiario = scanner.nextDouble();
            
            for (@SuppressWarnings("unused")
            int i = 1;; i++) {
                System.out.println("Informe o valor do saque: ");
                double valorSaque = scanner.nextDouble();
                
                if (valorSaque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break;
                } else if (valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break;
                } else {
                    System.out.println("Saque realizado. Limite restante: " + (limiteDiario - valorSaque));
                }
            }
        }
    }
}
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            boolean continuar = true;

            while (continuar) {

                System.out.println("""
                        Digite: \r
                        1 - Depositar\r
                        2 - Sacar\r
                        3 - Consultar Saldo\r
                        0 - Encerrar""" //
                //
                //
                //
                );
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Insira o valor a ser depositado: ");
                        double deposito = scanner.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Saldo atual: %.1f\n" + saldo);
                    }
                    case 2 -> {
                        System.out.println("Digite o valor que será retirado: ");
                        double saque = scanner.nextDouble();
                        if (saldo >= saque) {
                            saldo = saldo - saque;
                            System.out.println("Saldo atual: %.1f\n" + saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }
                    case 3 ->
                        System.out.println("Saldo atual: %.1f\n " + saldo);
                    case 0 -> {
                        System.out.println("Programa encerrado.");
                        continuar = false; // Atualiza a variável de controle para encerrar o loop
                    }
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}
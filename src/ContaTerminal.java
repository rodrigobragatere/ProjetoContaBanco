import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        // Solicitar a agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicitar o nome do cliente
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar o saldo
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
        // Fechar o scanner
        scanner.close();

    }
}
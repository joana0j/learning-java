import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int options = 0;
        double userBalance = 10000;

        String userAccount = """
                ****************************************
                Dados iniciais do cliente:
                                
                Nome:               Joana Lima
                Tipo de Conta:      Corrente
                Saldo:              R$ 10.000
                ****************************************
                """;
        String menuOptions = """
                ---------------------------
                Operações
                                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                ---------------------------
                Digite a opção desejada:
                """;

        System.out.println(userAccount);

        while (options != 4) {
            System.out.println(menuOptions);
            options = scanner.nextInt();

            if (options == 1) {
                System.out.println("O saldo atual é: R$ " + userBalance);

            } else if (options == 2) {
                System.out.println("Digite o valor a ser recebido: ");
                double entryValue = scanner.nextDouble();
                userBalance += entryValue;
                System.out.println("Saldo atualizado: R$ " + userBalance);

            } else if (options == 3) {
                System.out.println("Digite o valor a ser tranferido: ");
                double entryTransferValue = scanner.nextDouble();

                if (entryTransferValue > userBalance) {
                    System.out.println("Não há saldo o suficiente.");
                } else {
                    userBalance -= entryTransferValue;
                    System.out.println("Saldo atualizado: R$ " + userBalance);

                }
            } else if (options == 4) {
                System.out.println("Saindo da conta..");

            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

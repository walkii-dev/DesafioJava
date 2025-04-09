import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldoCliente = 0;
        int opcaoMenu=0;

        String infoCliente = """
                             _________________________________________________
                             Dados da Conta
                             -------------------------------------------------
                             Nome: Jair Luís Bolsonaro Inácio Messias da Silva
                             Tipo de conta: Corrente
                             Valor Atual: R$ %.2f
                             ________________________________________________
                             """.formatted(saldoCliente);
        System.out.println(infoCliente);

        String mensagemMenu = """
                              _______________________________________________
                              Menu
                              -----------------------------------------------
                              Escolha uma opção:
                              1 - Consultar Saldo Atual
                              2 - Receber Valor
                              3 - Sacar Valor
                              4 - Sair
                              _______________________________________________
                              """;
        System.out.println(mensagemMenu);

        while (opcaoMenu != 4) {
            opcaoMenu = entrada.nextInt();
            System.out.println(mensagemMenu);
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Saldo Atual: R$ %.2f".formatted(saldoCliente));
                    break;
                case 2:
                    System.out.println("Quanto você deseja depositar?");
                    double maisValor = entrada.nextDouble();
                    saldoCliente += maisValor;
                    System.out.println("Novo Saldo: R$ %.2f".formatted(saldoCliente));
                    break;
                case 3:
                    System.out.println("Quanto você deseja sacar?");
                    double menosValor = entrada.nextDouble();
                    if (saldoCliente > menosValor) {
                        saldoCliente -= menosValor;
                        System.out.println("Novo Saldo: R$ %.2f".formatted(saldoCliente));
                    } else {
                        System.out.println("Não é possível sacar o valor selecionado");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }



    }
}

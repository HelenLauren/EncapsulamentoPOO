import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Banco banco = new Banco(0.0f); // Vai iniciar o saldo com 0 para facilitar as coisas 

        while (true) {
            System.out.println("BEM VINDO! ");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Ver Saldo");
            System.out.println("5. Atualizar informações do perfil");
            System.out.println("6. Sair");

            int opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao) {
                case 1:
                    //falta implementar o perfil né
                case 2:
                    System.out.println("Informe o valor do depósito:");
                    float valorDeposito = ler.nextFloat();
                    banco.Depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Informe o valor do saque:");
                    float valorSaque = ler.nextFloat();
                    banco.Sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Saldo atual: " + banco.getSaldo());
                    break;
                case 5:
                    //falta implementar a mudanca de informacoes do perfil
                case 6:
                    System.out.println("Saindo...");
                    ler.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

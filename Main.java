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
                     System.out.println("Criando nova conta...");
                    System.out.print("Digite o nome: ");
                    String nome = ler.nextLine();
                    
                    System.out.print("Digite o CPF (apenas números): ");
                    String cpf = ler.nextLine();
                    
                    System.out.print("Digite a renda mensal: ");
                    double rendaMensal = ler.nextDouble();
                    ler.nextLine(); // Consumir a quebra de linha

                    System.out.print("Digite uma senha de 6 dígitos numéricos: ");
                    String senha = ler.nextLine();

                    try {
                        cliente = new Cliente(nome, cpf, senha);
                        cliente.setRendaMensal(rendaMensal);
                        System.out.println("Conta criada com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao criar conta: " + e.getMessage());
                    }
                    
                case 2:
                     if (cliente == null) {
                        System.out.println("Por favor, crie uma conta primeiro.");
                    } 
                     else {
                        System.out.println("Informe o valor do depósito:");
                        float valorDeposito = ler.nextFloat();
                        banco.Depositar(valorDeposito);
                     }
                case 3:
                     if (cliente == null) {
                        System.out.println("Por favor, crie uma conta primeiro.");
                    }
                     else {
                        System.out.println("Informe o valor do saque:");
                        float valorSaque = ler.nextFloat();
                        banco.Sacar(valorSaque);
                     }
                case 4:
                     if (cliente == null) {
                        System.out.println("Por favor, crie uma conta primeiro.");
                    } 
                     else {
                        System.out.println("Saldo atual: " + banco.getSaldo());
                     }
                case 5:
                    if (cliente == null) {
                        System.out.println("Por favor, crie uma conta primeiro.");
                    } else {
                        System.out.println("Atualizar informações do perfil:");
                        System.out.print("Digite o novo nome do cliente: ");
                        String novoNome = ler.nextLine();
                        cliente.setNome(novoNome);
                        
                        System.out.print("Digite a nova renda mensal do cliente: ");
                        double novaRenda = ler.nextDouble();
                        ler.nextLine(); // Consumir a quebra de linha
                        cliente.setRendaMensal(novaRenda);

                        System.out.println("Informações do perfil atualizadas com sucesso!");
                    }
                    
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

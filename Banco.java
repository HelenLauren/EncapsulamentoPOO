public class Banco {
    private float saldo;

    public Banco(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void Depositar(float valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido. Deve ser maior que zero.");
        }
    }

    public void Sacar(float valorSaque) {
        if (valorSaque > 0) {
            if (valorSaque <= saldo) {
                saldo -= valorSaque;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor inválido. Deve ser maior que zero.");
        }
    }
}

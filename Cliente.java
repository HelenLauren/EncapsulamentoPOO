import java.math.BigDecimal;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private String senha;
    private BigDecimal saldo;

    public Cliente(String nome, String email, String senha, String cpf, BigDecimal saldoInicial){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldoInicial;
    }

}

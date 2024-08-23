public class Cliente {
    private String nome;
    private String cpf;
    private double rendaMensal;
    private String senha;

    public Cliente(String nome, String email, String senha, String cpf){
        setNome(nome);
        setCpf(cpf);
        setRendaMensal(rendaMensal);
        setSenha(senha);

    }
     public String getNome() {
        return nome;
    }
     public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
     public String getCpf() {
        return cpf;
    }
     public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
     public double getRendaMensal() {
        return rendaMensal;
    }
     public void setRendaMensal(double rendaMensal) {
        if(rendaMensal <= 0) {
            System.out.println("Renda mensal inválida! Deve ser maior que zero.");
            return;
        }
        this.rendaMensal = rendaMensal;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        if (senha != null && senha.matches("\\d{6}")) { 
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Senha inválida. Deve conter 6 dígitos numéricos");
        }
    }

}

package Classes;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

  
    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public void depositar(double valor) {
        this.conta.realizaOperacao(TipoOperacao.DEPOSITO, valor);

    }

    public void sacar(double valor) {
        this.conta.realizaOperacao(TipoOperacao.SAQUE, valor);
    }

    public void exibirSaldo(){
        this.conta.realizaOperacao(TipoOperacao.SALDO, 0);
    }

    //#region
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    //#endregion

    

    
}
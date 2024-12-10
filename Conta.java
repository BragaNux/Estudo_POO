abstract class Conta{
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void alterarSaldo(double valor){
        saldo += valor;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("- Depósito Invalido");
        } else {
            alterarSaldo(valor);
            System.out.println("- Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        }
    }

    public abstract void sacar(double valor);
}
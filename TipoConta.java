class ContaCorrente extends Conta{
    private static final double TAXA_SAQUE = 5.0;
    
    public ContaCorrente(double saldo){
        super(saldo);
    }

    public void sacar(double valor){
        double valorTotal = valor + TAXA_SAQUE;
        if (valorTotal > getSaldo()){
            System.out.println("- Saque de R$" + valor + " não é permitido. Saldo insuficiente.");
        } else {
            alterarSaldo(-valorTotal);
            System.out.println("- Saque de R$" + valor + " realizado. Taxa de R$" + TAXA_SAQUE + " aplicado. Saldo atual: R$" + getSaldo());
        }
    }
}

class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public void sacar(double valor){
        if (valor > getSaldo()){
            System.out.println("- Saque de R$" + valor + " não é permetido. Saldo insuficiente");
        } else {
            alterarSaldo(-valor);
            System.out.println("- Saque de R$" + valor + " realizado. Saldo atual: R$" + getSaldo());
        }
    }
}

public class TipoConta{
    public static void main(String[] args){

        Conta contaCorrente = new ContaCorrente(100);
        Conta contaPoupanca = new ContaPoupanca(200);

        System.out.println("\nOperações da Conta Corrente; ");
        contaCorrente.depositar(50);
        contaCorrente.sacar(70);
        contaCorrente.sacar(150);

        System.out.println("\nOperações da Conta Poupança; ");
        contaPoupanca.depositar(100);
        contaPoupanca.sacar(250);
        contaPoupanca.sacar(50);
        System.out.println("");
    }
}
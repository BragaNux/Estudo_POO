abstract class MetodoPagamento{
    protected double valorCompra;

    public MetodoPagamento (double valorCompra){
        this.valorCompra = valorCompra;
    }

    protected abstract void valorFinal();
}

class CartaoCredito extends MetodoPagamento{
    public CartaoCredito(double valorCompra){
        super(valorCompra);
    }

    protected void valorFinal(){
        System.out.println("O pagamento será realizado em 1 dia útil. Valor final: " + valorCompra);
    }
}

class Pix extends MetodoPagamento{
    public Pix(double valorCompra){
        super(valorCompra);
    }

    protected void valorFinal(){
        System.out.println("O valor final da compra após juros é: " + valorCompra*0.6);
    }
}


public class Main{
    public static void main (String[] args){
        MetodoPagamento cartao = new CartaoCredito(200);
        MetodoPagamento pix = new Pix(4);

        cartao.valorFinal();
        pix.valorFinal();
    }
}

public class CaixaEletronico {

    private int total;

    public CaixaEletronico() {
        this.total = 1000;
    }

    public int sacar(int valor) {
        if (valor > total) {
            System.out.println("Nao ha dinheiro suficiente, tente outro caixa");
        } else {
            total -= valor;
            return valor;
        }
        return valor;
    }
    
}

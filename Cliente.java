import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private List<Compra> compras = new ArrayList<Compra>();
    private int dinheiro;

    public Cliente (int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void comprar(Produto produto, int quantidade) {
        var novaCompra = new Compra(produto, quantidade);
        this.compras.add(novaCompra);
    }

    public void pagar() {
        int valorTotal = 0;
        for (int i = 0; i <= compras.size(); i++) {
            valorTotal += compras.get(i).calcularValor();

            if (valorTotal > dinheiro) {
                System.out.println("Dinheiro insuficiente. Saldo: " +dinheiro);
            } else {
                setDinheiro(dinheiro - valorTotal);
                compras.remove(i);
                System.out.println("Você ainda tem " + dinheiro);
            }
        }
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getDinheiro() {
        return dinheiro;
    }
}
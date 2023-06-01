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

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getDinheiro() {
        return dinheiro;
    }
}
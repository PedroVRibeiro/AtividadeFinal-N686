public class Compra {
    private Produto produto;
    private int quantidade;

    public Compra(Produto produto, int quantidade) {
        this.produto = new Produto(produto.getNome(), produto.getPreco());
        this.quantidade = quantidade;
    }
}

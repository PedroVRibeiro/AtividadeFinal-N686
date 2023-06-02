public class App {
  public static void main(String[] args) {

    Cliente cliente1 = new Cliente(500);
    System.out.println("Dinheiro inicial " +cliente1.getDinheiro());
    CaixaEletronico caixa = new CaixaEletronico();
    cliente1.sacarDinheiro(caixa, 500);
    System.out.println("Após sacar: " +cliente1.getDinheiro());
    cliente1.comprar(new Produto("Banana", 50), 10);
    cliente1.pagar();
    System.out.println("Após pagar bananas: " +cliente1.getDinheiro());
    cliente1.comprar(new Produto("Maçã", 10), 1);
    cliente1.pagar();
    System.out.println("Após pagar maçã: " +cliente1.getDinheiro());

  }
}

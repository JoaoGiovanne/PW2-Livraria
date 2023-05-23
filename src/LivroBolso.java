public class LivroBolso extends Livro{
    public LivroBolso(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    void aplicarDesconto(double percentual) {
        System.out.println("Desconto nao aplicado");
    }
}

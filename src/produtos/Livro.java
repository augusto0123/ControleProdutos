package produtos;

public class Livro extends Produto{
    private String editora;

    public Livro(int id, String nome, double preco, String editora) {
        super(id, nome, preco);
        this.editora = editora;
    }

    @Override
    public double calcularPrecoComImposto() {
        return preco * 1.08;
    }
}

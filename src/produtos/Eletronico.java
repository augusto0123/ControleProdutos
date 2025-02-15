package produtos;

public class Eletronico extends Produto{
    private double peso;

    public Eletronico(int id, String nome, double preco, double peso) {
        super(id, nome, preco);
        this.peso = peso;
    }
}

package controle;

import produtos.Produto;

import java.util.ArrayList;

public class ControleProdutos {
    private ArrayList<Produto> produtos;

    public ControleProdutos(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void listarProdutos(){
        for (Produto produto : this.produtos){
            System.out.println(produto.obterDados());
        }
    }
}

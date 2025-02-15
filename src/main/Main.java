package main;

import controle.ControleProdutos;
import produtos.Eletronico;

public class Main {
    public static void main(String[] args){
        ControleProdutos controleProdutos = new ControleProdutos();

        Eletronico eletronico = new Eletronico(1, "Smartphone", 3500, 0.3);

        controleProdutos.adicionarProduto(eletronico);

        controleProdutos.listarProdutos();
    }
}

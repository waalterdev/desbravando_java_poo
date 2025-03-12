package com.desbravando_java_poo;

import java.util.List;
import java.util.ArrayList;

import com.desbravando_java_poo.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto) {
        this.total += produto.getPreco();
        this.produtos.add(produto);
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
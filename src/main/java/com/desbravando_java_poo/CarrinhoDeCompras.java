package com.desbravando_java_poo;

import com.desbravando_java_poo.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionado: " + produto);
        total += produto.getPreco();
    }

    public double getTotal() {
        return total;
    }
}
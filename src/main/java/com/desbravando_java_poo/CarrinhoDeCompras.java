package com.desbravando_java_poo;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionado: " + livro);
        livro.aplicarDesconto(0.05);
        total += livro.getPreco();
    }

    public double getTotal() {
        return total;
    }
}
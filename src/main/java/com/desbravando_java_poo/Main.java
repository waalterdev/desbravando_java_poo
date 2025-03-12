package com.desbravando_java_poo;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Sherman Walter");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Livro Físico");
        fisico.setPreco(50);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Ebook");
        ebook.setPreco(50);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(ebook);
        carrinho.adiciona(fisico);

        System.out.printf("Total : R$%.2f", carrinho.getTotal());
    }
};
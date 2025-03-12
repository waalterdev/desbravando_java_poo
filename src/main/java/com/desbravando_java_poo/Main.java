package com.desbravando_java_poo;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Autor autor = new Autor();
        autor.setNome("Sherman Walter");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setPreco(59.90);
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development Ebook");
        ebook.setPreco(29.90);

        carrinho.adiciona(ebook);
        carrinho.adiciona(fisico);
    }
};
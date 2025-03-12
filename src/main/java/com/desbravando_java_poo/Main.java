package com.desbravando_java_poo;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Autor autor = new Autor();
        autor.setNome("Sherman Walter");

        Livro livro = new MiniLivro(autor);
        
    }
};
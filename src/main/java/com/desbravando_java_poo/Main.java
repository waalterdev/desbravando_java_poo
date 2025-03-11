package com.desbravando_java_poo;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.preco = 59.99;
        livro.isbn = "978";

        livro.mostrarDetalhes();
    }
}
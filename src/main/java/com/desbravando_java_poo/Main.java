package com.desbravando_java_poo;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Sherman Walter");
        autor.setEmail("example@example.com");
        autor.setCpf("00000000000");

        Livro livro = new Livro();
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setPreco(59.90);
        livro.setIsbn("978");
        livro.setAutor(autor);

        livro.aplicarDesconto(0.1);
    }
};
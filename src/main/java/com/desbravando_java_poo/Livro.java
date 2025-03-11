package com.desbravando_java_poo;

public class Livro {
    String nome;
    String descricao;
    double preco;
    String isbn;

    void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.printf(
                "Nome: %s\n" +
                        "Descrição: %s\n" +
                        "Preço: %.2f\n" +
                        "ISBN: %s\n" +
                        "--\n",
                nome, descricao, preco, isbn);
                
    }
}

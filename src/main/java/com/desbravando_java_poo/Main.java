package com.desbravando_java_poo;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Sherman Walter");

        Livro livro = new Livro(autor);
        livro.setPreco(59.90);

        if (!livro.aplicarDesconto(0.3)) {
            System.out.println("Desconto no livro não pode ser maior do que 30%.\n");
        } else {
            System.out.printf("Valor no livro com desconto: R$%.2f\n", livro.getPreco());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setPreco(29.90);

        if (!ebook.aplicarDesconto(0.15)) {
            System.out.println("Desconto no ebook não pode ser maior do que 15%.\n");
        } else {
            System.out.printf("Valor no ebook com desconto: R$%.2f\n", ebook.getPreco());
        }
    }
};
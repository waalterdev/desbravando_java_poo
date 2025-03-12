package com.desbravando_java_poo.produtos;

import com.desbravando_java_poo.exceptions.AutorNuloException;
import com.desbravando_java_poo.livraria.Autor;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double preco;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {

        if (autor == null) {
            throw new AutorNuloException("O autor do livro não pode ser nulo.");
        }

        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.printf(
                "Nome: %s\n" +
                        "Descrição: %s\n" +
                        "Preço: %.2f\n" +
                        "ISBN: %s\n" + 
                        "---\n",
                nome, descricao, preco, isbn);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
        + "\nDescrição: " + descricao
        + "\nPreço: " + preco
        + "\nISBN " + isbn;
    }

    // Getters e setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
}

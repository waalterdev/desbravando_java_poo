package com.desbravando_java_poo;

public class Livro {
    private String nome;
    private String descricao;
    private double preco;
    private String isbn;
    private Autor autor;

    void mostrarDetalhes() {
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

    public void aplicarDesconto(double porcentagem) {
        this.preco -= this.preco * porcentagem;
    }

    public boolean temAutor() {
        return this.autor != null;
    }

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

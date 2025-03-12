package com.desbravando_java_poo.produtos;

import com.desbravando_java_poo.livraria.Editora;

public class Revista implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double preco;
    private Editora editora;

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
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.1) {
            return false;
        }

        double desconto = getPreco() * porcentagem;
        setPreco(getPreco() - desconto);
        return true;
    }
}

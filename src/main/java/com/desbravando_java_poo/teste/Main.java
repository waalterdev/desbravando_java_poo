package com.desbravando_java_poo.teste;

import java.util.List;

import com.desbravando_java_poo.CarrinhoDeCompras;
import com.desbravando_java_poo.livraria.Autor;
import com.desbravando_java_poo.produtos.Ebook;
import com.desbravando_java_poo.produtos.LivroFisico;
import com.desbravando_java_poo.produtos.Produto;

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

        List<Produto> produtos = carrinho.getProdutos();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.printf("Total : R$%.2f", carrinho.getTotal());
    }
};
package com.desbravando_java_poo.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.desbravando_java_poo.produtos.Produto;
import com.desbravando_java_poo.livraria.Autor;
import com.desbravando_java_poo.produtos.Ebook;
import com.desbravando_java_poo.produtos.LivroFisico;

public class OrdenandoComJava {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Sherman Walter");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Livro 1");
        fisico.setPreco(25.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Ebook 1");
        ebook.setPreco(24.90);

        List<Produto> produtos = Arrays.asList(fisico, ebook);

        Collections.sort(produtos);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}

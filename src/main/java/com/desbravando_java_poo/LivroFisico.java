package com.desbravando_java_poo;

public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getPreco() * 0.05;
    }
}

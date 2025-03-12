package com.desbravando_java_poo.produtos;

import com.desbravando_java_poo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getPreco() * 0.05;
    }

    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }

        double desconto = getPreco() * porcentagem;
        setPreco(getPreco() - desconto);
        return true;
    }
}

package com.desbravando_java_poo;

public class Ebook extends Livro implements Promocional {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        double desconto = this.getPreco() * porcentagem;
        this.setPreco(this.getPreco() - desconto);
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}

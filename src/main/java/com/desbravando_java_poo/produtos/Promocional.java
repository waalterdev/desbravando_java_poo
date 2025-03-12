package com.desbravando_java_poo.produtos;

@FunctionalInterface
public interface Promocional {
    boolean aplicarDesconto(double porcentagem);

    default boolean aplicarDescontoDe10PorCento() {
        return aplicarDesconto(0.1);
    }
}

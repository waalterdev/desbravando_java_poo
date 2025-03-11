package com.desbravando_java_poo;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    void mostrarDetalhes() {
        System.out.printf("Mostrando detalhes do autor\nNome: %s\nEmail: %s\nCPF: %s\n---", nome, email, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

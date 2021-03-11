package br.com.fatecararas.javaintro.model;

public class Cliente extends Pessoa{
    public Cliente(String nome, String email, String endereco) {
        super(nome, email, endereco);
    }

    @Override
    public String getNomeCompleto() {
        return null;
    }
}

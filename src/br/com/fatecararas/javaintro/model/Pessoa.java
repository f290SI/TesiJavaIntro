package br.com.fatecararas.javaintro.model;

import java.util.Locale;

/**
 * Classe base: Esta classe será a base para outras classe que possuam
 * atributos e comportamentos em comum, tudo o que que for comum, será
 * reaproveitado, este é um dos maiores beneficios da Herança.
 */
public class Pessoa {
    // Atributos protegidos para o Encapsulamento
    private String nome;
    private String sobrenome;
    private String email;
    private String endereco;

    // Comportmantos
    public Pessoa(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    /*
        GETTERS E SETTERS - São métodos públicos que centralizam a forma de acessar os atributos
        possibilitando a inclusão de funcionalidades neste processo (ENCAPSULAR).
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNomeCompleto(){
        return String.format("%s %s",getNome(), getSobrenome()).toUpperCase(Locale.ROOT);
    }


    public String getEmail() {
        return email;
    }

    /**
     * Método responsável por aplicar validação no e-mail, quando ocorrer a atribuição de valor
     * @param email: String - valor de e-mail a ser atualizado
     */
    public void setEmail(String email) {
        if (!email.isEmpty() && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email não alterado: E-mail inválido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Metodo implementado após a criação das classes Aluno e Cliente, para
     * exemplificar a herança, ou seja, mesmo após a as demais classes criadas;
     * ao criar um novo método, ele automaticamente estara disponivel às classes filhas.
     */
    public void metodoDeBrindeParaTodosMeusFilhos() {
        System.out.println("Sucesso para todos os Meus Filhos!");
    }

    /**
     * Método responsável por exibir os dados do objeto de forma mais intuitiva.
     * @return String
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

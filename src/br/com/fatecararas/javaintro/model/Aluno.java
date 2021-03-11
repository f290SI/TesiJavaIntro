package br.com.fatecararas.javaintro.model;

public class Aluno extends Pessoa {

    private long ra;

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public Aluno(long ra, String nome, String email, String endereco) {
        super(nome, email, endereco);
        this.ra = ra;
    }

    @Override
    public String getNomeCompleto() {
        return getNome()+" "+getSobrenome();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                '}';
    }

}

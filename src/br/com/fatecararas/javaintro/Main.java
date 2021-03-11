package br.com.fatecararas.javaintro;

import br.com.fatecararas.javaintro.model.Aluno;
import br.com.fatecararas.javaintro.model.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente objetoRicardo = new Cliente(
                "Ricardo Almeida",
                "ricardo@icloud.com",
                "Rua 5, 780 - Centro");

        Cliente objetoNicolas = new Cliente(
                "Nicolas Chinglia",
                "nicolas@gmail.com",
                "Rua 4, 567 - Centro");

        Cliente objetoEnzo = new Cliente(
                "Enzo Silva",
                "enzo@gmail.com",
                "Rua 34, 1000 - Centro");

        Aluno aluno = new Aluno(1000,"Luis Henrique",
                "lhviana@fatec.sp.gov.br",
                "Rua Tiradentes, 10 - Centro");

        //TODO: Abusem dos testes com os objetos criados acima!!!!!
    }
}

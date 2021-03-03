package br.com.fatecararas.javaintro;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static boolean conectarAoBancoDeDados(String host, String porta,
                                              String user, String senha) {
        System.out.println("Conexao realizada com sucesso.");

        return true;
    }

    public static void main(String[] args) {

        //TODO: Tipos de Dados [ Primitivos e Não Primitivos ]

        //TODO: Variaveis e Constantes
        // tipo identificador = valor;

        // get - set - add - remove - do - is

        //TODO: Java Beans - Boas Práticas
        // camelCase para variaveis e metodos
        // CamelCase para Classes e Interfaces
        // SNAKE_CASE para constantes

        //TODO: Operadores e Expressões [ Aritmeticos, Relacionais e Lógicos ]

        //TODO: Estruturas de Iteração e Controle

        boolean isConectadoAoBanco = conectarAoBancoDeDados("192.168.1.10",
                "8090","root", "donotcross");

        if (isConectadoAoBanco) {
            //Verifique se a table clientes existe...
        }

    }

    class Gerente implements Autenticavel{

        @Override
        public boolean autenticar(String user, String password) {
            return false;
        }

        @Override
        public String exibirInformacoes() {
            return null;
        }
    }

    class ClientePreferencial implements Autenticavel{
        String nome;
        String email;

        public void exibirCartaoDeVisita() {

        }

        @Override
        public boolean autenticar(String user, String password) {
            return false;
        }

        @Override
        public String exibirInformacoes() {
            return null;
        }
    }

    interface Autenticavel {
        boolean autenticar(String user, String password);
        String exibirInformacoes();
    }

}

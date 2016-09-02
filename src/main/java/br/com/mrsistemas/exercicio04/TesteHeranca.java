/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mrsistemas.exercicio04;

/**
 *
 * @author mrsistemas
 */
public class TesteHeranca {

    public static void main(String[] args) {
        /*Endereco endereco = new Endereco("Rua X", 10);
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setRg("444");
        pessoa.setEndereco(endereco);*/
        Pessoa pessoa = new Pessoa("João", "444", new Endereco("Rua X", 10));
        
        /* antes sem o construtor --
        Endereco endereco2 = new Endereco("Rua Y", 20);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Paulo");
        funcionario.setRg("45332");
        funcionario.setEndereco(endereco2);
        funcionario.setCarteiraProfissional(3424485);
        funcionario.setDataAdmissao("01/01/2001");
        funcionario.setSalario(1500.89);*/
        Funcionario funcionario = new Funcionario(3424485, 1500.89, "01/01/2001", "Paulo", "45332", new Endereco("Rua Y", 20));

        System.out.println("--Pessoa--");
        pessoa.Imprime();
        System.out.println("--Funcionario--");
        funcionario.Imprime();
        
        System.out.println();
        System.out.println("-- Usando toString --");
        System.out.println(pessoa);
        System.out.println(funcionario);
        
        
    }

}

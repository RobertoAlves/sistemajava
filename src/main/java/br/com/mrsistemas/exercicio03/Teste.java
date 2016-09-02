/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mrsistemas.exercicio03;

/**
 *
 * @author mrsistemas
 */
public class Teste {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Endereco endereco1 = new Endereco("Rua XV", 180);
        Escritorio escritorio1 = new Escritorio("15.904.000/0001-80", endereco1);
        empresa.addEscritorio(escritorio1);
        Endereco endereco2 = new Endereco("Rua 7", 100);
        Escritorio escritorio2 = new Escritorio("00.000.000/0000-00", endereco2);
        empresa.addEscritorio(escritorio2);

        empresa.addDepartamento("Financeiro");
        empresa.addDepartamento("Vendas");
        //       System.out.println("5");

        empresa.addPessoaDepartamento("Financeiro", "Juliana", "4.343.333", "Rua Carlos Gomes", 670);
        empresa.addPessoaDepartamento("Vendas", "Carlos", "2.003.300", "Rua 7 de Setembro", 1720);
        empresa.addPessoaDepartamento("Vendas", "Lilian", "1.666.722", "Rua 7 de Setembro", 85);

        empresa.imprimeEmpresa();

        System.out.println(".");
        System.out.println(".");
        System.out.println("Adicionando Escritório, Departamento e Pessoa");
        System.out.println(".");
        Endereco endereco3 = new Endereco("Rua 7 de Setembro", 580);
        Escritorio escritorio3 = new Escritorio("15.904.000/0002-65", endereco3);
        empresa.addEscritorio(escritorio3);

        empresa.addDepartamento("Adm");
        empresa.addDepartamento("Administrativo");
        empresa.addPessoaDepartamento("Vendas", "Carla", "1.113.522", "Alameda Aristiliano Ramos", 3878);
        empresa.addPessoaDepartamento("Administrativo", "João", "7.455.070", "Rua XV de Novembro", 110);
        empresa.imprimeEmpresa();

        System.out.println(".");
        System.out.println(".");
        System.out.println("Excluindo Escritório, Departamento e Pessoa");
        System.out.println(".");
        empresa.deleteDepartamento("Adm");
        empresa.deleteEscritorio("00.000.000/0000-00");
        empresa.deletePessoaDepartamento("Vendas", "Carlos");
        empresa.imprimeEmpresa();

    }

}

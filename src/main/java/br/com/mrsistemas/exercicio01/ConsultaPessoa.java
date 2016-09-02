/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mrsistemas.exercicio01;

/**
 *
 * @author mrsistemas
 */
public class ConsultaPessoa {

    MeuDepartamento dep = new MeuDepartamento();

    public static void main(String[] args) {

        ConsultaPessoa c = new ConsultaPessoa();
        c.dep.setNome("Facção");
        c.dep.setNumeroPosicoesLivres(5);
        Pessoa p = new Pessoa("33", "Ze Ninguem");
        c.dep.addPessoa(p);
        /* para trocar o valor de p através do construtor, usa-se new novamente? 
        Pessoa p = Pessoa("44", "João");
        c.dep.addPessoa(p); */

        Pessoa p2 = new Pessoa("5", "Maria");
        //p2.setRG("5");
        //p2.setNome("Maria");
        c.dep.addPessoa(p2);

        Pessoa p3 = new Pessoa("7", "João");
        c.dep.addPessoa(p3);

        p.setRG("17");
        p.setNome("Helena de Tróia");
        c.dep.addPessoa(p);
        c.dep.imprime();

        System.out.println("-----------------");
        System.out.println("Pesquisando RG: 7");
        c.dep.pesquisaPessoa("7");

        System.out.println("-----------------");
        System.out.println("Apagando RG: 7");
        c.dep.deletePessoa(p3);
        c.dep.imprime();
    }

}

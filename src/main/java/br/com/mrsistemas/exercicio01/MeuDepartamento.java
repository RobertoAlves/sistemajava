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
public class MeuDepartamento {

    private String nome;
    private Pessoa[] pessoas;
    private int numeroPosicoesLivres;

    public int getNumeroPosicoesLivres() {
        return this.numeroPosicoesLivres;
    }

    public void setNumeroPosicoesLivres(int numeroPosicoesLivres) {
        this.numeroPosicoesLivres = numeroPosicoesLivres;
        Pessoa novoArrayPessoas[] = new Pessoa[numeroPosicoesLivres];

        /*   
        for (int i = 0; i < numeroPosicoesLivres; i++) {
                novoArrayPessoas[i].setNome("");
                novoArrayPessoas[i].setRG("");
            }
         */
        pessoas = novoArrayPessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("------------------");
        System.out.println("Departamento: " + this.getNome());
        if (pessoas != null) {
            for (int i = 0; i < pessoas.length - numeroPosicoesLivres; i++) {
                //Pessoa pessoa = pessoas[i];
                if (pessoas[i] instanceof Pessoa) {

                    System.out.println(pessoas[i].getNome());

                }
                // System.out.println(pessoa.getNome());
            }
        } else {
            System.out.println("Não existem pessoas nesse departamento");
        }

    }

    public void addPessoa(Pessoa pessoa) {

        if (numeroPosicoesLivres > 0) {
            pessoas[pessoas.length - numeroPosicoesLivres] = pessoa;
            numeroPosicoesLivres--;
        } else {
            Pessoa novoArrayPessoas[] = new Pessoa[pessoas.length + 1];
            for (int i = 0; i < pessoas.length; i++) {
                novoArrayPessoas[i] = pessoas[i];
            }
            novoArrayPessoas[novoArrayPessoas.length - 1] = pessoa;
            pessoas = novoArrayPessoas;
        }
        /*
        pessoas[pessoas.length - numeroPosicoesLivres] = pessoa;
        numeroPosicoesLivres--;
         */
    }

    public void pesquisaPessoa(String rg) {

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Pessoa) {
                if (pessoas[i].getRG() == rg) {
                    System.out.println("Nome: " + pessoas[i].getNome());
                }
            }
        }
    }

    public void deletePessoa(Pessoa pessoa) {
        int totalPessoas = pessoas.length - numeroPosicoesLivres;
        for (int i = 0; i < totalPessoas; i++) {
//                    System.out.println("i: " + i + " " + pessoas[i].getNome());
            if (pessoas[i] instanceof Pessoa) {
                if (pessoa.getRG() == pessoas[i].getRG()) {
                    pessoas[i] = pessoas[pessoas.length - numeroPosicoesLivres - 1];
                    numeroPosicoesLivres++;
//                    System.out.println("numeroPosicoesLivres: " + numeroPosicoesLivres );
                }
            }
        }

    }
}

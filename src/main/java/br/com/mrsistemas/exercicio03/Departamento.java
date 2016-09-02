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
public class Departamento {

    private String nome;
    private Pessoa[] pessoas;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    void addPessoa(String nomePessoa, String rg, String rua, int numero) {
        Endereco endereco = new Endereco(rua, numero);
        if (pessoas == null) {
            pessoas = new Pessoa[1];
            pessoas[0] = new Pessoa(nomePessoa, rg, endereco);
        } else {
            Pessoa[] newPessoas = new Pessoa[pessoas.length + 1];
            for (int i = 0; i < pessoas.length; i++) {
                newPessoas[i] = pessoas[i];
            }
            newPessoas[pessoas.length] = new Pessoa(nomePessoa, rg, endereco);
            pessoas = newPessoas;
        }
    }

    void ImprimePessoas() {
        if (pessoas == null) {
            System.out.println("     Sem funcionários");
        } else {
            for (int i = 0; i < pessoas.length; i++) {
                if (pessoas[i] instanceof Pessoa) {
                    System.out.println("     " + i + ": " + pessoas[i].getNome());
                }
            }
        }

    }

    void deletePessoa(String nomePessoa) {
        if (pessoas != null) {

            for (int j = 0; j < pessoas.length; j++) {
                if (pessoas[j].getNome() == nomePessoa) {
                    int contador = 0;
                    Pessoa[] newPessoas = new Pessoa[pessoas.length - 1];
                    for (int i = 0; i < pessoas.length; i++) {
                        if (pessoas[i].getNome() != nomePessoa) {
                            newPessoas[contador] = pessoas[i];
                            contador++;
                        }
                    }
                    pessoas = newPessoas;
                    break;
                }
            }
        }
    }
}

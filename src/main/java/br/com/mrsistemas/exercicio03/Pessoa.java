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
class Pessoa {

    private String nome;
    private String rg;
    private Endereco endereco;

    public Pessoa(String nome, String rg, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
    }

    String getNome() {
        return this.nome;
    }
}

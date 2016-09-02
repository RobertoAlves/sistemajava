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
public class Pessoa {

    private String nome;
    private String rg;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Pessoa(String nome, String rg, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void Imprime() {

        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.println("Endereço: " + this.endereco.getRua() + ", " + this.endereco.getNumero());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", endereco=" + endereco + '}';
    }
    
}

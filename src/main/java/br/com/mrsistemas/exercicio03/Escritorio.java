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
public class Escritorio {

    private String cnpj;
    private Endereco endereco;

    public Escritorio(String cnpj, Endereco endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco.getRua() + ", " + endereco.getNumero();
    }

}

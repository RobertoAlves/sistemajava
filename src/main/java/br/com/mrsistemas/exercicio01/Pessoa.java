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
class Pessoa {
    
    private String RG;
    private String Nome;

   public Pessoa() {
     }
    
    public Pessoa(String RG, String Nome) {
        this.RG = RG;
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
    
}

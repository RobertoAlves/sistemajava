/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mrsistemas.exercico02;

/**
 *
 * @author mrsistemas
 */
public class Produto {
    private String Nome;
    
    {
        System.out.println("Iniciou bloco estático");
    }

    public Produto(String Nome) {
        this.Nome = Nome;
    }

    public Produto() {
    }
    
    

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizou");
    }
    
    
    
}

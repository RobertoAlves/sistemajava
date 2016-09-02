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
public class Teste {

    Produto[] produtos = new Produto[10];
    int posicao = 0;

    public static void main(String[] args) {
        System.out.println("kkk");
        Teste t = new Teste();
        for (int i = 0; i < 10; i++) {
            //t.posicao = (int) (Math.random() * 10);
            //if (t.produtos[i] == null) {
            System.out.println(i);
            t.produtos[i] = new Produto("produto " + i);
            //}
        }
        for (int i = 0; i < 10; i++) {
                 t.produtos[i] = null;
                 System.out.println("Removendo");
        }
                 System.gc();
        

    }
}

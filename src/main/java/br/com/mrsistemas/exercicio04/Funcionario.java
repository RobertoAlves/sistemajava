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
public class Funcionario extends Pessoa {

    private long carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public Funcionario(long carteiraProfissional, double salario, String dataAdmissao, String nome, String rg, Endereco endereco) {
        super(nome, rg, endereco);
        this.carteiraProfissional = carteiraProfissional;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public long getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(long carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public void Imprime() {

        super.Imprime();
        System.out.println("Carteira Profissional: " + this.carteiraProfissional);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Admissão: " + this.dataAdmissao);
        
    }

    @Override
    public String toString() {
        return super.toString()+" Funcionario{" + "carteiraProfissional=" + carteiraProfissional + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao + '}';
    }

  
}

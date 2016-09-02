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
public class Empresa {

    private Departamento[] departamentos;
    private Escritorio[] escritorios;

    public void addEscritorio(Escritorio escritorio) {
        if (escritorios == null) {
            escritorios = new Escritorio[1];
            escritorios[0] = escritorio;
        } else {
            Escritorio[] newEscritorios = new Escritorio[escritorios.length + 1];
            for (int i = 0; i < escritorios.length; i++) {
                newEscritorios[i] = escritorios[i];
            }
            newEscritorios[escritorios.length] = escritorio;
            escritorios = newEscritorios;
        }
    }

    public void deleteEscritorio(String cnpj) {

        for (int j = 0; j < escritorios.length; j++) {
            if (escritorios[j].getCnpj() == cnpj) {
                int contador = 0;
                Escritorio[] newEscritorios = new Escritorio[escritorios.length - 1];
                for (int i = 0; i < escritorios.length; i++) {
                    if (escritorios[i].getCnpj() != cnpj) {
                        newEscritorios[contador] = escritorios[i];
                        contador++;
                    }
                }
                escritorios = newEscritorios;
                break;
            }
        }
    }

    void addDepartamento(String departamento) {
        if (departamentos == null) {
            departamentos = new Departamento[1];
            departamentos[0] = new Departamento(departamento);
        } else {
            Departamento[] newDepartamentos = new Departamento[departamentos.length + 1];
            for (int i = 0; i < departamentos.length; i++) {
                newDepartamentos[i] = departamentos[i];
            }
            newDepartamentos[departamentos.length] = new Departamento(departamento);
            departamentos = newDepartamentos;
        }

    }

    void addPessoaDepartamento(String nomeDepartamento, String nomePessoa, String rg, String rua, int numero) {

        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].getNome() == nomeDepartamento) {
                departamentos[i].addPessoa(nomePessoa, rg, rua, numero);
                break;
            }
        }
    }

    void imprimeEmpresa() {
        System.out.println("=== Empresa ===");

        for (int i = 0; i < escritorios.length; i++) {
            System.out.println("Escritório " + i + ": " + escritorios[i].getCnpj()
                    + " - Endereço: " + escritorios[i].getEndereco());
        }
        System.out.println("---------------");

        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("Departamento " + i + ": " + departamentos[i].getNome());
            departamentos[i].ImprimePessoas();
        }
        System.out.println("===============");

    }

    void deleteDepartamento(String nome) {
        for (int j = 0; j < departamentos.length; j++) {
            if (departamentos[j].getNome() == nome) {
                int contador = 0;
                Departamento[] newDepartamentos = new Departamento[departamentos.length - 1];
                for (int i = 0; i < departamentos.length; i++) {
                    if (departamentos[i].getNome() != nome) {
                        newDepartamentos[contador] = departamentos[i];
                        contador++;
                    }
                }
                departamentos = newDepartamentos;
                break;
            }
        }
    }

    void deletePessoaDepartamento(String nomeDepartamento, String nomePessoa) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].getNome() == nomeDepartamento) {
                departamentos[i].deletePessoa(nomePessoa);
                break;
            }
        }
    }

}

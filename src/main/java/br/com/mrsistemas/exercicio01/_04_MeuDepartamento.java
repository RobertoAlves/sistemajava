package br.com.mrsistemas.exercicio01;

/**
 *
 * @author marcondes
 */
public class _04_MeuDepartamento {

    private String nome;
    private Pessoa[] pessoas;
    private int numeroPosicoesLivres = 0;

    public _04_MeuDepartamento() {
        this.pessoas = new Pessoa[10];
    }
    
    public _04_MeuDepartamento(String nome, Pessoa[] pessoas) {
        this.pessoas = new Pessoa[10];
        this.nome = nome;
        this.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void imprime() {
        System.out.println("-------------------------");
        System.out.println("Departamento: " + this.getNome());

        if (pessoas != null) {
            for (int i = 0; i < pessoas.length; i++) {
                if (pessoas[i] instanceof Pessoa) {
                    Pessoa pessoa = pessoas[i];
                    System.out.println(pessoas[i].getNome());
                }
            }
        } else {
            System.out.println("Não existem pessoas nesse departamento.");
        }
    }

    public void addPessoa(Pessoa pessoa) {
        System.out.println("Adicionando " + pessoa.getNome() + " ao departamento");
        if (numeroPosicoesLivres <= 10) {
            System.out.println("Existem posicoes livres no departamento");
            pessoas[numeroPosicoesLivres] = pessoa;
            numeroPosicoesLivres++;
        } else {
            System.out.println("Aumentando a capacidade de pessoas do departamento");
            Pessoa novoArrayPessoas[] = new Pessoa[pessoas.length + 1];
            for (int i = 0; i < pessoas.length; i++) {
                novoArrayPessoas[i] = pessoas[i];
            }
            novoArrayPessoas[numeroPosicoesLivres] = pessoa;
            pessoas = novoArrayPessoas;
            numeroPosicoesLivres--;
        }
    }

    public Pessoa getPessoa(String rg) {
        for (int i = 0; i < (pessoas.length - numeroPosicoesLivres); i++) {
            if (pessoas[i].getRG().equals(rg)) {
                return pessoas[i];
            }
        }
        return null;
    }
    
    public Pessoa removePessoa(Pessoa p) {
        String rgPessoa = p.getRG();
        int i = 0;
        
        while (i < pessoas.length - numeroPosicoesLivres) {
            if (pessoas[i].getRG().equals(rgPessoa)) {
                Pessoa pessoaRemovida = pessoas[i];
                pessoas[i] = pessoas[pessoas.length - 1 - numeroPosicoesLivres];
                numeroPosicoesLivres--;
                System.out.println("A pessoa: " + pessoaRemovida.getNome() + " foi removida do departamento.");
                return pessoaRemovida;
            }
            i++;
        }
        //se a pessoa não for localizada retorna null
        return null;
    }
}

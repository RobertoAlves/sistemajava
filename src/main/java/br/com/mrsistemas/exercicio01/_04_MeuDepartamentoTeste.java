package br.com.mrsistemas.exercicio01;

/**
 *
 * @author marcondes
 */
public class _04_MeuDepartamentoTeste {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("123","Marcondes");
//        p1.setRG();
//        p1.setNome();
        
        Pessoa p2 = new Pessoa();
        p2.setRG("1234");
        p2.setNome("Marcondes2");
        
        _04_MeuDepartamento departamento = new _04_MeuDepartamento();
        departamento.setNome("RH");
        departamento.addPessoa(p1);
        System.out.println("Adicionando pessoa no departamento.");
        departamento.imprime();
        
        departamento.addPessoa(p2);
        System.out.println("Adicionando pessoa no departamento.");
        departamento.imprime();
        
        departamento.removePessoa(p2);
        System.out.println("Removendo pessoa do departamento.");
        departamento.imprime();
        
    }
    
}

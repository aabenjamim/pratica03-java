package atividade02;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario  f1 = new Funcionario("Maria", "Secretária", 
        "maria@email.com", "Recepção", "Rua 2");
        Funcionario f2 = new Funcionario("Ana", "dev", 
        "ana@email.com", "Tech", "rua 3");

        f1.visualizar();
        System.out.println();
        f2.visualizar();
    }
}

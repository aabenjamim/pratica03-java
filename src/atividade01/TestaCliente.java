package atividade01;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "Rua 2", 
        "maria@email.com", "3535-3535", 21);
        Cliente c2 = new Cliente("João", "Rua 3", 
        "joao@email.com", "33333333", 25);

        c1.visualizar();
        System.out.println();
        c2.visualizar();
    }
}

/*Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a
Objetos, crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na
sequência, crie uma Classe chamada TestaCliente, instancie dois objetos da Classe
Cliente e apresente as informações destes 2 Objetos no console.
Boas práticas:
1) Crie a Classe Cliente e defina pelo menos 5 Atributos relevantes ao Objeto Cliente,
a sua escolha;
2) Lembre-se de escolher Atributos genéricos, que descrevam as características gerais
de qualquer Cliente;
3) Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
na Classe Cliente nos argumentos do Método;
4) Crie os Métodos Get e Set para todos os Atributos da Classe Cliente;
5) Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da
Classe Cliente;
6) Crie a Classe TestaCliente no mesmo pacote da Classe Cliente, contendo o Método
main() e instancie 2 Objetos da Classe Cliente;
7) Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados. */

package atividade01;

public class Cliente {
        
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private int idade;

    public Cliente(String nome, String endereco, String email, 
    String telefone, int idade){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void visualizar(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
    }
}

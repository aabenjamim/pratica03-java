/*Atividade 02
Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a
Objetos, crie a Classe Funcionario com os seus respectivos Métodos e Atributos. Na
sequência, crie uma Classe chamada TestaFuncionario, instancie dois objetos da
Classe Funcionario e apresente as informações destes 2 Objetos no console.
Boas práticas:
1) Crie a Classe Funcionario e defina pelo menos 5 Atributos relevantes ao Objeto
Funcionario, a sua escolha;
2) Lembre-se de escolher Atributos genéricos, que descrevam as características gerais
de qualquer Funcionario;
3) Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos
na Classe Funcionario nos argumentos do Método;
4) Crie os Métodos Get e Set para todos os Atributos da Classe Funcionario;
5) Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da
Classe Funcionario;
6) Crie a Classe TestaFuncionario no mesmo pacote da Classe Funcionario, contendo
o Método main() e instancie 2 Objetos da Classe Funcionario;
7) Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados. */

package atividade02;

public class Funcionario {
    
    private String nome;
    private String cargo;
    private String email;
    private String setor;
    private String endereco;

    public Funcionario(String nome, String cargo, String email, String setor, 
    String endereco){
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.setor = setor;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void visualizar(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Email: " + email);
        System.out.println("Setor: " + setor);
        System.out.println("Endereço: " + endereco);
    }
}

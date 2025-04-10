package POO;

public class Pessoa {
    // 1. Crie uma classe Pessoa com nome, idade e um método para exibir os dados.

    String nome;
    int idade;

    // construtor
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void exibirDadosPessoas(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

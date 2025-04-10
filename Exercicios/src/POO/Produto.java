package POO;

public class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInformacoesProduto(){
        System.out.println("Nome: " + nome + "\n Preço: " + preco + "\nEstoque: " + estoque);
    }
}

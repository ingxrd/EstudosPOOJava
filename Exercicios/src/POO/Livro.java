package POO;

public class Livro {
    String livro;
    String autor;
    int numeroPaginas;

    public Livro(String livro, String autor, int numeroPaginas){
        this.livro = livro;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarInformacoesDoLivro(){
        System.out.println(" Livro: " + livro + "\n Autor: " + autor + "\n Número de Páginas: " + numeroPaginas);
    }
}

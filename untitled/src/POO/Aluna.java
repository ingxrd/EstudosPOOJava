package POO;

public class Aluna {
    String nome;
    int nota1;
    int nota2;

    public Aluna(String nome, int nota1, int nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public float calcularMedia(){
        float media = (nota1 + nota2) / 2;
        System.out.println("Média de notas: " + media);
        return media;
    }

}

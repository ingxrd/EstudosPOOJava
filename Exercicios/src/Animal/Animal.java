package Animal;

public class Animal {
    private String raca;
    private String cor;
    private String nome;

    public Animal(String raca, String cor, String nome){
        this.raca = raca;
        this.cor = cor;
        this.nome = nome;
    }

    public void emitirSom(){
    }


    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    //
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}


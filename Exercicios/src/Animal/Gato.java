package Animal;

public class Gato extends Animal {
    public Gato(String raca, String cor, String nome) {
        super(raca, cor, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau");
    };
}

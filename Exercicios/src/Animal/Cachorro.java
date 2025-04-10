package Animal;

public class Cachorro extends Animal {
    public Cachorro(String raca, String cor, String nome) {
        super(raca, cor, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }
}

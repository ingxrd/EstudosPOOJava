package Forma;

public class Retangulo extends Forma {

    double largura;
    double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }


    @Override
    public double calcularArea() {
        return largura*altura;
    }
}


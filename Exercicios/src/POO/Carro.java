package POO;

public class Carro {
    String marca;
    String cor;
    int velocidade;


    public Carro (String marca, String cor, int velocidade){
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public int acelerar(int kmPorHora){
        if (velocidade >= 0){
            velocidade = kmPorHora + velocidade;
            System.out.println("Você acelerou o carro. \n Você está a " + velocidade + "km/h");
        } else{
            System.out.println("Velocidade precisa ser um número positivo. ");
        }
        return velocidade;
    }

    public int desacelerar(int kmPorHora){
        if (kmPorHora < 0) {
            System.out.println("A quantidade de desaceleração precisa ser positiva.");
            return velocidade;
        }

        if (velocidade - kmPorHora >= 0){
            velocidade = velocidade - kmPorHora;
        } else {
            velocidade = 0;
        }

        System.out.println("Você desacelerou o carro. \nVocê está a " + velocidade + "km/h");
        return velocidade;
    }

    public int exibirVelocidadeAtual(){
        return velocidade;
    }
}

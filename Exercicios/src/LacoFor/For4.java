package LacoFor;

public class For4 {
    // Conte quantos números múltiplos de 3 existem entre 1 e 100.
    public void multiplosDeTres(){
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de múltiplos de 3 entre 1 e 100: " + contador);
    }
}

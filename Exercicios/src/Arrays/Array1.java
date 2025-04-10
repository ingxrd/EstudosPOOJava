package Arrays;

import java.util.Random;

public class Array1 {
    // Crie um array de inteiros com 10 posições e preencha com valores aleatórios.
    public void arrayAleatorio(){
        int[] valoresAleatorios = new int[10];
        Random random = new Random();

        for (int i = 0; i < valoresAleatorios.length; i++) {
            valoresAleatorios[i] = random.nextInt(100); // valores aleatórios de 0 a 99
        }

        for (int i = 0; i < valoresAleatorios.length; i++) {
            System.out.println("Valor na posição " + i + ": " + valoresAleatorios[i]);
        }
    }
}

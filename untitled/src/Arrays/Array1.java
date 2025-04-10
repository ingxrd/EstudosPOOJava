package Arrays;
import java.util.ArrayList;

public class Array1 {
    // Crie um array de inteiros com 10 posições e preencha com valores aleatórios.
    public void arrayAleatorio(){
        ArrayList<String> valoresAleatorios = new ArrayList<String>();
        valoresAleatorios.add("oi");
        valoresAleatorios.add("tudo");
        valoresAleatorios.add("bem?");

        for (int i = 0; i < valoresAleatorios.size(); i++){
            System.out.println(valoresAleatorios.get(i));
        }

    }

}

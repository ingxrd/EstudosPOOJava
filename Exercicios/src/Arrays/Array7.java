package Arrays;

import java.util.ArrayList;

public class Array7 {
    // Remova um valor específico de um array.
    public void removerValorArray(){
        ArrayList<String> removerValorDessaArray = new ArrayList<String>();
        removerValorDessaArray.add("Ingrid");
        removerValorDessaArray.add("Munhoz");
        removerValorDessaArray.add("Olá, amigos!");
        removerValorDessaArray.add("Vou ficar na Array");
        removerValorDessaArray.add("Adieu!");

        System.out.println("Valores antes da remoção: " + removerValorDessaArray);

        // Remove valores específicos
        removerValorDessaArray.remove("Munhoz");
        removerValorDessaArray.remove("Adieu!");

        System.out.println("Valores após a remoção: " + removerValorDessaArray);
    }
}

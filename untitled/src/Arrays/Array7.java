package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class Array7 {
    // Remova um valor específico de um array.
    public void removerValorArray(){
        ArrayList<String> removerValorDessaArray = new ArrayList<String>();
        removerValorDessaArray.add("Ingrid");
        removerValorDessaArray.add("Munhoz");
        removerValorDessaArray.add("Olá, amigos!");
        removerValorDessaArray.add("Vou ficar na Array");
        removerValorDessaArray.add("Adieu!");

        System.out.println("Valores antes da remoção: " + removerValorDessaArray.indexOf("Adieu!")); // verifica o index.

        removerValorDessaArray.remove(1);
        removerValorDessaArray.remove(3);

        System.out.println("Valor removido com sucesso. Valores na Array" + removerValorDessaArray);

    }
}

package Arrays;
import java.util.*;

public class Array9 {

    public void ordemCrescente(){
        // Ordene um array de inteiros em ordem crescente
        int[] arrayOrdemCrescente = new int[]{5,49,9,10,30};
        Arrays.sort(arrayOrdemCrescente);

        for (int i : arrayOrdemCrescente){
            System.out.println("Inverter: " + i);
        }
    }
}

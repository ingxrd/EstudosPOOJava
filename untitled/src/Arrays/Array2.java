package Arrays;
import java.util.ArrayList;

public class Array2 {

    // Some todos os elementos de um array de inteiros.

    public void arrayDeInteiros(){
        ArrayList<Integer> valoresInteiros = new ArrayList<Integer>();
        valoresInteiros.add(1);
        valoresInteiros.add(10);
        valoresInteiros.add(100);

        for (int i = 0; i < valoresInteiros.size(); i++){
            System.out.println(valoresInteiros.get(i));

        }

    }
}

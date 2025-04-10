package Arrays;
import java.util.ArrayList;

public class Array4 {
    // Conte quantos números pares existem em um array.
    public void numerosParesArray(){
        ArrayList<Integer> paresArray = new ArrayList<Integer>();
        paresArray.add(4);
        paresArray.add(7);
        paresArray.add(43);
        paresArray.add(10);


        int numerosPares = 0;


        for (int i = 0; i < paresArray.size();i++){
            if (paresArray.get(i) % 2 == 0){

                numerosPares++;
            }
        }
        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Números pares da array: " + paresArray);
    }


}

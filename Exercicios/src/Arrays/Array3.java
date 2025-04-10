package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Array3 {

    // Encontre o maior e o menor valor em um array de inteiros

    public void verificarMaiorMenorValor(){
        ArrayList<Integer> valoresMaiorMenor = new ArrayList<Integer>();
        valoresMaiorMenor.add(100);
        valoresMaiorMenor.add(300);
        valoresMaiorMenor.add(4);
        valoresMaiorMenor.add(1);
        valoresMaiorMenor.add(301);
        valoresMaiorMenor.add(301);
        valoresMaiorMenor.add(0);

        int maior = valoresMaiorMenor.get(0);
        int menor = valoresMaiorMenor.get(0);

        for (int i = 1; i < valoresMaiorMenor.size(); i++){
            if (valoresMaiorMenor.get(i) > maior){
                maior = valoresMaiorMenor.get(i);
            }
            if (valoresMaiorMenor.get(i) < menor){
                menor = valoresMaiorMenor.get(i);
            }
        }

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);




    }
}

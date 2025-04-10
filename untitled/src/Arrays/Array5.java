package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Array5 {
    // Inverta os elementos de um array.

    public void inverterElementos(){
        ArrayList<String> elementosParaInverter = new ArrayList<String>();
        elementosParaInverter.add("Ingrid");
        elementosParaInverter.add("Munhoz");

        Collections.reverse(elementosParaInverter);
        System.out.println(elementosParaInverter);


    }
}

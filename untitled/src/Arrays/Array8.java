package Arrays;
import java.util.*;

public class Array8 {
    //  Copie os elementos de um array para outro.
    public void copiarElementos(){
        String[] arrayParaCopia = {"Banana", "Maçã", "Manga", "Kiwi"};

        String[] arrayQueEstaCopiando = new String[4];
        System.arraycopy(arrayParaCopia,0,arrayQueEstaCopiando,0,4 );
        System.out.println("Array que vai ser copiada: " + Arrays.toString(arrayParaCopia));
        System.out.println("Array que está copiando" + Arrays.toString(arrayQueEstaCopiando));

    }

}

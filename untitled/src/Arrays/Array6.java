package Arrays;
import java.util.ArrayList;

public class Array6 {
    // 6. Verifique se um determinado valor existe dentro de um array.

    public void verificarValor(){
        ArrayList<String> valores = new ArrayList<String>();
        valores.add("Ingrid");
        valores.add("Munhoz");


        // values verifica se há com contains
        if (valores.contains("Ingrid")){
            System.out.print("Valor existe na array");
        }


    }
}

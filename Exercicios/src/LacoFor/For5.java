package LacoFor;

public class For5{
    // Imprima os números pares de 0 a 20 usando for.
    public void paresZeroAVinte() {
        int numerosPares = 0;

        for (int i = 0; i <= 20; i++) {
            if ( i % 2 == 0){
                System.out.println(i);
                numerosPares++;
            }

        }
    }
}

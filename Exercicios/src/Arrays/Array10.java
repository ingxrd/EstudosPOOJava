package Arrays;

public class Array10 {
    // Calcule a média dos valores armazenados em um array.
    public void calcularMediaArray(){
        int[] arrayParSoma = new int[]{10,20,30,40,50};
       int armazenaSoma = 0;
       

        for (int i = 0; i < arrayParSoma.length; i++ ){
            armazenaSoma += arrayParSoma[i];
        }
        System.out.println("Soma total: " + armazenaSoma);
        float mediaSoma = armazenaSoma/5;
        System.out.println("Média dos valores da Array: " + mediaSoma);
    }
}

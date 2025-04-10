package LacoFor;

public class For6 {


    // Calcule o fatorial de um número usando for.

    public void calcularFatorial(){
        int fatorial = 1;
        int numero = 5;
        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de "+ numero + " é: " + fatorial);
    }
}

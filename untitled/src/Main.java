import Animal.*;

public class Main{
    public static void main(String args[]){
        System.out.println("Olá, mundo!");

        /*
        Exemplo exemplo = new Exemplo();
        exemplo.mostrarMensagem();

        Array1 array1 = new Array1();
        array1.arrayAleatorio();

        Array2 array2 = new Array2();
        array2.arrayDeInteiros();

        Array3 array3 = new Array3();
        array3.verificarMaiorMenorValor();

        Array4 array4 = new Array4();
        array4.numerosParesArray();

        Array5 array5 = new Array5();
        array5.inverterElementos();

        Array6 array6 = new Array6();
        array6.verificarValor();

        Array7 array7 = new Array7();
        array7.removerValorArray();

        Array8 array8 = new Array8();
        array8.copiarElementos();

        Array9 array9 = new Array9();
        array9.ordemCrescente();

        Array10 array10 = new Array10();
        array10.calcularMediaArray();


        // FOR

        For1 for1 = new For1();
        for1.imprimirUmACem();

        For2 for2 = new For2();
        for2.somaNumeros();

        For3 for3 = new For3();
        for3.tabuadaDo7();

        For4 for4 = new For4();
        for4.multiplosDeTres();

        For5 for5 = new For5();
        for5.paresZeroAVinte();

        For6 for6 = new For6();
        for6.calcularFatorial();

        For7 for7 = new For7();
        for7.OrdemDecrescente();


        // POO

        Pessoa pessoa = new Pessoa("Ingrid", 28);
        pessoa.exibirDadosPessoas();

        ContaBancaria cc = new ContaBancaria(123,30,100);
        cc.depositar(200);
        cc.depositar(400);
        cc.sacar(100);
        cc.sacar(1000);
        cc.consultarSaldo();

        ContaBancaria cc2 = new ContaBancaria(234, 40, 300);
        cc2.sacar(100);
        cc2.consultarSaldo();

        Produto produto1 = new Produto("Calculadora", 12.43, 12);
        produto1.exibirInformacoesProduto();

        Aluna aluna1 = new Aluna("Ingrid", 10,8);
        aluna1.calcularMedia();

        Carro carro1 = new Carro("Volvo", "Preto", 50);
        carro1.exibirVelocidadeAtual();
        carro1.acelerar(100);
        carro1.acelerar(10);
        carro1.exibirVelocidadeAtual();
        carro1.desacelerar(10);
        carro1.exibirVelocidadeAtual();

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "Jk Rowling", 350);
        livro1.mostrarInformacoesDoLivro();
         */

        // POO 2

        Cachorro cachorro1 = new Cachorro("Shitszu", "Preto", "Tito");
        cachorro1.emitirSom();
        cachorro1.setRaca("Vira-lata");
        System.out.println("Nome do cachorro: " + cachorro1.getNome());
        System.out.println("Raça do cachorro: " + cachorro1.getRaca());

        Gato gato1 = new Gato("Vira-lata", "Rajado", "Bolinha");
        System.out.println("Nome do gato: " + gato1.getNome());
        System.out.println("Raça do gato: " + gato1.getRaca());
        gato1.emitirSom();



    }
}
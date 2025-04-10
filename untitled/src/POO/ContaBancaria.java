package POO;
public class ContaBancaria {
    int conta;
    int agencia;
    float saldo;

    public ContaBancaria(int conta, int agencia, float saldo){
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public float sacar(float valorSaque){
        if (valorSaque <= saldo){
            saldo = saldo - valorSaque;
            System.out.println("Saldo da Conta Corrente atualizado: " + saldo);
            return valorSaque;
        } else {
            System.out.println(" Saldo insuficiente na conta. \n Saldo atual da Conta Corrente: " + saldo);
        }
        return 0;
    }

    public float depositar(float valorDeposito){
        saldo = saldo + valorDeposito;
        return valorDeposito;
    }

    public float consultarSaldo(){
        return saldo;
    }
}


package Conta;

import java.util.ArrayList;
import java.util.List;

public class BancoCC {
    
    private List<Conta> contas;
    
    public BancoCC(){
        contas = new ArrayList();
    }
    public class ContaCorrente extends Conta{
        
        public ContaCorrente(String titular) {
            super(titular);
        }
        public void atualiza (double taxa){
            super.atualiza(taxa*2); 
        }
        
    }
    
    public void criaConta(){
        
    }
    
    public static void main(String[] args){
        Conta minhaConta = new Conta(1234, "Aline");
        minhaConta.setLimite(100);
        
        if(minhaConta.deposita(1000)){
            System.out.println("Deposito Realizado com Sucesso!");
        }
        else{
            System.out.println("Valor invalido!");
        }
        System.out.println(minhaConta.toString()); //exibe a minhaconta
        
        Conta contaXuxu = new Conta(1111, "Xuxu");
        contaXuxu.setLimite(10);
        if(contaXuxu.saca(1000)){
          System.out.println("Saque Realizado com Sucesso!");
        }
        else{
            System.out.println("Saldo Indisponivel!");
           // System.out.println("saldo meuBanco.consultarSaldo(10000));
        }
        System.out.println(contaXuxu.toString()); //exibe a contaXuxu
    }
}
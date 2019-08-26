/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

import java.util.ArrayList;

/**
 *
 * @author Boneca
 */
public class NovoClass {
    public ArrayList<Conta> contas;
    public NovoClass(){
        contas = new ArrayList();
    }
    public void abrirConta(String titular, double saldo, double limite){
       Conta novaConta = new Conta(titular);
       novaConta.deposita(saldo);
       novaConta.setLimite(limite);
       contas.add(novaConta);
    }
    public Conta getConta(int numero){//metodo para sacar 
        for(int i=0; i<contas.size(); i++){ //percorrendo todos elementos dentro da conta, o size diz o tamanho
            if(contas.get(i).getNumero()== numero)
                return contas.get(i);
        }
        return null;
    }
    public boolean sacar(int numero, double valor, ){
        Conta conta = getConta(numero);
        if(conta != null){
            if((conta.getSaldo() + conta.getLimite()) > valor){
                
                return conta.saca(valor); //FUNÇÃO EXISTENTE QUE JÁ FAZ ISSO
            }
        }
        return false;
    }
    
    public double consultarSaldo(int numero) throws Exception{
        Conta conta = getConta(numero);
        if(conta != null){
            return conta.getSaldo();
        }
     throw new Exception ("Conta inexistente");
    }
    
    public void transferencia(int contaDebito, int contaCredito, double valor, throws Exception){
        Conta contaCredito = getConta(numeroCredito); //depositar valor
        Conta contaDebito = getConta(numeroDebito); //sacar valor
        if(contaDebito != null && contaCredito != null)
            throw new Exception("Conta débito inexistente");
        if(contaCredito == null)
            throw new Exception("Conta crédito inexistente");
        if(contaDebito.saca(valor)){
            contaCredito.deposita(valor);
        }
        else{
           throw new Exception("Saldo indisponível");
        }
    }
    public void listaContas(){
        for(Conta conta : contas){
            conta.listar();
        }
    }
}
    
    

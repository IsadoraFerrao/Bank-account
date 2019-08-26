package Conta;

public class Conta{ //CLASSE
    private int numero;
    private String titular;
    private double saldo;
    private double limite;
    
    public Conta(int numero, String titular){ //METODO
        this.numero = numero;
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double novoLimite){
        limite = novoLimite;
    }
    public boolean saca(double valor){
        if(saldo + limite >= valor){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    //static só é valido quando a operação é direta com os parametros de entrada
    public String toString(){
        String dado = "Conta\n";
        dado += "Numero: "+ getNumero()+"\n";
        dado += "Titular: "+ getTitular()+"\n";
        dado += "Saldo: "+ saldo +"\n";
        dado += "Limite "+ limite +"\n";
        return dado;
    }
    public boolean deposita(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    public void setTitular(String novoNome){
        titular = novoNome;
    }
}
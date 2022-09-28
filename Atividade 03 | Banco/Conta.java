
package banco;

public class Conta{
    
    public String tipoDeConta;
    public double saldo;
    public double deposito;
    public double saque;
    
    
    public Conta(String pTipoDeConta){
        tipoDeConta = pTipoDeConta;
        saldo = 500;
    }
    public boolean depositar(double somar){
        if(somar<=1000){
        deposito = somar;
        saldo = saldo + somar;
        return true;
        }else{
        deposito = somar;
        return false;
        }
    }

    public boolean sacar(double debitar){
        if(debitar<=saldo){
        saque = debitar;
        saldo =  saldo - debitar;
        return true;
        }else{
        saque = debitar;
        return false;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double pSaldo){
        saldo = pSaldo;
    }
    public double getSaque(){
        return saque;
    }
    public double getDeposito(){
        return deposito;
    }
    
    
    
    
    }
    
    


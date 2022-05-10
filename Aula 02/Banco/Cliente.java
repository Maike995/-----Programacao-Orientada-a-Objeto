/*
02 - Crie uma classe Conta com os atributos tipo da conta e saldo. Crie os seguintes métodos.
Um método construtor que tem como parâmetro o valor inicial do depósito.
Um método depositar que tem como parâmetro o valor a ser depositado que por segurança não deve permitir depósitos acima de 1.000,00.
Um método sacar que tem como parâmetro o valor a ser debitado. O método não deve permitir 
saque superior ao saldo da conta.
A seguir, teste a classe como seguinte roteiro: Crie duas contas com depósitos iniciais 
de 500,00. Tente depositar 300,00 na conta 1;
Tente sacar 100,00 na conta 2; Tente sacar 900,00 na conta 1; Tente depositar 1.200,00 na conta 2.
*/

package banco;


public class Cliente
        
{
	public static void main(String[] args) {
	    
    Conta contaCorrente = new Conta("Conta Corrente");
    Conta contaSalario = new Conta("Conta Salario");
    
     boolean sat;
    sat =  contaCorrente.depositar(300);
    if(sat==false) {     
        System.out.println("Seu deposito de "+contaCorrente.getDeposito()+" reais não pode ser concluido, pois nossa agencia só permite depositos no valor ou em valores abaixo de 1000 reais.");
    }else{
        System.out.println("Seu deposito de "+contaCorrente.getDeposito()+" reais foi realizado com sucesso.");
    }boolean set;
    set = contaSalario.sacar(100);
    if(set==false) {     
        System.out.println("Seu saque de "+contaSalario.getSaque()+" reais não pode ser concluido, sua conta não possui saldo suficiente para realizar este saque.");
    }else{
        System.out.println("Seu saque de "+contaSalario.getSaque()+" reais foi realizado com sucesso.");
    } boolean sit;
    sit = contaCorrente.sacar(900);
    if(sit==false) {     
        System.out.println("Seu saque de "+contaCorrente.getSaque()+" reais não pode ser concluido, sua conta não possui saldo suficiente para realizar este saque.");
    }else{
        System.out.println("Seu saque de "+contaCorrente.getSaque()+" reais foi realizado com sucesso.");
    } boolean sot;
    sot = contaSalario.depositar(1200);
    if(sot==false) {     
        System.out.println("Seu deposito de "+contaSalario.getDeposito()+" reais não pode ser concluido, pois nossa agencia só permite depositos no valor ou em valores abaixo de 1000 reais.");
    }else{
        System.out.println("Seu deposito de "+contaSalario.getDeposito()+" reais foi realizado com sucesso.");
    }
    
    System.out.println();
    System.out.println("A conta corrente possui: "+contaCorrente.getSaldo());
    System.out.println("A conta corrente possui: "+contaSalario.getSaldo());
	    
	}
}




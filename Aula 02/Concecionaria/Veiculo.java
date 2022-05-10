
package concecionaria;


public class Veiculo{
    
    public String nome;
    public String marca;
    public int ano;
    public double motor;
    public int numeroDeMarchas;
    public double velocidade;
    public double aceleracao;
    public double freio;
    
    public Veiculo(String pNome, String pMarca){
        
    nome = pNome;
    marca = pMarca;
    ano = 2020;
    motor = 1.3;
    numeroDeMarchas = 5;
    velocidade = 50;
        
    }
    
    public void acelerar(double aceleracao){
        this.aceleracao = aceleracao;
        velocidade = velocidade + aceleracao;
    }
    public void frear(double freio){
        this.freio = freio;
        velocidade = velocidade - freio;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    public double getAceleracao(){
        return aceleracao;
    }
    public double getFreio(){
        return freio;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}


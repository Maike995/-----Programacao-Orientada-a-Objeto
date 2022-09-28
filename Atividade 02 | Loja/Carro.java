package loja;

    public class Carro{
   
	public String nome;
	public String marca;
	public int ano;
	public double motor;
	public int numeroDeMarchas;
    
        
	public Carro(String pNome, String pMarca, int pAno, double pMotor, int pNumeroDeMarchas){
        
	nome = pNome;
	marca = pMarca;
	ano = pAno;
	motor = pMotor;
	numeroDeMarchas = pNumeroDeMarchas;
        }
    
	public Carro(String dNome, String dMarca){
        
	nome = dNome;
	marca = dMarca;
	ano = 2020;
	motor = 1.3;
	numeroDeMarchas = 5;
	}
    
    
	public void informarDados(){
	System.out.println("Carro [ Nome: " + nome + " | Marca: " + marca + " | Ano: " + ano + " | Motor: " + motor + "| Numero De Marchas: " + numeroDeMarchas + " ]");
	}
}
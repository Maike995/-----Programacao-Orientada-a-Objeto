/*
01 - Escreva um programa para armazenar dados de veículos.
A classe deve conter os atributos: nome, marca, ano, motor, número de marchas e velocidade.
Crie um método construtor que tenha como parâmetro somente nome e marca do carro 
e para os demais atributos considere o ano 2020, motor 1.3, 5 marchas e velocidade 50 km/h.
Crie um método acelerar que aumenta a velocidade do veículo de acordo com a aceleração (parâmetro).
Crie um método frear que diminui a velocidade do veículo de acordo com a redução (parâmetro).
Crie 2 veículos testando a classe criada.
*/
package concecionaria;


public class Main{
  
	public static void main(String[] args) {
	
	Veiculo ronda = new Veiculo("Ronda","Suzuki");
	System.out.println("O "+ronda.getNome()+" está a "+ronda.getVelocidade()+"km/h.");
  ronda.acelerar(50);
  System.out.println("O "+ronda.getNome()+" acelerou "+ronda.getAceleracao()+"km/h.");
	System.out.println("E agora a velociadade do "+ronda.getNome()+" é de "+ronda.getVelocidade()+"km/h.");
	
        System.out.println();
        
	Veiculo ferrari = new Veiculo("Ferrari","Fiat");
  System.out.println("A "+ferrari.getNome()+" está a "+ferrari.getVelocidade()+"km/h.");
	ferrari.frear(30);
	System.out.println("A "+ferrari.getNome()+" freou "+ferrari.getFreio()+"km/h.");
	System.out.println("E agora a velociadade da "+ferrari.getNome()+" é de "+ferrari.getVelocidade()+"km/h.");
	
	}
}
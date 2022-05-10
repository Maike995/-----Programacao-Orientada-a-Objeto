/*
03 - Escreva uma classe que represente um país. Um país é representado através dos atributos: sigla (ex.: BRA), nome (ex.:
Brasil), população (ex.: 200.333.444) e a sua dimensão em Km2 (ex.: 8.515.767,049).
Escreva a classe em Java contendo:
Um método construtor que inicialize a sigla, o nome e a dimensão do país;
Os métodos de acesso (getter/setter) para as propriedades sigla, nome, população e dimensão do país;
Um método que retorne a densidade populacional do país;
*/

package dados;

public class Main{
  
	public static void main(String[] args) {
	
	Pais brasil = new Pais("BRA","Brasil",1000,1000);
	
        
	System.out.println("A densidade populacional do Brasil é de "+brasil.densidadecalcuc());
	System.out.println("A sigla do Brasil é "+brasil.getSigla());
	System.out.println("A população do Brasil é de "+brasil.getPopulacao());
  System.out.println("O brasil tem o tamanho de "+brasil.getDimensaoEmKm2()+"Km/m²");

	}
}
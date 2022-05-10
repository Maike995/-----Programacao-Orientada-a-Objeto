

package loja;

    public class Main{
	
    public static void main(String[] args) {
	    
	Carro fusca = new Carro("Fusca","Antigo",1990,1.0,2);
	fusca.informarDados(); 
	Carro carroca = new Carro("Carroça","velho",1500,3.0,3);
	carroca.informarDados();

        
	Carro ronda = new Carro("Ronda","novo");
	ronda.informarDados();
	Carro mobilete = new Carro("Mobilete","Moba");
	mobilete.informarDados();

	    
	}

}

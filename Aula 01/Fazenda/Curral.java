package fazenda;

public class Curral {

    public static void main(String[] args) {
        
       
		// Objetos
		Vaca mimosa = new Vaca("SE");
		mimosa.informarDados("Mimosa","Holandesa","Preto e Branco",1.40,2,700,"SE");
		mimosa.imprimirDados();
		
		Vaca docinho = new Vaca("SE");
		docinho.informarDados("Docinho","Jersey","Preto",1.60,2,800,"Ba");
		docinho.imprimirDados();
                
		Vaca delegada = new Vaca("SE");
		delegada.informarDados("Delegada","Jersey","Preto",1.8,1,900,"AL");
		delegada.imprimirDados();
		
                
	}
}

        
        
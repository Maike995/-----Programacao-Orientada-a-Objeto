package fazenda;

public class Vaca {
    
    // Atributos
    public String registro;
    public String raca;
    public String cor;
    public double tamanho;
    public int idade;
    public double peso;
    public String ufnasc;
  
    // Construtor
    public Vaca(String pUfnasc){
        ufnasc = pUfnasc;
    }
    
    // Metodos
        public void comer(String alimento, double quant){
            peso = peso + quant * 0.05;
            System.out.println("Comendo" + quant + "g de " + alimento + ".");
        }
        public void ruminar(){
            System.out.println("Ruminando a comida");
        }
        public double produzirLeite(){
            return peso * 0.02;
        }
        public void caminhar(double distancia){
            System.out.println("Caminhando" + distancia + "metros.");
        }
        
        public void informarDados (String pReg, String pRaca, String pCor, double pTam, int pIdade, double pPeso, String pUfnasc){
            registro = pReg;
            raca = pRaca;
            cor = pCor;
            tamanho = pTam;
            idade = pIdade;
            peso = pPeso;
            //ufnasc = pUfnasc;
        }
        public void imprimirDados (){
            System.out.println("Vaca = [ Registro: "+registro+"| Raça: "+raca+ "| Cor: " + cor + "| Tamanho: " +tamanho+ "| Idade: " +
                    idade+ "| Peso: "+peso+"| UFNASC: " +ufnasc+ " ]");
        }

}

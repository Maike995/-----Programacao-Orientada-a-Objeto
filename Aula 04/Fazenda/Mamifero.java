
package fazenda;


public class Mamifero extends Animal{

  private String alimento;

  public Mamifero(String nome, double comprimento, int nr_patas, String cor, String ambiente, double velocidade, String alimento){

      this.nome = nome;
      this.comprimento = comprimento;
      this.nr_patas = nr_patas;
      this.cor = cor;
      this.ambiente = ambiente;
      this.velocidade = velocidade;
      this.alimento = alimento;
  
  }

  public String getAlimento(){
    return alimento;
  }
  public void setAlimento(String alimento){
    this.alimento = alimento;
  }

  public void dados(){
  System.out.println("Dados do Animal| Nome: "+nome+" | Comprimento: "+comprimento+"Cm | Numero de patas: "+nr_patas+" | Cor: "+cor+" | Ambiente: "+ambiente+" | Velocidade: "+velocidade+"m/s | Alimento: "+alimento);
  
}

  
}
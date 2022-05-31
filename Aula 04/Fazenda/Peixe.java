
package fazenda;


public class Peixe extends Animal{

  private String caracteristicas;

  public Peixe( String nome, float comprimento, int nr_patas, String cor, String ambiente, double velocidade, String caracteristicas){
      
      
      this.nome = nome;
      this.comprimento = comprimento;
      this.nr_patas = nr_patas;
      this.cor = cor;
      this.ambiente = ambiente;
      this.velocidade = velocidade;
      this.caracteristicas = caracteristicas;
  
  }

  public String getCaracteristicas(){
    return caracteristicas;
  }
  public void setCaracteristicas(String caracteristicas){
    this.caracteristicas = caracteristicas;
  }

  public void dados(){
  System.out.println("Dados do Animal| Nome: "+nome+" | Comprimento: "+comprimento+"Cm | Numero de patas: "+nr_patas+" | Cor: "+cor+" | Ambiente: "+ambiente+" | Velocidade: "+velocidade+"m/s | Caracteristicas: "+caracteristicas);
  
}

  
}
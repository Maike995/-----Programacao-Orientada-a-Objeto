
package fazenda;

public abstract class Animal {

  protected String nome;
  protected double comprimento;
  protected int nr_patas;
  protected String cor;
  protected String ambiente;
  protected double velocidade;

  

  public String getNome(){
    return nome;
  }
  public double getComprimento(){
    return comprimento;
  }
  public int getNr_patas(){
    return nr_patas;
  }
  public String getCor(){
    return cor;
  }
  public String getAmbiente(){
    return ambiente;
  }
  public double getVelocidade(){
    return velocidade;
  }


  public void setNome(String nome){
    this.nome = nome;
  }
  public void setComprimento(double comprimento){
    this.comprimento = comprimento;
  }
  public void setNr_patas(int nr_patas){
    this.nr_patas = nr_patas;
  }
  public void setCor(String cor){
    this.cor = cor;
  }
  public void setAmbiente(String ambiente){
    this.ambiente = ambiente;
  }
  public void setVelocidade(double velocidade){
    this.velocidade = velocidade;

  }


public abstract void dados();


  
}

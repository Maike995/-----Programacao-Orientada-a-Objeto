package clinica;
public abstract class Paciente{

  protected int cpf;
  protected String nome;

  public Paciente(int cpf, String nome){
    this.cpf=cpf;
    this.nome=nome;
  }
  
  public int getCpf(){
    return cpf;
  }
  public void setCpf(int cpf){
    this.cpf=cpf;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome=nome;
  }  

  public abstract void print(); 
  public abstract void agendarConsulta(String nomeEspecialidade, int numero, String tipo);

}
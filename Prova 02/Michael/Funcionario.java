
public abstract class Funcionario{

  protected String matricula;
  protected String nome;
  protected String sgEstadoNascimento;
  protected String sgDepartamento;
  protected double vlSalarioBase;
  protected double vlSalarioLiquido;
  protected double txINSS;
  protected int qtFilhos;

  public abstract void calculaSalario();

  public Funcionario(String matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){

    this.matricula=matricula;
    this.nome=nome;
    this.sgEstadoNascimento=sgEstadoNascimento;
    this.sgDepartamento=sgDepartamento;
    this.vlSalarioBase=vlSalarioBase;
    this.qtFilhos=qtFilhos;
    
    
  }



  
}

public class FuncionarioTemp extends Funcionario{

  protected String tempoContrato;

  public FuncionarioTemp(String matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){
  super(matricula,nome,sgEstadoNascimento,sgDepartamento,vlSalarioBase,qtFilhos);
    this.tempoContrato="12 meses";
    this.txINSS=10;
  }
  public void calculaSalario(){
    double vlSalarioconjunto=this.vlSalarioBase+(qtFilhos*100);
    this.vlSalarioLiquido=vlSalarioconjunto-(vlSalarioconjunto*this.txINSS/100); 
  }

  public String toString(){
    return "Tipo Func. : FuncionarioTemp | Matricula: "+matricula+" |Nome: "+nome+" |Sal. Base: "+vlSalarioBase+" | Num. Filhos: "+qtFilhos+" | Sal. Liquido: "+vlSalarioLiquido;
  }
}
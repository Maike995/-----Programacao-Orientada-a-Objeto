

public class FuncionarioCLT extends Funcionario{

protected double vlSalarioProdutividade;

public FuncionarioCLT(String matricula,String nome,String sgEstadoNascimento,String sgDepartamento,double vlSalarioBase,int qtFilhos){
  super(matricula,nome,sgEstadoNascimento,sgDepartamento,vlSalarioBase,qtFilhos);
  this.vlSalarioProdutividade=500;
  this.txINSS=20;
  
}

  public void calculaSalario(){
    double vlSalarioconjunto=this.vlSalarioBase+(qtFilhos*100)+this.vlSalarioProdutividade; 
    this.vlSalarioLiquido = vlSalarioconjunto-(vlSalarioconjunto*this.txINSS/100);
  }

  public void calculaAumentoSalarial(String matricula,double percentual){
    if (this.matricula == matricula) {
    this.vlSalarioBase = this.vlSalarioBase*(1+percentual/100);
    }
  }
  public void calculaAumentoSalarial(double valorDeAumento,String matricula){
    if (this.matricula == matricula) {
    this.vlSalarioBase = this.vlSalarioBase+valorDeAumento;
    }
  }



  public String toString(){
    return "Tipo Func. : FuncionarioCLT  | Matricula: "+matricula+" |Nome: "+nome+" |Sal. Base: "+vlSalarioBase+" | Num. Filhos: "+qtFilhos+" | Sal. Liquido: "+vlSalarioLiquido;
  }
  
  
}
package avaliacaopoo;

public class FuncionarioCLT extends Funcionario {
	
	private double vlSalarioProdutividade;
	
	public FuncionarioCLT(int matricula, String nome, String sgEstadoNascimento, String sgDepartamento, double vlSalarioBase, int qtFilhos) {
		super(matricula, nome, sgEstadoNascimento, sgDepartamento, vlSalarioBase, qtFilhos);
		super.setTxINSS(0.2);
		this.vlSalarioProdutividade = 500;
		super.setTipoFuncionario("Funcionário CLT");
	}

	public double getVlSalarioProdutividade() {
		return vlSalarioProdutividade;
	}

	public void setVlSalarioProdutividade(double vlSalarioProdutividade) {
		this.vlSalarioProdutividade = vlSalarioProdutividade;
	}

	@Override
	public void calculaSalario() {
		double salarioBruto =  (super.getVlSalarioBase() + super.getVlAuxilioFilhos()*super.getQtFilhos() + this.getVlSalarioProdutividade());
		super.setVlSalarioLiquido(salarioBruto-(salarioBruto*super.getTxINSS()));
	}
	
	public void calculaAumentoSalarial(int matricula, double pctAumento) {
		if (super.getMatricula() == matricula) {
			double aumento = super.getVlSalarioLiquido()*pctAumento;
			super.setVlSalarioLiquido(super.getVlSalarioLiquido() + aumento);
		} 
	}
	
	public void calculaAumentoSalarial(double valorAumento, int matricula) {
		if(super.getMatricula() == matricula) {
			super.setVlSalarioLiquido(super.getVlSalarioLiquido() + valorAumento);
		} 
	}

}

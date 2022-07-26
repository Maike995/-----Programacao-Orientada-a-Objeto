package avaliacaopoo;

public class FuncionarioTemp extends Funcionario {
	
	private int tempoContrato;
	
	public FuncionarioTemp(int matricula, String nome, String sgEstadoNascimento, String sgDepartamento, double vlSalarioBase, int qtFilhos) {
		super(matricula, nome, sgEstadoNascimento, sgDepartamento, vlSalarioBase, qtFilhos);
		super.setTipoFuncionario("Funcionário Temp");
		super.setTxINSS(0.1);
		this.tempoContrato = 12;
	}

	@Override
	public void calculaSalario() {
		double salarioBruto = (super.getVlSalarioBase() + super.getVlAuxilioFilhos()*super.getQtFilhos());
		super.setVlSalarioLiquido(salarioBruto-(salarioBruto*super.getTxINSS()));
	}

	@Override
	public void calculaAumentoSalarial(int matricula, double pctAumento) {
		if (super.getMatricula() == matricula) {
			double aumento = super.getVlSalarioLiquido()*pctAumento;
			super.setVlSalarioLiquido(super.getVlSalarioLiquido() + aumento);
		}
	}

	@Override
	public void calculaAumentoSalarial(double valorAumento, int matricula) {
		if(super.getMatricula() == matricula) {
			super.setVlSalarioLiquido(super.getVlSalarioLiquido() + valorAumento);
		} 
	}

}

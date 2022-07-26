public class FuncionarioCLT extends Funcionario {
	private double vlSalarioProdutividade;

	public FuncionarioCLT(int matricula, String nome, String sgEstadoNascimento, String sgDepartamento,
			double vlSalarioBase) {
		super(matricula, nome, sgEstadoNascimento, sgDepartamento, vlSalarioBase);
		vlSalarioProdutividade = 500;
		setINSS(0.20);
	}

	public double getSalarioProdutividade() {
		return this.vlSalarioProdutividade;
	}

	@Override
	public double calculaSalario() {
		this.vlSalarioLiquido = getSalarioBase() + (100 * getQtFilhos() + getSalarioProdutividade());
		return this.vlSalarioLiquido = this.vlSalarioLiquido - (this.vlSalarioLiquido * getINSS());
	}

	public void calculaAumentoSalarial(int matricula, double percentual) {
		setSalarioBase(getSalarioBase() + (getSalarioBase() * (percentual / 100)));
	}

	public void calculaAumentoSalarial(double valor, int matricula) {
		setSalarioBase(getSalarioBase() + valor);
	}

}

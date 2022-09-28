
public abstract class Funcionario {
	private int matricula;
	private String nome;
	private String sgEstadoNascimento;
	private String sgDepartamento;
	private double vlSalarioBase;
	private double txINSS;
	private int qtFilhos;
	protected double vlSalarioLiquido;

	public Funcionario(int matricula, String nome, String sgEstadoNascimento, String sgDepartamento,
			double vlSalarioBase) {
		this.matricula = matricula;
		this.nome = nome;
		this.sgEstadoNascimento = sgEstadoNascimento;
		this.sgDepartamento = sgDepartamento;
		this.vlSalarioBase = vlSalarioBase;
		this.vlSalarioLiquido = 0.0;
		this.txINSS = 0.0;
		this.qtFilhos = 0;
	}

	public abstract double calculaSalario();

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setEstadoNascimento(String sgEstadoNascimento) {
		this.sgEstadoNascimento = sgEstadoNascimento;
	}

	public String getEstadoNascimento() {
		return this.sgEstadoNascimento;
	}

	public void setDepartamento(String sgDepartamento) {
		this.sgDepartamento = sgDepartamento;
	}

	public String getDepartamento() {
		return this.sgDepartamento;
	}

	public void setINSS(double txINSS) {
		this.txINSS = txINSS;

	}

	public double getINSS() {
		return this.txINSS;
	}

	public void setSalarioBase(double vlSalarioBase) {
		this.vlSalarioBase = vlSalarioBase;
	}

	public double getSalarioBase() {
		return this.vlSalarioBase;
	}

	public void setQtFilhos(int qtFilhos) {
		this.qtFilhos = qtFilhos;
	}

	public int getQtFilhos() {
		return this.qtFilhos;
	}

	public double getSalarioLiquido() {
		return this.vlSalarioLiquido;
	}

	@Override
	public String toString() {
		return "|   " + getMatricula() + "   |" + getNome() + " |  " + getSalarioBase() + "   |    " + getQtFilhos()
				+ "   |   " + calculaSalario();
	}

}
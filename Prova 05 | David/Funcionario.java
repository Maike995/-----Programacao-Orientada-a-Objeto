package avaliacaopoo;

public abstract class Funcionario {
	
	private int matricula;
	private String nome;
	private String sgEstadoNascimento;
	private String sgDepartamento;
	private double vlSalarioBase;
	private double vlSalarioLiquido;
	private double txINSS;
	private int qtFilhos;
	private double vlAuxilioFilhos;
	private String tipoFuncionario;

	
	public Funcionario(int matricula, String nome, String sgEstadoNascimento, String sgDepartamento, double vlSalarioBase, int qtFilhos) {
		this.matricula = matricula;
		this.nome = nome;
		this.sgEstadoNascimento = sgEstadoNascimento;
		this.sgDepartamento = sgDepartamento;
		this.vlSalarioBase = vlSalarioBase;
		this.vlAuxilioFilhos = 100;
		this.qtFilhos = qtFilhos;
	}
	
	
	public abstract void calculaSalario();
	
	public abstract void calculaAumentoSalarial(int matricula, double pctAumento);
	
	public abstract void calculaAumentoSalarial(double valorAumento, int matricula);
	
	
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}


	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	
	public double getVlAuxilioFilhos() {
		return vlAuxilioFilhos;
	}
	
	
	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSgEstadoNascimento() {
		return sgEstadoNascimento;
	}


	public void setSgEstadoNascimento(String sgEstadoNascimento) {
		this.sgEstadoNascimento = sgEstadoNascimento;
	}


	public String getSgDepartamento() {
		return sgDepartamento;
	}


	public void setSgDepartamento(String sgDepartamento) {
		this.sgDepartamento = sgDepartamento;
	}


	public double getVlSalarioBase() {
		return vlSalarioBase;
	}


	public void setVlSalarioBase(double vlSalarioBase) {
		this.vlSalarioBase = vlSalarioBase;
	}


	public double getVlSalarioLiquido() {
		return vlSalarioLiquido;
	}


	public void setVlSalarioLiquido(double vlSalarioLiquido) {
		this.vlSalarioLiquido = vlSalarioLiquido;
	}


	public double getTxINSS() {
		return txINSS;
	}


	public void setTxINSS(double txINSS) {
		this.txINSS = txINSS;
	}


	public int getQtFilhos() {
		return qtFilhos;
	}


	public void setQtFilhos(int qtFilhos) {
		this.qtFilhos = qtFilhos;
	}
	
	
}

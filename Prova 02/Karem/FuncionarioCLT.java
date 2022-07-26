public class FuncionarioCLT extends Funcionario 
{
    private double vlSalarioProdutividade;  //como o salario produtividade eh colocado direto na variavael,
                                            //nao irei colocar metodos de acesso para o mesmo.

    public FuncionarioCLT(
        int matricula, 
        String nome, 
        String sgEstadoNascimento, 
        String sgDepartamento, 
        double vlSalarioBase)
    {
        super(matricula, nome, sgEstadoNascimento, sgDepartamento, vlSalarioBase);
        vlSalarioLiquido = 500.0;
        setINSS(0.20);
    }

    public double getSalarioProdutividade()
    {
        return this.vlSalarioProdutividade;
    }

    @Override
    public double calculaSalario()
    {
        this.vlSalarioLiquido = getSalarioBase() + (100.0 * getQtFilhos() + getSalarioProdutividade());
        return this.vlSalarioLiquido = this.vlSalarioLiquido - (this.vlSalarioLiquido * getINSS());
    }

    
    public void calculaAumentoSalarial(int matricula, double percentual)
    {
       setSalarioBase(getSalarioBase()+(getSalarioBase()*(percentual/100)));
    }

    public void calculaAumentoSalarial(double valor, int matricula)
    {
        setSalarioBase(getSalarioBase() + valor);
    }

}

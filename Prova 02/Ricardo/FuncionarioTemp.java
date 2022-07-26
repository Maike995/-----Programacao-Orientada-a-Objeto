public class FuncionarioTemp extends Funcionario
{
    private String tempContrato;
    
    public FuncionarioTemp(
        int matricula, 
        String nome, 
        String sgEstadoNascimento, 
        String sgDepartamento, 
        double vlSalarioBase)
    {
        super(matricula, nome, sgEstadoNascimento, sgDepartamento, vlSalarioBase);
        setINSS(0.10);
        this.tempContrato = "12 meses";
    }

    public void setTempoContrato(String tempo)
    {
        this.tempContrato = tempo;
    }

    public String getTempoContrato()
    {
        return this.tempContrato;
    }

    @Override
    public double calculaSalario()
    {
        this.vlSalarioLiquido = getSalarioBase() + (100 * getQtFilhos());
        return this.vlSalarioLiquido = this.vlSalarioLiquido - (this.vlSalarioLiquido * getINSS());
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Funcionario> funcionarios;
        funcionarios = new ArrayList<Funcionario>();
        FuncionarioCLT func1 = new FuncionarioCLT(1,"Funcionario 1","SE","Computação", 5000.00);
        FuncionarioCLT func2 = new FuncionarioCLT(2,"Funcionario 2","SE","Vendas", 5000.00);
        FuncionarioCLT func3 = new FuncionarioCLT(3,"Funcionario 3","SE","Vendas", 5000.00);
        FuncionarioTemp func4 = new FuncionarioTemp(4,"Funcionario 4","SE","Computação", 5000.00);
        FuncionarioTemp func5 = new FuncionarioTemp(5,"Funcionario 5","SE","Computação", 5000.00);
        FuncionarioTemp func6 = new FuncionarioTemp(6,"Funcionario 6","SE","Computação", 5000.00);
        funcionarios.add(func1);
        funcionarios.add(func2);
        funcionarios.add(func3);
        funcionarios.add(func4);
        funcionarios.add(func5);
        funcionarios.add(func6);
        func1.setQtFilhos(1);
        func3.setQtFilhos(8);
        label();
        showFunc(funcionarios);
        System.out.println("\nApos o aumento\n");
        func1.calculaAumentoSalarial(1, 50.0);
        func2.calculaAumentoSalarial(1000.0, 2);
        label();
        showFunc(funcionarios);
    }
    public static void label()
    {
        System.out.println("Tipo Funcionario | Matri |  Nome Func.  | Sal. Base | Filhos | Sal. Liqui.");
        System.out.println("--------------------------------------------------------------------------");
    }
    public static void showFunc(ArrayList<Funcionario> funcionarios)
    {
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof FuncionarioCLT)
            {
                System.out.println("Funcionario CLT  " + funcionarios.get(i));
            }
            else if(funcionarios.get(i) instanceof FuncionarioTemp)
            {
                System.out.println("Funcionario Temp " + funcionarios.get(i));
            }
        }
    }

}

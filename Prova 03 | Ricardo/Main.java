import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Funcionario> funcionarios;
		funcionarios = new ArrayList<Funcionario>();

		FuncionarioCLT funcionario_1 = new FuncionarioCLT(1, "Robert", "SP", "XXXX", 4500);
		FuncionarioCLT funcionario_2 = new FuncionarioCLT(2, "Ricardo", "SE", "YYY", 4000);
		FuncionarioCLT funcionario_3 = new FuncionarioCLT(3, "Rodrigo", "RS", "CCCC", 2000);
		FuncionarioTemp funcionario_4 = new FuncionarioTemp(4, "Reinan", "RJ", "WWWW", 8000);
		FuncionarioTemp funcionario_5 = new FuncionarioTemp(5, "Roberto", "PE", "GGGG", 7000);
		FuncionarioTemp funcionario_6 = new FuncionarioTemp(6, "Romario", "BA", "CCCC", 2000);

		funcionarios.add(funcionario_1);
		funcionarios.add(funcionario_2);
		funcionarios.add(funcionario_3);
		funcionarios.add(funcionario_4);
		funcionarios.add(funcionario_5);
		funcionarios.add(funcionario_6);

		funcionario_1.setQtFilhos(1);
		funcionario_2.setQtFilhos(3);
		funcionario_3.setQtFilhos(4);
		funcionario_4.setQtFilhos(5);
		funcionario_5.setQtFilhos(2);
		funcionario_6.setQtFilhos(7);

		ESPAC();

		funcionario(funcionarios);

		System.out.println("\n");

		funcionario_1.calculaAumentoSalarial(1, 50.0);
		funcionario_2.calculaAumentoSalarial(1000.0, 2);
		funcionario(funcionarios);
	}

	public static void funcionario(ArrayList<Funcionario> funcionarios) {
		for (int contador = 0; contador < funcionarios.size(); contador++) {
			if (funcionarios.get(contador) instanceof FuncionarioCLT) {
				System.out.println("Funcionario CLT  " + funcionarios.get(contador));
			} else if (funcionarios.get(contador) instanceof FuncionarioTemp) {
				System.out.println("Funcionario Temp " + funcionarios.get(contador));
			}
		}
	}

	public static void ESPAC() {
		System.out.println("Tipo Funcionario - Matricula -  Nome Func. - Salario. Base - Filhos - Salario Liquido.");
		System.out.println("_____________________________________________________________________________");
	}

}

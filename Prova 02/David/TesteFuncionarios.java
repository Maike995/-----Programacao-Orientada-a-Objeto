package avaliacaopoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		List<String> nome = Arrays.asList("Maria", "Pedro", "Carla", "Paulo", "Andre", "Paulo");
		List<String> sgEstadoNascimento = Arrays.asList("Rio de Janeiro", "São Paulo", "Ceará", "Pernambuco", "Sergipe", "Paraná");
		List<String> sgDepartamento = Arrays.asList("Recursos Humanos", "Contabilidade", "Produção", "Qualidade", "Manutenção", "TI");
		List<Double> vlSalarioBase = Arrays.asList(4500.0, 5000.0, 5000.0, 2800.0, 3500.0, 4200.0);
		List<Integer> numFilhos = Arrays.asList(0, 1, 2, 1, 2, 3);
		
		
		List<Funcionario> f = new ArrayList<>();
		
		System.out.println("Tipo Func.	- Matric.	- Nome		- Sal. Base	- Num Filhos		- Sal. Líquido");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			FuncionarioCLT fclt = new FuncionarioCLT(i+1, nome.get(i), sgEstadoNascimento.get(i), sgDepartamento.get(i), vlSalarioBase.get(i), 
					numFilhos.get(i));
			f.add(i, fclt);
			fclt.calculaSalario();
			System.out.printf("%15s  %5d	 %13s		 R$ %.2f	 %-15s	R$ %.2f", fclt.getTipoFuncionario(), fclt.getMatricula(), 
					fclt.getNome(), fclt.getVlSalarioBase(), fclt.getQtFilhos(), fclt.getVlSalarioLiquido());
			System.out.println();
		}
		
		for(int i = 3; i < 6; i++) {
			FuncionarioTemp ftemp = new FuncionarioTemp(i+1, nome.get(i), sgEstadoNascimento.get(i), sgDepartamento.get(i), vlSalarioBase.get(i),
					numFilhos.get(i));
			f.add(i, ftemp);
			ftemp.calculaSalario();
			System.out.printf("%15s  %4d	 %13s		 R$ %.2f	 %-15s	R$ %.2f", ftemp.getTipoFuncionario(), ftemp.getMatricula(), 
					ftemp.getNome(), ftemp.getVlSalarioBase(), ftemp.getQtFilhos(), ftemp.getVlSalarioLiquido());
			System.out.println();
		}
		
		f.get(0).calculaAumentoSalarial(1, 0.5);
		f.get(1).calculaAumentoSalarial(1000.0, 2);
		
		System.out.println("\nSalário Líquido de " + f.get(0).getNome() + "(pós aumento): " + f.get(0).getVlSalarioLiquido());
		System.out.println("\nSalário Líquido de " + f.get(1).getNome() + "(pós aumento): " + f.get(1).getVlSalarioLiquido());
		
	}

}

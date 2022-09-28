/*
 Em um sistema de loja, há 3 tipos de usuários:
gerente, funcionário e cliente. Todo usuário 
tem nome e senha. O cliente possui, além do nome e senha, 
outros dados cadastrais como endereço e data de nascimento. 
A classe funcionário possui o método “calcular venda” que contém os parâmetros 
“quantidade de venda” e “valor unitário” e “listar venda” que exibe uma mensagem 
“Relatório de Vendas”. O gerente pode fazer tudo que o funcionário pode e também possui 
acesso para o fechamento do caixa. Crie um esboço com atributos e métodos mencionados acima.
 */
package sistema;

public class Main {

    public static void main(String[] args) {
        
        
        Funcionario f1 = new Funcionario("Maike","5h");
        f1.calcularVenda(2,0.5,50);
        Funcionario f2 = new Funcionario("Ricardo","f6");
        f1.calcularVenda(8,5.5,850);
        
        Gerente g1 = new Gerente("Carlos","g8");
        g1.calcularVenda(42,6.5,540);
        g1.fechar();
        
        Cliente c1 = new Cliente("Marlon","54f8","Casa","18/08/2021");
      
        f1.dados();
        f2.dados();
        g1.dados();
        c1.dados();
     
    }
    
}

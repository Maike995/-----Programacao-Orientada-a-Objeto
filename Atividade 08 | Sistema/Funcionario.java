

package sistema;


public class Funcionario extends Usuario{
  
  public Funcionario(String nome, String senha){
  super(nome, senha);

  }
  

  public void calcularVenda(int quantidadeDeVenda, double valorUnitario, double listarVenda){
        System.out.println("Relatorio de vendas| Quantidade De Venda: "+quantidadeDeVenda+" | valor unitário: "+valorUnitario+" | listar venda: "+listarVenda);
    }
  
  public void dados(){
    System.out.println("Dados dos cliente| Nome: "+nome+" |Senha: "+senha);
    }
  
}

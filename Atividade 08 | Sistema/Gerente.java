

package sistema;



public class Gerente extends Funcionario{

  public Gerente(String nome, String senha){
    super(nome, senha);
  }
  
  public void fechar(){
        
        System.out.println("O caixa está feixado");
        
    }
  
  
}

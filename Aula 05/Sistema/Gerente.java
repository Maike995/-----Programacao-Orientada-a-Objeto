

package sistema;



public class Gerente extends Funcionario{

  public Gerente(String nome, int senha){
    super(nome, senha);
  }
  
  public void fechar(){
        
        System.out.println("O caixa está feixado");
        
    }
  
  
}

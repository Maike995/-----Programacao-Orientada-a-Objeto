
package sistema;

public abstract class  Usuario {
    
    
    protected String nome;
    protected int senha;

     public Usuario(String nome, int senha){
      this.nome=nome;
      this.senha=senha;
      }
  
    public String getNome(){
        return nome;
    }
    public int getSenha(){
        return senha;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSenha(int senha){
        this.senha=senha;
    }
    
    
    
}

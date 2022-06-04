
package sistema;

public abstract class  Empregado {
    
    
    protected String nome;
    protected int senha;
    
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
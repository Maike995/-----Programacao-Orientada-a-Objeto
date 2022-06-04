

package sistema;

public abstract class Cliente extends Usuario {
    
    
    protected String endereco;
    protected int dataDeNascimento;
    
    public Cliente(String nome, int senha, String endereco,int dataDeNascimento){
        
        this.nome=nome;
        this.senha=senha;
        this.endereco=endereco;
        this.dataDeNascimento=dataDeNascimento;
    }
    
    
    
    public String getEndereco(){
        return endereco;
    }
    public int getDataDeNascimento(){
        return dataDeNascimento;
    }

    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public void setDataDeNascimento(int dataDeNascimento){
        this.dataDeNascimento=dataDeNascimento;
    }
    
    public void dados(){
    System.out.println("Dados dos cliente| Nome: "+nome+" |Senha: "+senha+" | Endereço: "+endereco+" | Data de Nascimento: "+dataDeNascimento);
    }
}
  
}
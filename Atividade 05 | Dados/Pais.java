
package Dados;


public class Pais{
    
    public String sigla;
    public String nome;
    public int populacao;
    public double dimensaoEmKm2;
   
    
    public Pais(String pSigla, String pNome, int pPopulacao, double pDmensaoEmKm2){
        sigla = pSigla;
        nome = pNome;
        populacao = pPopulacao;
        dimensaoEmKm2 = pDmensaoEmKm2;
    }
    
    public double densidadecalcuc(){
        return (populacao/dimensaoEmKm2);
    }
    
    public void setSigla(String pSigla){
        sigla = pSigla;
    }
    public String getSigla(){
        return sigla;
    }
    public void setNome(String pNome){
        nome = pNome;
    }
    public String getNome(){
        return nome;
    }
    public void setPopulacao(int pPopulacao){
        populacao = pPopulacao;
    }
    public int getPopulacao(){
        return populacao;
    }
    public void setDimensaoEmKm2(double pDimensaoEmKm2){
        dimensaoEmKm2 = pDimensaoEmKm2;
    }
    public double getDimensaoEmKm2(){
        return dimensaoEmKm2;
    }
   

    

}
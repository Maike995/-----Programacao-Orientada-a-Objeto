/*
Crie um classe Professor que contenha os atributos nome, titulação, área de atuação, instituição da sua titulação e matrícula. A seguir crie:
01 - Construtor com todos os atributos como parâmetros (exceto matrícula);
02 - Encapsulamento de todos os atributos (get e set);
03 - Crie três atributos de classe (matrícula, total de mestres, total de doutores). Estes atributos devem ser atualizados no construtor da classe.
04 - O atributo matrícula será uma número sequencial (atualizado a cada objeto instanciado).
05 - Teste a classe criada (criar objetos) com 4 professores (3 mestres e 1 doutor).
06 - Crie uma classe Departamento que contenha os atributos sigla, nome, campus de atuação e um professor que faz o papel de coordenador do departamento (relacionamento "tem-um").
07 - Teste a classe criada com dois departamentos.
08 - O primeiro departamento considere o coordenador um novo professor (professor 5).
09 - O segundo departamento considere o coordenador um professor já existente (professor 3).
10 - Modifique o coordenador do departamento 1 para o professor 2.
*/

package escola;

public class Professor {
    
    //Atributos
    public String nome;
    public String titulacao;
    public String areaDeAtuacao;
    public String intituicaoDeTitulacao;
    public int matricula;
    public static int contador;
    public static int totalDeMestres;
    public static int totalDeDoutores;
    
    //Meotodo Construtor
    public Professor(String nome, String titulacao, String areaDeAtuacao, String intituicaoDeTitulacao){
        
        contador++;
        this.nome=nome;
        this.titulacao=titulacao;
        this.areaDeAtuacao=areaDeAtuacao;
        this.intituicaoDeTitulacao=intituicaoDeTitulacao;
        this.matricula = contador;

        if(titulacao.equalsIgnoreCase("Mestre")){
            totalDeMestres++;
        }
        if(titulacao.equalsIgnoreCase("Doutor")) {
            totalDeDoutores++;
        }
    }
    
    //Get
    public String getNome(){
        return nome;
    }
    public String getTitulacao(){
        return titulacao;
    }
    public String getAreaDeAtuacao(){
        return areaDeAtuacao;
    }
    public String getIntituicaoDeTitulacao(){
        return intituicaoDeTitulacao;
    }
    public int getMatricula(){
        return matricula;
    }
    public int getTotalDeMestres(){
        return totalDeMestres;
    }
    public int getTotalDeDoutores(){
        return totalDeDoutores;
    }
    
    
    //Set
    public void setNome(String nome){
        this.nome=nome;
    } 
    public void setTitulacao(String titulacao){
        this.titulacao=titulacao;
    }
    public void setAreaDeAtuacao(String areaDeAtuacao){
        this.areaDeAtuacao=areaDeAtuacao;
    }
    public void setIntituicaoDeTitulacao(String intituicaoDeTitulacao){
        this.intituicaoDeTitulacao=intituicaoDeTitulacao;
    }
    
}

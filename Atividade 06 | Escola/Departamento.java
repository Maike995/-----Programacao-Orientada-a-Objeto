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

public class Departamento {
    
    public String sigla;
    public String nome;
    public String campusDeAtuacao;
    public Professor coordenador;
    
    public Departamento(String sigla, String nome, String campusDeAtuacao){
        
        this.sigla=sigla;
        this.nome=nome;
        this.campusDeAtuacao=campusDeAtuacao;
        
    }
    
     public String getNome(){
        return nome;
    }
    
    
}

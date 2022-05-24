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

public class Main {

    public static void main(String[] args) {
       

       Professor p1 = new Professor("Telmo", "Mestre", "Informatica", "UFS");
       System.out.println("Professor " + p1.getNome() + " foi cadastrado com a matricula " + p1.getMatricula());

       Professor p2 = new Professor("Maria", "Mestre", "Arquitetura", "IFS");
       System.out.println("Professor " + p2.getNome() + " foi cadastrado com a matricula " + p2.getMatricula());

       Professor p3 = new Professor("Rubens", "Doutor", "Informatica", "UFAL");
       System.out.println("Professor " + p3.getNome() + " foi cadastrado com a matricula " + p3.getMatricula());

       Professor p4 = new Professor("Ana", "Mestre", "Informatica", "UFS");
       System.out.println("Professor " + p4.getNome() + " foi cadastrado com a matricula " + p4.getMatricula());

       System.out.println("____________________________________________");
       System.out.println("Total de Professores Cadastrados: " + Professor.contador);
       System.out.println("Total de Mestres   : " + Professor.totalDeMestres);
       System.out.println("Total de Doutores  : " + Professor.totalDeDoutores);
       System.out.println("____________________________________________");

       // Composição de Classe
       Departamento d1 = new Departamento("CBSI","Coordenação do Bacharelado de SI", "Lagarto");
       d1.coordenador = new Professor("Catuxe", "Mestre", "Informática", "UFPB");

       Departamento d2 = new Departamento("IRC","Coordenação do Integrado em RC", "Lagarto");
       d2.coordenador = p3;

       System.out.println("____________________________________________");
       System.out.println("Total de Professores Cadastrados: " + Professor.contador);
       System.out.println("Total de Mestres   : " + Professor.totalDeMestres);
       System.out.println("Total de Doutores  : " + Professor.totalDeDoutores);
       System.out.println("____________________________________________");

       // Mudando o coordenador
       System.out.println("Coodenador do Curso: " + d1.coordenador.nome);
       System.out.println("Coodenador do Curso: " + d2.coordenador.nome);
       System.out.println("____________________________________________");

       d1.coordenador = p2;
       System.out.println("Coodenador do Curso: " + d1.coordenador.nome);
       System.out.println("Coodenador do Curso: " + d2.coordenador.nome);
 }}
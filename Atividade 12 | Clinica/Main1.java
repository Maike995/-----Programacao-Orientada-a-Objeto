
package clinica;
import java.util.*;
  
class Main {
    public static void main(String[] args) {

      System.out.println();

      Scanner dados = new Scanner(System.in);
      ArrayList<Conveniado> listaC = new ArrayList<Conveniado>();
      ArrayList<NaoConveniado> listaNC = new ArrayList<NaoConveniado>();
      
      
     int[] cpfs = {41243142,657657457,575675673,65876584,678678764};
     String[] nomes = {"Maria","Myke","João","Ana","Fernanda"};
     int[] cartaoNumeros = {646412142,545657457,1235756673,1231265584,678231764};
     String[] bandeiras = {"Visa","MasterCarde","Cielo","Bradesco","Girasol"};
     int[] numConvenios = {646412142,545657457,1235756673,1231265584,678231764};
     String[] nomeConvenios = {"Alabama","Luchanburgo","Crelo","Bradusco","Girabol"};
     
     String[] especialidades = {"pediatra","cardiologista","dermatologista","pneumologista","ginecologista","dentista"};
     String[] especialidades2 = {"pneumologista","ginecologista","pediatra","dermatologista","cardiologista"};
     
      for(int x = 0 ; x<5 ; x++){
        if(x % 2 == 0){
          
          int cpf = cpfs[x];
          String nome = nomes[x];
          int cartaoNumero = cartaoNumeros[x];
          String cartaoBandeira = bandeiras[x];
          NaoConveniado p = new NaoConveniado(cpf,nome,cartaoNumero,cartaoBandeira);

          String especialidade1 = especialidades[x];
          String especialidade2 = especialidades[5-x];
          p.agendarConsulta(especialidade1,cartaoNumero,cartaoBandeira);
          p.agendarConsulta(especialidade2,cartaoNumero,cartaoBandeira);
          
          listaNC.add(p);
  
        }else{
          
          int cpf = cpfs[x];
          String nome = nomes[x];
          int numConvenio = numConvenios[x];
          String nomeConvenio = nomeConvenios[x];
          Conveniado p = new Conveniado(cpf,nome,numConvenio,nomeConvenio);

  
          String especialidade1 = especialidades[x];
          String especialidade2 = especialidades[5-x];
          p.agendarConsulta(especialidade1,numConvenio,nomeConvenio);
          p.agendarConsulta(especialidade2,numConvenio,nomeConvenio);

          listaC.add(p);
        }
                                                          
      }


    
  }
}
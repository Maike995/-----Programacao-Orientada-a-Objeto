package clinica;

import java.util.*;
  
class Main {
    public static void main(String[] args) {

      System.out.println();

      
      ArrayList<Conveniado> listaC = new ArrayList<Conveniado>();
      ArrayList<NaoConveniado> listaNC = new ArrayList<NaoConveniado>();
      
      
     int[] cpfs = {41243142,657657457,575675673,65876584,678678764};
     String[] nomes = {"Maria","Myke","João","Ana","Fernanda"};
     int[] cartaoNumeros = {646412142,545657457,1235756673,1231265584,678231764};
     String[] bandeiras = {"Visa","MasterCarde","Cielo","Bradesco","Girasol"};
     int[] numConvenios = {646412142,545657457,1235756673,1231265584,678231764};
     String[] nomeConvenios = {"Alabama","Luchanburgo","Crelo","Bradusco","Girabol"};
     String[] especialidades = {"pediatra","cardiologista","dermatologista","pneumologista","ginecologista","dentista"};
     
     
     // Tamanho do vetor pfs.length
     // try catch tratamento de exeção
     
     try{
          for(int x = 0 ; x< cpfs.length ; x++){
          if(x % 2 == 0){
          
          NaoConveniado p = new       
          NaoConveniado(cpfs[x],nomes[x],cartaoNumeros[x],bandeiras[x]);
          p.agendarConsulta(especialidades[x],cartaoNumeros[x],bandeiras[x]);
          p.agendarConsulta(especialidades[5-x],cartaoNumeros[x],bandeiras[x]);
          
          listaNC.add(p);
  
        }else{
          
          Conveniado p = new 
          Conveniado(cpfs[x],nomes[x],numConvenios[x],nomeConvenios[x]);
          p.agendarConsulta(especialidades[x],numConvenios[x],nomeConvenios[x]);
          p.agendarConsulta(especialidades[5-x],numConvenios[x],nomeConvenios[x]);

          listaC.add(p);
        }
       }                                                    
      } catch(Exception e){
          System.out.println("Erro de Dados");
      }

  }
}
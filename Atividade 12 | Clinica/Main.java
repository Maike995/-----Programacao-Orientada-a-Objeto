import java.util.*;
  
class Main {
    public static void main(String[] args) {

      System.out.println();

      Scanner dados = new Scanner(System.in);
      ArrayList<Conveniado> listaC = new ArrayList<Conveniado>();
      ArrayList<NaoConveniado> listaNC = new ArrayList<NaoConveniado>();
      
      for(int i = 0 ; i<5 ; i++){
        if(i % 2 == 0){
          
          System.out.println("Digite o CPF do Paciente:");
          int cpf = dados.nextInt();
          System.out.println("Digite o Nome do Paciente:");
          String nome = dados.next();
          System.out.println("Digite o Numero do Cartão de Credito:");
          int cartaoNumero = dados.nextInt();
          System.out.println("Digite Bandeira do Cartão de crédito:");
          String cartaoBandeira = dados.next();
          NaoConveniado p = new NaoConveniado(cpf,nome,cartaoNumero,cartaoBandeira);


          System.out.println("Digite a Primeira Especialidade da Consulta:");
          String especialidade1 = dados.next();
          System.out.println("Digite a Segunda Especialidade da Consulta:");
          String especialidade2 = dados.next();
          p.agendarConsulta(especialidade1,cartaoNumero,cartaoBandeira);
          p.agendarConsulta(especialidade2,cartaoNumero,cartaoBandeira);
          
          listaNC.add(p);
  
        }else{
          
          System.out.println("Digite o CPF do Paciente:");
          int cpf = dados.nextInt();
          System.out.println("Digite o Nome do Paciente:");
          String nome = dados.next();
          System.out.println("Digite o Numero do Convenio:");
          int numConvenio = dados.nextInt();
          System.out.println("Digite o Nome do Convenio:");
          String nomeConvenio = dados.next();
          Conveniado p = new Conveniado(cpf,nome,numConvenio,nomeConvenio);

  
          System.out.println("Digite a Primeira Especialidade da Consulta:");
          String especialidade1 = dados.next();
          System.out.println("Digite a Segunda Especialidade da Consulta:");
          String especialidade2 = dados.next();
          p.agendarConsulta(especialidade1,numConvenio,nomeConvenio);
          p.agendarConsulta(especialidade2,numConvenio,nomeConvenio);

          listaC.add(p);
        }
                                                          
      }


    
  }
}
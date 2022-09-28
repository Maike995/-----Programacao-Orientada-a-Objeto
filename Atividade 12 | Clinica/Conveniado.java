import java.util.*;
  
public class Conveniado extends Paciente{

  protected int numeroConvenio;
  protected String nomeConvenio;

  public Conveniado(int cpf, String nome, int numeroConvenio, String nomeConvenio){
    super(cpf, nome);
    this.numeroConvenio = numeroConvenio;
    this.nomeConvenio = nomeConvenio;
    
  }

  public int getNumeroConvenio(){
    return numeroConvenio;
  }
  public void setNumeroConvenio(int numeroConvenio){
    this.numeroConvenio=numeroConvenio;
  }

  public String getNomeConvenio(){
    return nomeConvenio;
  }
  public void setNomeConvenio(String nomeConvenio){
    this.nomeConvenio=nomeConvenio;
  }  


  public void print(){
    System.out.println("");
  } 

  
  public void agendarConsulta(String nomeEspecialidade, int numeroConvenio, String nomeConvenio){
    Random gerador = new Random();

    int ano_int = 2023;
	  int mes_int = gerador.nextInt(12)+1;
	  int dia_int = 0;

    switch  (mes_int) { 
		
		case 1: 
      dia_int = gerador.nextInt(31) + 1;
			break;
    case 2:
			dia_int = gerador.nextInt(28) + 1;
			break;
		case 3:
      dia_int = gerador.nextInt(31) + 1;
			break;
    case 4:
      dia_int = gerador.nextInt(30) + 1;
			break;
    case 5:
      dia_int = gerador.nextInt(31) + 1;
			break;
    case 6:
      dia_int = gerador.nextInt(30) + 1;
			break;
    case 7:
      dia_int = gerador.nextInt(30) + 1;
			break;
    case 8:
      dia_int = gerador.nextInt(31) + 1;
			break;
    case 9:
      dia_int = gerador.nextInt(30) + 1;
			break;
    case 10:
      dia_int = gerador.nextInt(31) + 1;
			break;
		case 11:
      dia_int = gerador.nextInt(30) + 1;
			break;
		case 12:
			dia_int = gerador.nextInt(31) + 1;
			break;
		default:
			dia_int = gerador.nextInt(30) + 1;
			break;
	}

    String ano = Integer.toString(ano_int);
    String mes = Integer.toString(mes_int);
    String dia = Integer.toString(dia_int);

    if (mes_int < 10) { 
        mes = "0" + mes_int;
    }

    if (dia_int < 10) {
        dia = "0" + dia_int;
    }


    String data = dia + "/" + mes + "/" + ano;

    
     System.out.println("PACIENTE: " + nome + " - CONVÊNIO " + nomeConvenio);
     System.out.println("          " + nomeEspecialidade + " - " + data) ;
     System.out.println();
  }
  

    
}
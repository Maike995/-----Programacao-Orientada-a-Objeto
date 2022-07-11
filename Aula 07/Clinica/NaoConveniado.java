import java.util.*;
  
public class NaoConveniado extends Paciente {

    protected int numCartaoCredito;
    protected String bandeiraCartaoCredito;

  public NaoConveniado(int cpf, String nome, int numCartaoCredito, String bandeiraCartaoCredito){
    super(cpf, nome);
    this.numCartaoCredito = numCartaoCredito;
    this.bandeiraCartaoCredito = bandeiraCartaoCredito;
    
  }

  public int getNumCartaoCredito(){
    return numCartaoCredito;
  }
  public void setNumCartaoCredito(int numCartaoCredito){
    this.numCartaoCredito=numCartaoCredito;
  }

  public String getBandeiraCartaoCredito(){
    return bandeiraCartaoCredito;
  }
  public void setBandeiraCartaoCredito(String bandeiraCartaoCredito){
    this.bandeiraCartaoCredito=bandeiraCartaoCredito;
  }  

  public void print(){
    System.out.println("");
  } 

  
  public void agendarConsulta(String nomeEspecialidade, int numCartaoCredito ,String bandeiraCartaoCredito){
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

     

    System.out.println("PACIENTE: " + nome + " - SEM CONVÊNIO ");
    System.out.println("          " + nomeEspecialidade + " - " + data + "  - R$ 200,00" ) ;
    System.out.println();
    
  }
  
}

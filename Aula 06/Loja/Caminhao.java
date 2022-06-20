/* 1 - Crie uma hierarquia de classes para representar veículos com os atributos placa e ano:
considere que as classes ônibus e caminhão serão filhas da classe veículo. Considerações: 
- o construtor da classe veículo deve conter a placa e ano;
- a classe ônibus deve conter o atributo número de assentos;
- a classe caminhão deve conter o número de eixos e o peso máximo e carga;
- crie os métodos gets/sets e exibir dados;
- crie uma classe para testar as classes criadas;
- lembre-se de usar abstract quando for o caso;
*/

package loja;

    public class Caminhao extends Veiculo{

        protected int numeroDeEixos;
        protected String pesoMax;
        protected String carga;
  

        public Caminhao(String placa,int ano,int numeroDeEixos,String pesoMax, String carga){
            super(placa,ano);
            
            this.numeroDeEixos=numeroDeEixos;
            this.pesoMax=pesoMax;
            this.carga=carga;
        }

        public int getNumeroDeEixos(){
            return numeroDeEixos;
        }
        public String getPesoMax(){
            return pesoMax;
        }
        public String getCarga(){
            return carga;
        }

        public void setNumeroDeEixos(int numeroDeEixos){
            this.numeroDeEixos=numeroDeEixos;
        }
        public void setPesoMax(String pesoMax){
            this.pesoMax=pesoMax;
        }
        public void setCarga(String carga){
            this.carga=carga;
        }

        public void dados(){
            System.out.println("Dados do Caminhão | Placa: "+placa+" | Ano: "+ano+" | Numero De Eixos: "+numeroDeEixos+" | Peso Máximo: "+pesoMax+" | Carga: "+carga);
        }
    }
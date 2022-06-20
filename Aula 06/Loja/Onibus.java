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

    public class Onibus extends Veiculo{

        protected int numeroDeAssentos;

        public Onibus(String placa,int ano,int numeroDeAssentos){
            super(placa,ano);
        
            this.numeroDeAssentos=numeroDeAssentos;
        }

        public int getNumeroDeAssentos(){
            return numeroDeAssentos;
        }

        public void setNumeroDeAssentos(int numeroDeAssentos){
            this.numeroDeAssentos=numeroDeAssentos;
        }

        public void dados(){
            System.out.println("Dados do Ônibus | Placa: "+placa+" | Ano: "+ano+" | Numero De Assentos: "+numeroDeAssentos);
        }
    }
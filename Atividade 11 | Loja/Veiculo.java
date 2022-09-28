
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

    public abstract class Veiculo {

        protected String placa;
        protected int ano;

        public Veiculo(String placa, int ano){
            this.placa=placa;
            this.ano=ano;
        }

        public String getPlaca(){
            return placa;
        }
        public int getAno(){
            return ano;
        }

        public void setPlaca(String placa){
            this.placa=placa;
        }
        public void setAno(int ano){
            this.ano=ano;
        }
  
        public abstract void dados();
    }



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

    class Main {
        public static void main(String[] args) {

        System.out.println();
        Caminhao c1 = new Caminhao("AVS2031",2020,5,"400 toneladas","Feijão");
        Caminhao c2 = new Caminhao("SFS3431",2000,9,"263 toneladas","Arroz");
        Caminhao c3 = new Caminhao("AHF75341",1990,7,"100 toneladas","Macarrão");
        Onibus o1 = new Onibus("SVS3431",2012,20);
        Onibus o2 = new Onibus("KHG3351",2006,10);
        Onibus o3 = new Onibus("SBV7541",1998,50);

        c1.dados();
        c2.dados();
        c3.dados();
        o1.dados();
        o2.dados();
        o3.dados();

        }
    }
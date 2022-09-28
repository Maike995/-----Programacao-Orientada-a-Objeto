/* 
2 - Implemente, em Java, uma classe abstrata de nome Quadrilatero onde são declarados dois métodos abstratos:
float calcularArea( ) e float calcularPerimetro( );
- crie, como subclasse de Quadrilatero, uma classe de nome Retangulo cujas instâncias são caracterizadas pelos atributos lado e altura ambos do tipo float. 
- implemente na classe Retangulo os métodos herdados de Quadrilatero e outros que ache necessários.
- crie, como subclasse de Quadrilatero, uma classe de nome Circulo cujas instâncias são caracterizadas pelo atributo raio do tipo float. 
- implemente na classe Circulo os métodos herdados de Quadrilatero e outros que ache necessários. (Nota: poderá acessar o valor de Pi fazendo Math.Pi)
- crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas instâncias são caracterizadas por terem os atributos lado e altura com o mesmo valor.
- crie uma classe para testar as classes criadas.
*/

package geometria;

    public class Retangulo extends Quadrilatero {

        protected float lado;
        protected float altura;
        protected float area;
        protected float perimetro;

        public Retangulo(float lado, float altura) {
            this.lado = lado;
            this.altura = altura;
        }

        public float calcularArea() {
            return area = lado * altura;
        }

        public float calcularPerimetro() {
            return perimetro = lado * 2 + altura * 2;
        }


        public void dados(){
            System.out.println("Dados do Quadrilatero| Base: "+lado+" | Altura: "+altura+" | Area: "+area+" | Perimetro: "+perimetro);
        }
    }
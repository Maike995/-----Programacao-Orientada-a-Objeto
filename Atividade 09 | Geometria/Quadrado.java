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

    public class Quadrado extends Retangulo{

        public Quadrado(float lado,float altura){
            super(lado,altura);
            this.altura=lado;
        }
    }
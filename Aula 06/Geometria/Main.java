

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


    class Main {
        public static void main(String[] args) {
    

            Retangulo r1 = new Retangulo(4,7);
            Retangulo r2 = new Retangulo(8,3);
            Retangulo r3 = new Retangulo(6,7);
            Circulo c1 = new Circulo(8);
            Circulo c2 = new Circulo(12);
            Circulo c3 = new Circulo(16);
            Quadrado q1 = new Quadrado(2,8);
            Quadrado q2 = new Quadrado(8,2);
            Quadrado q3 = new Quadrado(6,6);

    
            System.out.println("Area: "+r1.calcularArea());
            System.out.println("Area: "+r2.calcularArea());
            System.out.println("Area: "+r3.calcularArea());
            System.out.println("Area: "+c1.calcularArea());
            System.out.println("Area: "+c2.calcularArea());
            System.out.println("Area: "+c3.calcularArea());
            System.out.println("Area: "+q1.calcularArea());
            System.out.println("Area: "+q2.calcularArea());
            System.out.println("Area: "+q3.calcularArea());

            System.out.println("Perimetro: "+r1.calcularPerimetro());
            System.out.println("Perimetro: "+r2.calcularPerimetro());
            System.out.println("Perimetro: "+r3.calcularPerimetro());
            System.out.println("Perimetro: "+c1.calcularPerimetro());
            System.out.println("Perimetro: "+c2.calcularPerimetro());
            System.out.println("Perimetro: "+c3.calcularPerimetro());
            System.out.println("Perimetro: "+q1.calcularPerimetro());
            System.out.println("Perimetro: "+q2.calcularPerimetro());
            System.out.println("Perimetro: "+q3.calcularPerimetro());

            r1.dados();
            r2.dados();
            r3.dados();
            c1.dados();
            c2.dados();
            c3.dados();
            q1.dados();
            q2.dados();
            q3.dados();

        }
    }


/*
3 - Defina uma interface com o nome Jogo. Crie os métodos iniciar(), jogar() e finalizar(). 
A seguir:
- crie uma classe abstrata com o nome JogoComBola e faça-a implementar a interface Jogo.
- crie um método abstrato denominado setNomesEquipes(String equipe1, String equipe2). 
- crie uma classe com o nome Futebol e faça-a herdar da classe JogoComBola.
- repare que, por se tratar de uma classe concreta, você será obrigado pelo compilador a implementar os métodos da classe abstrata e também os métodos definidos na interface. 
- coloque implementações simples nestes métodos como mensagens, por exemplo. 
- crie uma classe com o nome Vôlei nos mesmos moldes da classe Futebol.
- crie uma classe abstrata com o nome JogoDeCartas e faça-a herdar da interface Jogo.
- crie um método abstrato qtdCartasDistribuidas() com o retorno do tipo inteiro. 
- crie outro método abstrato com o nome numeroParticipantes() também com retorno inteiro.
- crie uma classe concreta denominada Truco herdando de JogoDeCartas. 
- implemente de maneira simples os métodos da interface Jogo e da classe abstrata JogoDeCartas.*/

package jogo;

    class Main {
        public static void main(String[] args) {
    

        Futebol f1 = new Futebol();
        Futebol f2 = new Futebol();
        Volei v1 = new Volei();
        Volei v2 = new Volei();
        Truco t1 = new Truco(4);
        Truco t2 = new Truco(8);

        System.out.println("Futebol_1");
        f1.setNomesEquipes("Libertadores","Condenados");
        f1.iniciar();
        f1.jogar();
        f1.finalizar();
        System.out.println();
        System.out.println("Futebol_2");
        f2.setNomesEquipes("Plantas","Zumbis");
        f2.iniciar();
        f2.jogar();
        f2.finalizar();
        System.out.println();
        System.out.println("Volei_1");
        v1.setNomesEquipes("Humanos","Macacos");
        v1.iniciar();
        v1.jogar();
        v1.finalizar();
        System.out.println();
        System.out.println("Volei_2");
        v2.setNomesEquipes("Touro","Leões");
        v2.iniciar();
        v2.jogar();
        v2.finalizar();
        System.out.println();
        System.out.println("Truco_1");
        System.out.println("Numero De Participantes: "+t1.numeroParticipantes());
        System.out.println("Numero De Cartas Distribuidas: "+t1.qtdCartasDistribuidas());
        t1.iniciar();
        t1.jogar();
        t1.finalizar();
        System.out.println();
        System.out.println("Truco_2");
        System.out.println("Numero De Participantes: "+t2.numeroParticipantes());
        System.out.println("Numero De Cartas Distribuidas: "+t2.qtdCartasDistribuidas());
        t2.iniciar();
        t2.jogar();
        t2.finalizar();
    
    



    
  }
}
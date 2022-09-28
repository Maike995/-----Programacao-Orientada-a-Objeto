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

    public abstract class JogoComBola implements Jogo{

        public abstract void setNomesEquipes(String equipe1, String equipe2);
  
    }
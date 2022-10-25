


import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Roteador de Origem? 1 = RoteadorA |2 = RoteadorB |3 = RoteadorC |4 = RoteadorD");
        int roteador1 = sc.nextInt();
        System.out.println("Roteador de Destino? 1 = RoteadorA |2 = RoteadorB |3 = RoteadorC |4 = RoteadorD");
        int roteador2 = sc.nextInt();
        Swich test = new Swich();
        test.calcularRota(roteador1, roteador2);
        
        
        
        
        
        
        
    }
    
}

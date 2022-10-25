


public class Swich {
    
    protected int[] roteadorA = new int[]{1,2,3};
    protected int[] roteadorB = new int[]{7,1,3};
    protected int[] roteadorC = new int[]{1,1,1};
    protected int[] roteadorD = new int[]{7,2,1};
    
    public Swich(){
        
        
        
    }
    
    public void calcularRota(int roteador1,int roteador2){
        
        if(roteador1 == 1){
          if(roteador2 == 1){
            System.out.println("Origem A Destino A distancia "+ 0);
         }if(roteador2 == 2){
            System.out.println("Origem A Destino B distancia "+ (this.roteadorA[0] + this.roteadorC[1]));
         }if(roteador2 == 3){
            System.out.println("Origem A Destino C distancia "+ this.roteadorA[0]);
         }if(roteador2 == 4){
            System.out.println("Origem A Destino D distancia "+ this.roteadorA[1]);
         }
        }
        //-------------------------------
        if(roteador1 == 2){
          if(roteador2 == 2){
            System.out.println("Origem B Destino B distancia "+ 0);
         }if(roteador2 == 1){
            System.out.println("Origem B Destino A distancia "+ (this.roteadorB[1] + this.roteadorC[0]));
         }if(roteador2 == 3){
            System.out.println("Origem B Destino C distancia "+ this.roteadorB[1]);
         }if(roteador2 == 4){
            System.out.println("Origem B Destino D distancia "+ (this.roteadorB[1] + this.roteadorC[2]));
         }
        }
        //-------------------------------
        if(roteador1 == 3){
          if(roteador2 == 3){
            System.out.println("Origem C Destino C distancia "+ 0);
         }if(roteador2 == 1){
            System.out.println("Origem C Destino A distancia "+ this.roteadorC[0]);
         }if(roteador2 == 2){
            System.out.println("Origem C Destino B distancia "+ this.roteadorC[1]);
         }if(roteador2 == 4){
            System.out.println("Origem C Destino D distancia "+ this.roteadorC[2]);
         }
        }
        //-------------------------------
        if(roteador1 == 4){
          if(roteador2 == 4){
            System.out.println("Origem D Destino D distancia "+ 0);
         }if(roteador2 == 1){
            System.out.println("Origem D Destino A distancia "+ this.roteadorD[1]);
         }if(roteador2 == 2){
            System.out.println("Origem D Destino B distancia "+ (this.roteadorD[2] + this.roteadorC[1]));
         }if(roteador2 == 3){
            System.out.println("Origem D Destino C distancia "+ this.roteadorD[0]);
         }
        }
    }
    
    
    
    
    
    
    
}

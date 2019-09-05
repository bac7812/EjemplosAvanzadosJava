
package lanzamientodado;

import java.util.Random;

public class LanzamientoDado {
    
  public int dado [] ={0,0,0,0,0,0};
    
    public void LanzamientoDado(){
        
    }
    
    public void tirarDado (){
        long t0 = System.currentTimeMillis();
        Random rnd = new Random();
  
        for (int i=0; i<10000; i++){
            int n=rnd.nextInt(6-0)+1;
            dado[n-1]+=1;
        }
        long t1 = System.currentTimeMillis();
        long tv = t1-t0;
        System.out.println("Tiempo empleado en generar 10000 valores "+tv+" milisegundos.");
    }
    
    public void MostarDado(){
          for  (int i = 0; i < 6; i++) {
            System.out.println ("El número "+(i+1)+ " aparece "+dado[i]+" veces");
        }
    }
    
    public static void main(String[] args) {
        LanzamientoDado ld = new LanzamientoDado();
        ld.tirarDado();
        ld.MostarDado();
    }   
}
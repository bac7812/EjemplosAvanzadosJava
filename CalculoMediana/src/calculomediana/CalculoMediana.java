
package calculomediana;

import java.util.Arrays;
import java.util.Scanner;

public class CalculoMediana {
    
    int[] numeros;
    
    public CalculoMediana(int[] numeros){
        this.numeros=new int[numeros.length];
    }
    
    public int orden (){
        Arrays.sort(numeros);
        return 0;
    }
    
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduce el valor");
       int valor=teclado.nextInt();
       int[] numeros=new int[valor];
       for(int i=0;i<valor;i++){
            System.out.println("Introduce los numeros");
            numeros[i]=teclado.nextInt();
       }
       CalculoMediana cm=new CalculoMediana(numeros);
    }
}

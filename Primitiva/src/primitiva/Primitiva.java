
package primitiva;

import java.util.ArrayList;
import java.util.Collections;

public class Primitiva {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 1; i < 50; i++){
            numeros.add(i);
        }
        
        ArrayList<Integer> reintegro = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++){
            reintegro.add(i);
        }
        
        int combinaciones=5;
        
        for (int i = 1; i < combinaciones; i++){
            Collections.shuffle(numeros);
            Collections.shuffle(reintegro);
            System.out.println("Numeros");
            for (int j= 0; j < 6; j++){
                System.out.print(numeros.get(j)+"\t");
            }
            System.out.println();
            System.out.println("Complementario: "+numeros.get(6));
            System.out.println("Obtener reintegro: "+reintegro.get(0));
        }
    }
    
}

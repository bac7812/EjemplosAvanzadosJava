
package array;

import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Array {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int mayor=-9999999;
        Scanner teclado=new Scanner (System.in);
        int[] edad=new int[5];
        for (int i=0; i<5; i++){
            edad[i]=teclado.nextInt();
        }
        for (int i=0; i<5; i++){
            if (edad[i]>mayor) mayor=edad[i];
        }
        System.out.println("Edad del tercer elemento del array "+edad[2]);
    }
}

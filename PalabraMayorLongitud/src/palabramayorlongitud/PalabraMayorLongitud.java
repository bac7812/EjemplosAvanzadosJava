
package palabramayorlongitud;

import java.util.Scanner;

public class PalabraMayorLongitud {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int i;
        int c = 0;
        
        String cadena;
        String palabra = "";
        String mostrar = null;
        
        System.out.println();
        cadena=teclado.nextLine();
        
        for (i=0; i<cadena.length(); i++){
            palabra = palabra+cadena.charAt(i);
            if (cadena.charAt(i)==' '){
                if (palabra.length()-1>c){
                    c = palabra.length()-1;
                    mostrar = palabra.trim();
                }
                palabra = "";
            }
        }
        System.out.println("La palaba de mayor longitud es: "+mostrar);
        System.out.println("Su longitud es: "+c);
    }
    
}

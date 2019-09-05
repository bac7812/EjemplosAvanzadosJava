
package palabras;

import java.util.Scanner;

public class Palabras {

    public static void main(String[] args) {
        
        String [] palabras=new String [100];
        String palabra;
        int numElem;
        int i = 0;
        
        Scanner teclado=new Scanner (System.in);
        System.out.println("¿Cuantos elementos?");
        numElem=teclado.nextInt();
        
        while(i<numElem){
            palabra=teclado.nextLine();
            palabra=palabra.toUpperCase();
            if((palabra.length()>=5 && palabra.length()<=15) && existe(palabras,palabra,i)==false && caracter(palabra)){
                palabras[i]=palabra;
                i++;
            }
        }
    }
    
    public static boolean existe (String [] palabras, String palabra, int numElem){
        boolean existe = false;
        for (int i=0; i<numElem; i++){
            if (palabras[i].equals(palabra)) existe=true;
         }
        return existe;
    }
    public static boolean caracter (String palabra){
        boolean esLetra=true;
        int i = 0;
        while (i<palabra.length() && Character.isLetter(palabra.charAt(i))){
            i++;
            if (i<palabra.length()) esLetra=false;
        }
        return true;
    }
}

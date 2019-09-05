
package clavemorse;

import java.util.Scanner;

public class ClaveMorse {
    String [] morse={".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--",
            "--..",".---","..---","...--","....-","....","-....","--...",
            "---..","----.","-----"};
    
    String clave;
    
    public ClaveMorse (String clave){
        this.clave=clave;
    }
    
    public  String  encriptar (){
        String encriptada= "";
        for (int i=0; i<clave.length(); i++){
            char c=clave.charAt(i);
            if (Character.isLetter(c)){
                encriptada+=morse[(int)c-65];
            }
            if (Character.isLetter(c)){
                encriptada+=morse[(int)c+27];
            }
        }
        return encriptada;
    }
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un clave morse");
        String clave=teclado.nextLine();
        ClaveMorse cm=new ClaveMorse(clave);
        System.out.println("El clave encriptar es"+cm.encriptar());
    }
}


package textoletras;

import java.util.Scanner;

public class TextoLetras {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un texto");
        String frase=teclado.nextLine();
        String texto="";
        int [] contletras=new int[27];
        String nuevotexto=texto.replace(" ", "");
        nuevotexto=nuevotexto.toLowerCase();
        for (int i=0; i<nuevotexto.length(); i++){
            char c=nuevotexto.charAt(i);
            int p=(int)c-97;
            contletras[p]++;
        }
        imprimir(contletras);
    }   
    
    public static void imprimir(int [] contletras){
        for (int i=97; i<=122; i++){
            if (contletras[i-97]>0)
            System.out.println("La letra "+i+(char)i+" aparece "+contletras[i-97]);
        }
    }
    
}

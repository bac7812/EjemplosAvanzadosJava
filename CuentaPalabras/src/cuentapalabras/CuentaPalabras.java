
package cuentapalabras;

import java.util.Scanner;

public class CuentaPalabras {

    public static void main(String[] args) {
        String texto;
        String textonuevo;
        
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduce un texto");
        texto=teclado.nextLine();
        
        textonuevo=texto.trim();
        
        String delimitadores=" ";
        String [] palabrasSeparadas = textonuevo.split(delimitadores);
        System.out.println(palabrasSeparadas.length);
        
    }
    
}


package vector;

import java.util.Scanner;

public class FinalVector {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce cuantos elementos tiene el vector");
        int elem = teclado.nextInt();
        Vector numeros = new Vector(elem);
        numeros.CargarVector();
        numeros.CargarPositivosNegaivosCeros();
        System.out.println(numeros.toString());
        System.out.println("El valor mayor es: "+numeros.mayorValor());
    }
}

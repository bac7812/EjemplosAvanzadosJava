
package frase;

import java.util.Scanner;
import java.util.Stack;

public class Frase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase=teclado.nextLine();
        Stack<Character> pila= new Stack<Character>();
        for (int i=0; i<frase.length(); i++){
            pila.push(frase.charAt(i));
        }
        while(!pila.isEmpty()){
            System.out.print(pila.pop()+"");
        }
    }
    
}

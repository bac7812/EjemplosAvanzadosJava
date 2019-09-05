
package fecha;

import java.util.Scanner;

public class FinalFecha {
    
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce día");
      int dia=teclado.nextInt();
      System.out.println("Introduce mes");
      int mes=teclado.nextInt();
      System.out.println("Introduce año");
      int anyo=teclado.nextInt();
      Fecha fecha=new Fecha(dia,mes,anyo);
      fecha.incrementate(5);
      fecha.imprimete();
    }
}


package videojuego;

import java.util.Scanner;

public class FinalVideojuegos {
    
    public static void main (String [] args){
        int opcion;
        Scanner teclado=new Scanner(System.in);
        Videojuego vj=new Videojuego();
        do{
            System.out.println("1- Devolver el videojuego");
            System.out.println("2- Entregar el videojuego");
            System.out.println("3- Salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    vj.devolver();
                    break;
                case 2:
                    vj.entregar();
                    break;
            }
        }
        while (opcion!=3);
    }
}

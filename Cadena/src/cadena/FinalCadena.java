package cadena;




import java.util.Scanner;

public class FinalCadena {

    public static void main(String[] args) {
       Cadena cad=new Cadena();
       Scanner teclado=new Scanner(System.in);
       String c=teclado.nextLine();
       cad.setTexto(c);
       if(cad.palindroma()==true)System.out.println("Es palindroma");
       else System.out.println("No es palindroma");
    }
}

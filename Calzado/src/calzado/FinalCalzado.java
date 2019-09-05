
package calzado;

import java.util.Scanner;

public class FinalCalzado {
    
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número de calzado");
        double num = teclado.nextDouble();
        System.out.println("Introduce precio");
        double pre = teclado.nextDouble();
        System.out.println("Introduce existencias");
        int exi = teclado.nextInt();
        System.out.println("Introduce tipo de calzado");
        String tip = teclado.nextLine();
        System.out.println("Introduce sexo");
        String sex = teclado.nextLine();
        Calzado c=new Calzado(num,pre,exi,tip,sex);
        System.out.println(c.getNumero());
        System.out.println(c.getPrecio());
        System.out.println(c.getExistencias());
        System.out.println(c.getTipo());
        System.out.println(c.getSexo());
        System.out.println(c.getTallaUK());
        System.out.println(c.getTallaUS());
    }
}

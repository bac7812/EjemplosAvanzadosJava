
package persona;

import java.util.Scanner;

public class FinalPersona {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre  ");
        String n = teclado.nextLine();
        System.out.println("Dni  ");
        String d = teclado.nextLine();
        System.out.println("Sexo  ");
        char s = teclado.nextLine().charAt(0);
        System.out.println("Peso  ");
        double p = teclado.nextDouble();
        System.out.println("Altura  ");
        double a = teclado.nextDouble();
        System.out.println("Edad  ");
        int e = teclado.nextInt();
//        Persona pers = new Persona(n, e, d, s, p, a);
//        System.out.println("¿Mayor de edad? " + pers.esMayorDeEdad());
//        System.out.println("¿DNI correcto? " + pers.ComprobarDNI());
//        System.out.println(pers.toString());
    

//        Persona per2 = new Persona();
//        per2.setAltura(a);
//        per2.setDni(d);
//        per2.setEdad(e);
//        per2.setNombre(n);
//        per2.setPeso(p);
//        per2.setSexo(s);
//        System.out.println("¿Mayor de edad? " + per2.esMayorDeEdad());
//        System.out.println("¿DNI correcto? " + per2.ComprobarDNI());
//        System.out.println(per2.toString());

        
        Persona per3 = new Persona(n,s,e);
        System.out.println("¿Mayor de edad? " + per3.esMayorDeEdad());
        System.out.println("¿DNI correcto? " + per3.ComprobarDNI());
        System.out.println(per3.toString());
    }

}

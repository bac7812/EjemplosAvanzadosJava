package hora;

import java.util.Scanner;

public class FinalHora {

    public static void main(String[] args) {
        //Hora horaC=new Hora();
        //Hora horaf=new Hora();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de telefóno");
        int telefono = teclado.nextInt();
        System.out.println("Introduce hora de comienzo");
        int hc = teclado.nextInt();
        System.out.println("Introduce minutos de comienzo");
        int mc = teclado.nextInt();
        System.out.println("Introduce segundos de comenzo");
        int sc = teclado.nextInt();
        Hora horaC = new Hora(hc, mc, sc);
        System.out.println("Introduce hora de fin");
        int hf = teclado.nextInt();
        System.out.println("Introduce minutos de fin");
        int mf = teclado.nextInt();
        System.out.println("Introduce segundos de fin");
        int sf = teclado.nextInt();
        Hora horaF = new Hora(hf, mf, sf);
        Llamada llamada = new Llamada(" ", horaC, horaF);
        int d = llamada.duracionLlamada();
        if (d == -1) {
            System.out.println("Fallo hora de comienzo > hora de fin");
        } else {
            System.out.println(+d);
        }
    }
}
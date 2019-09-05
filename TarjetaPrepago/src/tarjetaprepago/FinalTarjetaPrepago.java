
package tarjetaprepago;

import java.util.Scanner;

public class FinalTarjetaPrepago {
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de telefóno");
        String tel = teclado.nextLine();
        System.out.println("Introduce un número de NIF");
        String nif = teclado.nextLine();
        System.out.println("Introduce un número de saldo");
        double saldo = teclado.nextDouble();
        TarjetaPrepago tf=new TarjetaPrepago(tel, nif, saldo);
        System.out.println(tf.consultarNumero());
        System.out.println(tf.consultarNif());
        System.out.println(tf.getSaldo());
        tf.ingresarSaldo(400);
        System.out.println("El nuevo saldo es "+tf.getSaldo());
        tf.llamadaRealizada(100);
        System.out.println("El nuevo saldo es "+tf.getSaldo());
        System.out.println("El consumo es "+tf.getConsumo().getMinutos()+":"+tf.getConsumo().getSegundo());
    }
}
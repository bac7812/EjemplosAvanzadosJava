
package cuentacorriente;

import java.util.Scanner;

public class FinalCuentaCorriente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nom = teclado.nextLine();
        System.out.println("Introduce apellidos");
        String ape = teclado.nextLine();
        System.out.println("Introduce teléfono");
        String tel = teclado.nextLine();
        System.out.println("Introduce dirección");
        String dir = teclado.nextLine();
        System.out.println("Introduce NIF");
        String nif = teclado.nextLine();
        System.out.println("Introduce saldo");
        double sal = teclado.nextDouble();
        CuentaCorriente cc=new CuentaCorriente(nom,ape,tel,dir,nif,sal);
        cc.consultarCuenta();
        System.out.println(cc.getSaldo());
        cc.ingresarDinero(400);
        System.out.println(cc.getSaldo());
        cc.sacarDinero(200);
        System.out.println(cc.getSaldo());
        System.out.println(cc.saldoNegativo());
    } 
}

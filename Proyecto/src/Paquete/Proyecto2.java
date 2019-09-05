
package Paquete;

import java.io.*;

public class Proyecto2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        
        String nom;
        double pre;
        int can;
        boolean est;
        
        System.out.print("Ingrese Nombre: ");
        nom=br.readLine();
        System.out.print("Ingrese Precio: ");
        pre=Double.parseDouble(br.readLine());
        System.out.print("Ingrese Cantidad: ");
        can=Integer.parseInt(br.readLine());
        System.out.print("Ingrese Estado: ");
        est=Boolean.parseBoolean(br.readLine());
        
        Producto oP1=new Producto(nom, pre, can, est);
        
        System.out.print("Ingrese Cantidad a comprar: ");
        can=Integer.parseInt(br.readLine());
        oP1.comprar(can);
        System.out.println("Cantidad actual: " + oP1.getCantidad());
        
        System.out.print("Ingrese Cantidad a vender: ");
        can=Integer.parseInt(br.readLine());
        oP1.vender(can);
        System.out.println("Cantidad actual: " + oP1.getCantidad());
        
        System.out.println(oP1);
    }   
}

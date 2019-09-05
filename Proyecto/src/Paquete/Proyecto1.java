
package Paquete;

public class Proyecto1 {
    public static void main(String[] args) {
        Producto oP1=new Producto("atun", 4.50, 100, true);
        Producto oP2=new Producto("aceite", 3.80, 150, true);
        
        oP1.comprar(20);
        System.out.println("Cantidad oP1 " + oP1.getCantidad());
        
        oP2.vender(10);
        System.out.println("Cantidad oP2 " + oP2.getCantidad());
        
        System.out.println(oP1);
        System.out.println(oP2);
    } 
}

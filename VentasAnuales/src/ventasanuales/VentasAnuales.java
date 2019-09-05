
package ventasanuales;

import java.util.Scanner;

public class VentasAnuales {
    
    int mayor;
    int menor;
    int posmayor=0;
    int posmenor=0;
    int [] ventas;
    
    public VentasAnuales(){
        
    }
    
    public VentasAnuales(int elem){
        ventas=new int[elem];
    }
    
    public void cargarVentasAnuales(){
        Scanner teclado = new Scanner (System.in);
      
        System.out.println("Los cinco elementos de las ventas anuales (tiendas): ");
        for (int v=0; v<5; v++){
            ventas[v]=teclado.nextInt();
        }
    }
    public void mayorVentasAnuales(){
        mayor=ventas[0];
        for (int i=0; i<ventas.length; i++){
            if (mayor<ventas[i]){
                mayor=ventas[i];
                posmayor=i;
            }
        }
    }
    
    public void menorVentasAnuales(){
        menor=ventas[0];
        for (int i=0; i<ventas.length; i++){
            if (menor>ventas[i]){
                menor=ventas[i];
                posmenor=i;
            }
        }
    }
    
    public void mostrarVentas(){
        for (int i=0; i<ventas.length; i++){
            System.out.println("La tienda "+i+" vendió "+ventas[i]);
        }
    }
    
    public String toString(){
        return "Tienda "+posmayor+" con venta mayor: "+mayor+"\nTienda "+posmenor+" con venta menor: "+menor;
    }
    
    public static void main(String[] args) {
        VentasAnuales num = new VentasAnuales(5);
        num.cargarVentasAnuales();
        num.mayorVentasAnuales();
        num.menorVentasAnuales();
        num.mostrarVentas();
        System.out.println(num.toString());
    }
}

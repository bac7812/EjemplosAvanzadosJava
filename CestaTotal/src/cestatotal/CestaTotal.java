
package cestatotal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CestaTotal {
    public static void main(String[] args) {
        ArrayList<cesta> listacesta = new ArrayList<cesta>();
        datos(listacesta);
        Collections.sort(listacesta);
        for (cesta c: listacesta){
            System.out.println(c.toString());
        }
    }
    
    public static void datos(ArrayList<cesta> listacesta){
        Scanner teclado=new Scanner(System.in);
        String nombre=teclado.nextLine();
        String [] datosnuevo;
        String lineap=" ";
        while(!nombre.toLowerCase().trim().equals("fin")){
            ArrayList<producto> listap = new ArrayList<producto>();
            lineap=teclado.nextLine();
            lineap.replaceAll(" +", " ");
            datosnuevo = lineap.split(" ");
            while(!lineap.toUpperCase().equals("O 0 0")){
                producto p = new producto(datosnuevo[0],Integer.parseInt(datosnuevo[1]),Integer.parseInt(datosnuevo[2]));
                lineap=teclado.nextLine();
                lineap.replaceAll(" +", " ");
                datosnuevo= lineap.split(" ");
                listap.add(p);
            }
            cesta c = new cesta (nombre,listap);
            nombre=teclado.nextLine();
            listacesta.add(c);
        }
    }
}

class producto {
    
    String nombre;
    int precio;
    int cantidad;

    public producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int importe(){
        return cantidad*precio;
    }

    @Override
    public String toString() {
        return "productos{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
}  

class cesta implements Comparable<cesta>{
    
    private String numerocesta;
    private ArrayList<producto> listaproductos;

    public cesta(String numerocesta, ArrayList<producto> listaproductos) {
        this.numerocesta = numerocesta;
        this.listaproductos = listaproductos;
    }

    public String getNumerocesta() {
        return numerocesta;
    }

    public ArrayList<producto> getListaproductos() {
        return listaproductos;
    }

    public void setNumerocesta(String numerocesta) {
        this.numerocesta = numerocesta;
    }

    public void setListaproductos(ArrayList<producto> listaproductos) {
        this.listaproductos = listaproductos;
    }
    
    public int importetotal(){
        int importetotal=0;
        for(producto p: listaproductos){
           importetotal+=p.importe();
        }
        return importetotal;
    }
    
    public int cantidadp(){
        return listaproductos.size();
    }
    
    @Override
    public String toString() {
        return "Cesta{" + "Numero cesta=" + numerocesta + ", Importe total=" + importetotal() + " Cantidad productos: "+ cantidadp()+'}';
    }
    
    @Override
    public int compareTo(cesta t){
        int resultado=Integer.compare(t.importetotal(),this.importetotal());
        if(resultado!=0){
            return resultado;
        }
        else{
            return Integer.compare(t.cantidadp(),this.cantidadp());
        }
    }
}
package rutadistribucion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class RutaDistribucion {

    public static Scanner teclado = new Scanner(System.in,"ISO8859-1");

    public static void main(String[] args) {
        ArrayList<String> RutaLocalidad = new ArrayList<String>();
        CargarLocalidad(RutaLocalidad);
        ArrayList<Pedido> listapedidos = new ArrayList<Pedido>();
        CargarPedidos(listapedidos);
        Stack<Pedido> pila = new Stack<Pedido>();
        CargarPila(pila,RutaLocalidad,listapedidos);
        DescargarPedidos(pila);
    }
    
    public static void DescargarPedidos(Stack<Pedido> pila){
        while(!pila.isEmpty()){
            System.out.println(pila.pop().toString());
        }
    }
    
    public static void CargarPila(Stack<Pedido> pila, ArrayList<String> RutaLocalidad, ArrayList<Pedido> listapedidos){
        for(String l: RutaLocalidad){
            for(Pedido p: listapedidos){
                if(l.equals(p.getLocalidad().toUpperCase())){
                    pila.push(p);
                }
            }
        }
    }
    
    public static void CargarPedidos(ArrayList<Pedido> listapedidos){
        String linea;
        linea=teclado.nextLine();
        while (!linea.trim().equals("0 O 0")){
            String[] datos = linea.split(" ");
            String linea2 = teclado.nextLine();
            Pedido pedido = new Pedido(Integer.parseInt(datos[0]), datos[1],Integer.parseInt(datos[2]));
            ArrayList<Producto> listaproductos = new ArrayList<Producto>();
            while(!linea2.trim().equals("0 0 0")){
                String [] datos2 = linea2.split(" ");
                Producto producto = new Producto(Integer.parseInt(datos2[0]), Integer.parseInt(datos2[1]), Integer.parseInt(datos2[2]));
                listaproductos.add(producto);
                linea2 = teclado.nextLine();
            }
            pedido.setListaProductos(listaproductos);
            listapedidos.add(pedido);
            linea = teclado.nextLine();
        }
    }
    
    public static void CargarLocalidad(ArrayList<String> RutaLocalidad) {
        String localidad;
        localidad = teclado.nextLine().trim().toUpperCase();
        while (!localidad.equals("FIN")) {
            RutaLocalidad.add(localidad);
            localidad = teclado.nextLine().trim().toUpperCase();
        }
    }
}

class Producto {
    
    int referencia;
    int cantidad;
    int precio;
    
    public Producto(int referencia, int cantidad, int precio) {
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Producto() {
        
    }
    
    public int getReferencia() {
        return referencia;
    }
    
    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public int importeProducto() {
        return precio * cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "referencia=" + referencia + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
}

class Pedido {
    
    int numero;
    String localidad;
    int cliente;
    ArrayList<Producto> listaProductos;
    
    public Pedido(int numero, String localidad, int cliente, ArrayList<Producto> listaProductos) {
        this.numero = numero;
        this.localidad = localidad;
        this.cliente = cliente;
        this.listaProductos = listaProductos;
    }
    
    public Pedido(int numero, String localidad, int cliente) {
        this.numero = numero;
        this.localidad = localidad;
        this.cliente = cliente;
    }
    
    public Pedido() {
        
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getLocalidad() {
        return localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public int getCliente() {
        return cliente;
    }
    
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public int importePedido() {
        int total = 0;
        for (Producto p : listaProductos) {
            total += p.importeProducto();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", localidad=" + localidad + ", cliente=" + cliente + ", listaProductos=" + listaProductos + '}';
    }
}
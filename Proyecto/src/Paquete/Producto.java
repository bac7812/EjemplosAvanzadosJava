
package Paquete;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private boolean estado;

    public Producto(String nombre, double precio, int cantidad, boolean estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void comprar (int cant){
        this.cantidad=this.cantidad+cant;
    }
    
    public void vender (int cant){
        if(cant<=this.cantidad)
            this.cantidad=this.cantidad - cant;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", estado=" + estado + '}';
    }
}

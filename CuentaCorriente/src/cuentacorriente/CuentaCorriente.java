
package cuentacorriente;

public class CuentaCorriente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String nif;
    private double saldo;

    public CuentaCorriente(String nombre, String apellidos, String direccion, String telefono, String nif, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nif = nif;
        this.saldo = saldo;
    }
    
    public CuentaCorriente(){
        saldo=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacarDinero (double cantidad){
        saldo=saldo-cantidad;
    }
    
    public void ingresarDinero (double cantidad){
        saldo=saldo+cantidad;
    }
    
    public void consultarCuenta (){
        System.out.println("Nombre: "+this.nombre+" Apellidos: "+this.apellidos+" Dirección: "+this.direccion+" Teléfono: "+this.telefono+" NIF: "+this.nif);
    }
    
    public boolean saldoNegativo (){
        if (saldo<0){
            return true;
        }
        else {
            return false;
        }
    }
}
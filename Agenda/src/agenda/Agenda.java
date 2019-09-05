
package agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Contacto implements Comparable<Contacto>{
    
    String nombre;
    String apellidos;
    String mail;
    String telefono;
    String fechanacimiento;

    public Contacto(String nombre, String apellidos, String mail, String telefono, String fechanacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", mail=" + mail + ", telefono=" + telefono + ", fechanacimiento=" + fechanacimiento + '}';
    }
    
    @Override
    public int compareTo (Contacto o){
        int resultado= this.apellidos.compareTo(o.apellidos);
        if (resultado!=0) return resultado;
        else resultado= this.nombre.compareTo(o.nombre);
            if (resultado!=0) return resultado;
            else return this.fechanacimiento.compareTo(o.fechanacimiento);
    }
}

public class Agenda {
    
    public static void main(String[] args) {
        
        ArrayList<Contacto> ListaContactos = new ArrayList<Contacto>();
        System.out.println();
        
        String[] options = {"Añadir", "Eliminar", "Modificar", "Buscar", "Listar", "Salir"};
        
        int seleccion = 0;
        
        while(seleccion!=5){
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Agenda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[5]); 
            
            switch(seleccion){
                case 0: AñadirContacto(ListaContactos); break;
                case 1: EliminarContacto(ListaContactos); break;
                case 2: ModificarContacto(ListaContactos); break;
                case 3: BuscarContacto(ListaContactos); break;
                case 4: ListarContacto(ListaContactos); break;
            }
        }
        
    }
    
    public static void AñadirContacto(ArrayList<Contacto> ListaContactos){
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el nombre: ");
        String nombre=teclado.nextLine();
        
        System.out.println("Introduce los apellidos: ");
        String apellidos=teclado.nextLine();
        
        System.out.println("Introduce el mail: ");
        String mail=teclado.nextLine();
        
        System.out.println("Introduce la fecha de nacimiento: ");
        String fnacimiento=teclado.nextLine();
        
        System.out.println("Introduce el telefono: ");
        String telefono=teclado.nextLine();
        
        Contacto c= new Contacto(nombre,apellidos,mail,fnacimiento,telefono);
        ListaContactos.add(c);

    }
    
    public static void EliminarContacto(ArrayList<Contacto> ListaContactos){
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce los apellidos: ");
        String apellidos=teclado.nextLine();
        
        for (Contacto c: ListaContactos){
            if (c.getApellidos().equals(apellidos)){
                ListaContactos.remove(c);
            }
            break;
        }
    }
    
    public static void ModificarContacto(ArrayList<Contacto> ListaContactos){
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el nombre: ");
        String nombre=teclado.nextLine();
        
        System.out.println("Introduce los apellidos: ");
        String apellidos=teclado.nextLine();
        
        System.out.println("Introduce el mail: ");
        String mail=teclado.nextLine();
        
        for (Contacto c: ListaContactos){
            if (c.getNombre().equals(nombre)&&c.getApellidos().equals(apellidos)){
                c.setMail(mail);
            }
        }
    }
    
    public static void BuscarContacto(ArrayList<Contacto> ListaContactos){
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el nombre: ");
        String nombre=teclado.nextLine();
        
        System.out.println("Introduce los apellidos: ");
        String apellidos=teclado.nextLine();
        
        for (Contacto c: ListaContactos){

            
            if (c.getNombre().toLowerCase().trim().equals(nombre.toLowerCase())&&c.getApellidos().toLowerCase().trim().equals(apellidos.toLowerCase())){
                System.out.println(c.toString());
            }
        }
    }
    
    public static void ListarContacto(ArrayList<Contacto> ListaContactos){
        
        Collections.sort(ListaContactos);
        
        for (Contacto c: ListaContactos){
            System.out.println(c.toString());
        }
    }
}

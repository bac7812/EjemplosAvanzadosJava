
package elecciondelegado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Alumno implements Comparable<Alumno>{

    String nombre;
    int votos;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.votos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public void incrementarVotos(){
        this.votos++;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", votos=" + votos + '}';
    }
    
    @Override
    public int compareTo (Alumno o){
        int resultado= Integer.compare(o.votos, votos);
        if (resultado!=0) return resultado;
            else return this.nombre.compareTo(o.nombre);
    }
    
}

public class EleccionDelegado {

    public static void main(String[] args) {
        ArrayList<Alumno> ListaAlumnos = new ArrayList<Alumno>();
        LeerVotos(ListaAlumnos);
        Collections.sort(ListaAlumnos);
        Imprimir(ListaAlumnos);
    }
    
    public static void LeerVotos(ArrayList<Alumno>ListaAlumnos){
        Scanner teclado = new Scanner(System.in);
        String nombre=" ";
        System.out.println("Introduce el nombre");
        nombre=teclado.nextLine();
        
        while(!nombre.toLowerCase().equals("fin")){
            int pos=BuscarNombre(ListaAlumnos, nombre);
            if(pos==-1){
                Alumno a= new Alumno(nombre);
                a.incrementarVotos();
                ListaAlumnos.add(a);
            }
            else{
                ListaAlumnos.get(pos).incrementarVotos();
//                Alumno a=ListaAlumnos.get(pos);
//                a.incrementarVotos();
//                ListaAlumnos.set(pos,a);
            }
            System.out.println("Introduce el nombre");
            nombre=teclado.nextLine();
        }
    }
    
    public static void Imprimir(ArrayList<Alumno>ListaAlumnos){
        for(Alumno a: ListaAlumnos){
            System.out.println(a.toString());
        }
        System.out.println("El delegado es: "+ListaAlumnos.get(0).toString());
        System.out.println("El subdelegado es: "+ListaAlumnos.get(1).toString());
    }
    
    public static int BuscarNombre(ArrayList<Alumno>ListaAlumnos, String nombre){
        
        for (int i=0; i<ListaAlumnos.size(); i++){
            if(ListaAlumnos.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
                return ListaAlumnos.indexOf(ListaAlumnos.get(i));
            }
        }
        return -1;
    }
}

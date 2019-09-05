
package ordenacion;

import java.util.Arrays;
import java.util.Scanner;

class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private int altura;

    public Persona(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    public Persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
	return this.nombre + "  -  " + this.edad+ "  -  " + this.altura;
    }

    @Override
    public int compareTo(Persona o) {
        int resultado=Integer.compare(o.altura, this.altura);
        if (resultado!=0) return resultado;
        else  resultado=Integer.compare(this.edad, o.edad);
               if (resultado!=0) return resultado;
               else return (this.nombre.compareTo(o.nombre));
    }
}

public class Ordenacion {

    public static void main(String[] args) {
        int numper=5;
        Persona [] arrayPersonas = new Persona [numper];
        leerPersonas(arrayPersonas,numper);
        Arrays.sort(arrayPersonas);
        imprimirPersonas(arrayPersonas);
    }
    
    public static void leerPersonas(Persona[] personas, int numper) {
        int i;
        Scanner teclado = new Scanner(System.in);
        for (i = 0; i < numper; i++) {
            System.out.println("Introduce nombre, edad y altura");
            
            personas[i]=new Persona();
            personas[i].setNombre(teclado.nextLine());
            personas[i].setEdad(teclado.nextInt());
            personas[i].setAltura(teclado.nextInt());
            teclado.nextLine();
        }
    }
    
    public static void imprimirPersonas(Persona[] array){
        int i;
        for (i = 0; i < array.length; i++){
            System.out.println((i+1)+array[i].toString());
        }
    }
}


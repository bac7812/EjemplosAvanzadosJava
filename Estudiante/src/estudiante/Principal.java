package estudiante;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Estudiante est=new Estudiante();
        est.setCodigo(5);
        est.setNombre("Ana Ruiz");
        est.setNota(8.25);
        System.out.println("Código: "+est.getCodigo());
        System.out.println("Nombre: "+est.getNombre());
        System.out.println("Nota: "+est.getNota());
        Estudiante est1=new Estudiante("Pepe",7,9.5);
        System.out.println("Código: "+est1.getCodigo());
        System.out.println("Nombre: "+est1.getNombre());
        System.out.println("Nota: "+est1.getNota());
        Scanner teclado=new Scanner(System.in);
        String nombre=teclado.nextLine();
        int codigo=teclado.nextInt();
        double nota=teclado.nextDouble();
        Estudiante est2=new Estudiante(nombre,codigo,nota);
        double media=(est.getNota()+est1.getNota()+est2.getNota())/3;
        System.out.println("Nota global: "+media);
    }
}
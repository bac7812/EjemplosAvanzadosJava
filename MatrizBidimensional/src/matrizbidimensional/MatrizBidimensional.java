
package matrizbidimensional;

import java.util.Scanner;

public class MatrizBidimensional {

    public static void main(String[] args) {
        int [][] notas=new int[5][3];
        String [] nombres=new String [5];
        String [] asig=new String [3];
        int [] mediaAlumno=new int[5];
        leerAsignaturas(asig);
        leerNombre(nombres);
        leerNotas(notas,5,3);
        MediaAlumno(notas,mediaAlumno,5,3);
    }
    
    public static void leerAsignaturas(String[]a){
        int i;
        Scanner teclado=new Scanner (System.in);
        for (i=0; i<a.length; i++){
            System.out.println("Introduce asignatura "+i);
            a[i]=teclado.nextLine();
        }
    }
    
    public static void leerNombre (String[]n){
        int i;
        Scanner teclado=new Scanner (System.in);
        for (i=0; i<n.length; i++){
            System.out.println("Introduce nombre "+i);
            n[i]=teclado.nextLine();
        }
    }
    
    public static void leerNotas(int[][]notas, int nf, int nc){
        int f;
        int c;
        Scanner teclado=new Scanner (System.in);
        for (f=0; f<nf; f++){
            for (c=0; c<nc; c++){
                System.out.println("Introduce nota del alumno "+f+" asignatura "+c);
                notas[f][c]=teclado.nextInt();
            }
        }
    }
    
    public static void MediaAlumno(int[][]notas, int[]mediaAlumnos, int nf, int nc){
        int f;
        int c;
        for (f=0; f<nf; f++){
            for (c=0; c<nc; c++){
                mediaAlumnos[f]+=notas[f][c];
            }
        }
    }
    
    public static void impimeMedia(int[]media, String[]nombres, int nc){
        int f;
        for(f=0; f<media.length; f++){
            System.out.println("Alumno "+nombres[f]+" media "+media[f]/nc);
        }
    }
}
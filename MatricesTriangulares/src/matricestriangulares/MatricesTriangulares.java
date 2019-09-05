
package matricestriangulares;

import java.util.Scanner;

public class MatricesTriangulares {

    public static void main(String[] args) {
        int ne;
        Scanner teclado=new Scanner (System.in); 
        ne=teclado.nextInt(); 
        int [][] numeros=new int[ne][ne];
        leerNumeros(numeros,ne);
        if(leerTriangular(numeros,ne)){
            System.out.println("Si");
        }
        else{
            System.out.println("No");
        }
        leerRecorrer(numeros,ne);
    }
    
    public static void leerNumeros(int[][]numeros, int ne){
        int f;
        int c;
        Scanner teclado=new Scanner (System.in);
        for (f=0; f<ne; f++){
            for (c=0; c<ne; c++){
                if(c>=f){
                System.out.println("Introduce numero "+c+" en la fila "+c);
                numeros[f][c]=teclado.nextInt();
                }
            }
        }
        
        for (f=0; f<ne; f++){
            for (c=0; c<ne; c++){
                System.out.print(" "+numeros[f][c]);
            }
            System.out.println();
        }
    }
        
    public static boolean leerTriangular(int[][] numeros, int ne) {
        int f;
        int c;
        boolean tinferior = true;
        boolean tsuperior = true;
        for (f = 1; f < ne; f++) {
            for (c = 0; c < f; c++) {
                if (numeros[f][c] != 0) {
                    tinferior = false;
                }
            }
        }
        
        for (f = 0; f < ne - 1; f++) {
            for (c = f + 1; c < ne; c++) {
                if (numeros[f][c] != 0) {
                    tsuperior = false;
                }
            }
        }
        
        return (tinferior || tsuperior);
    }
    
    public static void leerRecorrer (int[][] numeros, int ne){
        int f;
        int c;
        for (c = 0; c < ne; c++) {
            if (c%2==0){
                for (f = 0; f < ne; f++) {
                    System.out.println("Pares: "+numeros[f][c]);
                }
            }
            else{
                for (f = ne-1; f >= 0; f--) {
                    System.out.println("Impares: "+numeros[f][c]);
                }
            }
        }
    }
}

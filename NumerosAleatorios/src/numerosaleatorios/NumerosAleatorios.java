
package numerosaleatorios;

import java.util.Scanner;

public class NumerosAleatorios {
    
 
 
    int [] numeros;
    
    public NumerosAleatorios(){
        
    }
    
    public NumerosAleatorios(int elem){
        numeros = new int [elem];
    }
    
    public void cargarNumerosEnteros(){
     
    
        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int)(Math.random()*40+1);
        }
    }
    
    public void buscarNumerosEnteros(int num){
        int cont=0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]==num){
                cont++;
            }
        }
        if (cont>=1){
            System.out.print("El numero "+num+" aparece "+cont+" vez(es) en las posicion(es): ");
            for (int i=0; i<numeros.length; i++){
                if (numeros[i]==num){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.out.print("El número no se encuentra en el array");
        }
    }
    
    public void mayorValor(){
        int mayor=numeros[0];
        int pos=0;
        for (int i=1; i<numeros.length; i++){
            if(mayor<numeros[i]) {
                mayor=numeros[i];
                pos=i;
            }
        }
        System.out.println("Número mayor: "+mayor+" esta en la posición: "+pos);
    }
    
    public void menorValor(){
        int menor=numeros[0];
        int pos=0;
        for (int i=1; i<numeros.length; i++){
            if(menor>numeros[i]) {
                menor=numeros[i];
                pos=i;
            }
        }
        System.out.println("Número menor: "+menor+" esta en la posición: "+pos);
    }
    
    public static void main(String[] args) {
        
        final int longitud=100;
        NumerosAleatorios na=new NumerosAleatorios(longitud);
        na.cargarNumerosEnteros();
        Scanner teclado=new Scanner (System.in);
     
        System.out.println("Introduce Numero Entero: ");
        int elem=teclado.nextInt();
        na.buscarNumerosEnteros(elem);
        System.out.println();
        na.mayorValor();
        na.menorValor();
    }
}

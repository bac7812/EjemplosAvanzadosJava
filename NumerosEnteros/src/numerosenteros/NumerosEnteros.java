
package numerosenteros;

import java.util.Scanner;

public class NumerosEnteros {
    

    int [] numeros;
    
    public NumerosEnteros(){
        
    }
    
    public NumerosEnteros(int elem){
        numeros= new int [elem];
    }
    
    public void cargarNumerosEnteros(){
        Scanner teclado=new Scanner (System.in);
    
        System.out.println("Los números enteros: ");
        for (int i=0; i<5; i++){
            System.out.print("Numeros ["+i+"]= ");
            numeros[i]=teclado.nextInt();
        }
    }
    
    public void buscarNumerosEnteros(int num){
        int cont=0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]==num){
                cont++;
            }
        }
        System.out.println("El numero "+num+" aparece "+cont+" veces en las posiciones:  ");
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]==num){
                System.out.print(i+" ");
            }
        }
    }
    
    public void Menor(){
        int men=numeros[0];
        int pos=0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]<men){
                men=numeros[i];
                pos=i;
            }
        }
        System.out.println("El numero menor es: "+men+" aparece en la posicion "+pos);
     
    }
       
    public void Mayor(){
        int may=numeros[0];
        int pos=0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]>may){
                may=numeros[i];
                pos=i;
            }
        }
        System.out.println("El numero mayor es: "+may+" aparece en la posicion "+pos);
     
    }
    
    public static void main(String[] args) {
        final int LONGITUD=5;
        NumerosEnteros ne=new NumerosEnteros(LONGITUD);
        ne.cargarNumerosEnteros();
        ne.buscarNumerosEnteros(10);
        ne.Menor();
        ne.Mayor();
    }
}

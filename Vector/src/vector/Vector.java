
package vector;

import java.util.Scanner;

public class Vector {
    
    private int pos;
    private int neg;
    private int cero;
    private int [] numeros;

    public Vector(int numElementos){
        numeros=new int[numElementos];
    }

    public void CargarVector(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Lectura de los elementos del array: ");
        for (int i=0; i<numeros.length; i++){
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
    }
    
    public void CargarPositivosNegaivosCeros(){
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]>0){
                pos++;
            }
            else
                if(numeros[i]<0){
                    neg++;
                }
                else{
                    cero++;
                }
        }
    }
    
    public int mayorValor(){
        int mayor=numeros[0];
        for (int i=1; i<numeros.length; i++){
            if(mayor<numeros[i]) mayor=numeros[i];
        }
        return mayor;
    }
    
    @Override
    public String toString(){
        return "Positivo: " +pos+ " Negativos: " +neg+ " Ceros: " +cero;
    }
}
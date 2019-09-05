
package vectores;

import java.util.Scanner;

public class Vectores {

    int pos;
    int neg;
    int cero;
    int [] numeros;
    
    public Vectores(int numElementos){
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
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce cuantos elementos tiene el vector");
        int elem = teclado.nextInt();
        Vectores numeros = new Vectores(elem);
        numeros.CargarVector();
        numeros.CargarPositivosNegaivosCeros();
        System.out.println(numeros.toString());
        System.out.println("El valor mayor es: "+numeros.mayorValor());
    }
    
}
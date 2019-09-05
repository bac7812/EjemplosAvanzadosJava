
package numerosazar;

public class NumerosAzar {

     int [] numeros;
    
    public NumerosAzar(){
        
    }
    
    public NumerosAzar(int elem){
        numeros = new int [elem];
    }
    
    public void cargarNumerosEnteros(){
        for (int i=0; i<numeros.length; i++){
            numeros[i]=(int)(Math.random()*31+20);
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
            System.out.println("El numero "+num+" aparece "+cont+" vez(es)");
           
        }
        else {
            System.out.println("El número "+num+" no se encuentra en el array");
        }
    }
    
    public void visualizar() {
        for (int i=0;i<numeros.length;i++) {
            if (i%20==0) System.out.println();
            System.out.print(numeros[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        final int longitud=100;
        NumerosAzar na=new NumerosAzar(longitud);
        na.cargarNumerosEnteros();
        na.visualizar();
        System.out.println();
        for (int i=21;i<=30;i++)
        na.buscarNumerosEnteros(i);
    }
}


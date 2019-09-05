
package balonoro;

class Jugador implements Comparable<Jugador> {
    
    String nombre;
    int votos;
    int primero;
    int segundo;

    public Jugador(String nombre, int votos, int primero, int segundo) {
        this.nombre = nombre;
        this.votos = 0;
        this.primero = 0;
        this.segundo = 0;
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

    public int getPrimero() {
        return primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "BalonOro{" + "nombre=" + nombre + ", votos=" + votos + '}';
    }
    
    @Override
    public int compareTo(Jugador j){
        int resultado=Integer.compare(j.votos,votos);
        if(resultado!=0){
            return resultado;
        }
        else{
            resultado=Integer.compare(j.primero,primero);
            if(resultado!=0){
                resultado=Integer.compare(j.segundo,segundo);
            }
        }
    }
}

public class BalonOro {
    
    public static void main(String[] args) {
        
    }
    
}


package clasificacionfutbol;

import java.util.Arrays;
import java.util.Scanner;

class Equipo implements Comparable<Equipo>{

	private String nombre;
	private int puntos;
        private int ganados;
        private int empatados;
        private int perdidos;
        private int golesmetidos;
        private int golesencajados;
       
    public Equipo(String nombre) {
	this.nombre = nombre;	
    }
    
    public int getGolesmetidos() {
        return golesmetidos;
    }

    public void setGolesmetidos(int goles) {
        this.golesmetidos +=goles;
    }

    public int getGolesencajados() {
        return golesencajados;
    }

    public void setGolesencajados(int goles) {
        this.golesencajados +=goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados() {
        this.ganados ++;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados() {
        this.empatados++;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos() {
        this.perdidos++;
    }
    

    public String toString() {
        return this.nombre + " " + this.puntos+ " " + this.ganados +" " +this.empatados + " " + this.perdidos+ " "+this.golesmetidos+ " " + this.golesencajados;
    }
    
    @Override
    public int compareTo(Equipo o) {
        return (this.nombre.compareTo(o.nombre));          
    }
}

public class ClasificacionFutbol {
    
    public static void main(String[] args) {
        int k;
        int i;
        String nombre1; 
        int goles1; 
        String nombre2; 
        int goles2;
        int ne=0;
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int limite=casos*2;
        Equipo[] equipos=new Equipo[limite];  
        sc.nextLine();
        for (k = 0; k < casos; k++) {
           
            String  linea=sc.nextLine();
            String[] datos=linea.split(" ");
            goles1=Integer.parseInt(datos[1]);
            goles2=Integer.parseInt(datos[3]);

            int pos1=buscar(equipos,datos[0], limite);
            int pos2=buscar(equipos,datos[2],limite);
            equipos[pos1].setGolesmetidos(goles1);
            equipos[pos1].setGolesencajados(goles2);
            equipos[pos2].setGolesmetidos(goles2);
            equipos[pos2].setGolesencajados(goles1);
           if(goles1>goles2){ 
                   equipos[pos1].setGanados();
                   equipos[pos1].setPuntos(3);
                   equipos[pos2].setPerdidos();
                           }
           else if (goles1==goles2){
                   equipos[pos1].setEmpatados();
                   equipos[pos1].setPuntos(1);
                   equipos[pos2].setPuntos(1);
                   equipos[pos2].setEmpatados();
                
           }
           else {
                   equipos[pos2].setGanados();
                   equipos[pos2].setPuntos(3);
                   equipos[pos1].setPerdidos();
           
           }
        }
        Arrays.sort(equipos);
        imprimir( equipos,limite);
    }
    
    public static void imprimir (Equipo[] equipos, int limite){
        for (int i=0;i<limite; i++)
            if(equipos[i]!=null) System.out.println(equipos[i].toString());
    
    }
    
    public static int buscar (Equipo[] Equipos, String nombre, int limite){
        int c=0;
        while (Equipos[c]!=null && c<limite) {
            if(Equipos[c].getNombre().equals(nombre) )  break;
            c++;
            }
       if (Equipos[c]==null) Equipos[c]=new Equipo(nombre);
        return c;
        }
}
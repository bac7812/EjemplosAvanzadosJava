
package presupuestos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Categoria{

    String categoria;
    int horas;
    int costeHora;
    int costeMat;

    public Categoria(String categoria, int horas ,int costeHora, int costeMat) {
        this.categoria = categoria;
        this.horas=horas;
        this.costeHora = costeHora;
        this.costeMat = costeMat;
       
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public int getHoras() {
        return horas;
    }

    public int getCosteHora() {
        return costeHora;
    }

    public int getCosteMat() {
        return costeMat;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCosteHora(int costeHora) {
        this.costeHora = costeHora;
    }

    public void setCosteMat(int costeMat) {
        this.costeMat = costeMat;
    }
}
class Empresa implements Comparable<Empresa>{  
    
    String empresa;
    int horas;
    int presupuesto;
    int orden;

    public Empresa(String empresa, int orden) {
        this.empresa = empresa;
        this.horas = 0;
        this.presupuesto=0;
        this.orden = orden;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getHoras() {
        return horas;
    }

    public void setPresupuesto(int importe) {
        this.presupuesto += importe;
    }
    
    public void setHoras(int horas){
           this.horas+=horas;
    }
    
    public int  compareTo(Empresa o){
     int resultado= (Integer.compare(this.presupuesto,o.presupuesto));
     if(resultado!=0) return resultado;
     resultado= (Integer.compare(this.horas,o.horas));
     if(resultado!=0)return resultado;
     else  return Integer.compare(this.orden,o.orden);
    }
    
    public String toString(){
        return empresa+ " "+horas;
    }
}

public class Presupuestos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tiposCat = {"A", "C", "E", "F", "O", "R"};
        ArrayList<Empresa> empresas = new ArrayList<Empresa>();
        int totalHoras = 0;
        String nombre = sc.nextLine();
        int orden = 0;
        while (!nombre.equals("fin")) {
            orden++;
            Categoria[] cat = new Categoria[6];
            Empresa e = new Empresa(nombre, orden);

            while (true) {
                String linea = sc.nextLine();
                String[] tarea = linea.split(" ");
                if (Integer.parseInt(tarea[1]) == 0 && Integer.parseInt(tarea[2]) == 0 && Integer.parseInt(tarea[3]) == 0) {
                    break;
                }
                int n = Arrays.binarySearch(tiposCat, tarea[0]);
                if (n >= 0) {
                    buscar(cat, tarea);
                }
            }
            
            int c = 0;
            while (cat[c] != null) {

                e.setHoras(cat[c].getHoras());
                e.setPresupuesto(cat[c].horas * cat[c].costeHora + cat[c].costeMat);
                c++;
            }
            
            empresas.add(e);
            nombre = sc.nextLine();
        }
        
        Collections.sort(empresas);
        System.out.println(empresas.get(0).toString());
    }
    
    public static  void buscar(Categoria[] cat, String[]tarea){
        int c = 0;
        boolean existe = false;

        while (cat[c] != null) {

            if (cat[c].getCategoria().equals(tarea[0])) {
                int pres = cat[c].getHoras() * cat[c].getCosteHora() + cat[c].getCosteMat();
                int nuevopres = Integer.parseInt(tarea[1]) * Integer.parseInt(tarea[2]) + Integer.parseInt(tarea[3]);
                if (pres > nuevopres) {
                    cat[c].setHoras(Integer.parseInt(tarea[1]));
                    cat[c].setCosteHora(Integer.parseInt(tarea[2]));
                    cat[c].setCosteMat(Integer.parseInt(tarea[3]));
                }
                existe = true;
                break;
            }
            c++;
        }

        if (existe == false) {
            cat[c] = new Categoria(tarea[0], Integer.parseInt(tarea[1]), Integer.parseInt(tarea[2]), Integer.parseInt(tarea[3]));
        }
   }
}
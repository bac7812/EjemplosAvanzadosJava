

package presupuesto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Presupuesto {

    public static void main(String[] args) {
        ArrayList<Empresa> empresa = new ArrayList<Empresa>();
        CargarDatos(empresa);
        Imprimir(empresa);
    }
    
    public static void CargarDatos(ArrayList<Empresa> ListaEmpresa){
        Scanner teclado=new Scanner(System.in);
        String NombreEmpresa;
        int orden=1;
        do{
            NombreEmpresa=teclado.nextLine().toUpperCase().trim();
            if (NombreEmpresa.equals("FIN")){
                break;
            }
            ArrayList<Categoria> categoria = new ArrayList<Categoria>();
            Empresa empresa=new Empresa(NombreEmpresa, categoria, orden);
            do{
                String lineaCategoria= teclado.nextLine();
                String [] datosCategoria=lineaCategoria.split(" ");
                if(datosCategoria[1].trim().equals("0")&&datosCategoria[2].trim().equals("0")&&datosCategoria[3].trim().equals("0")){break;}
                Categoria cat=new Categoria(datosCategoria[0],Integer.parseInt(datosCategoria[1]),Integer.parseInt(datosCategoria[2]),Integer.parseInt(datosCategoria[3]));
                Categoria catb=empresa.buscar(cat);
                if(catb==null){
                    categoria.add(cat);
                }
                else{
                    if(cat.costeCategoria()<catb.costeCategoria()){
                        int a=categoria.indexOf(catb);
                        categoria.set(a,cat);
                    }
                }
                empresa.setCategoria(categoria);
            }
            
            while(true);
            ListaEmpresa.add(empresa);
            orden++;
        }
        while(true);
    }
    
    public static void Imprimir(ArrayList<Empresa> ListaEmpresa){
    Collections.sort(ListaEmpresa);
        System.out.println(ListaEmpresa.get(0).toString());
    }
}

class Categoria{
    
    private String categoria;
    private int horas;
    private int costeH;
    private int costeM;

    public Categoria(String categoria, int horas, int costeH, int costeM) {
        this.categoria = categoria;
        this.horas = horas;
        this.costeH = costeH;
        this.costeM = costeM;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public int getHoras() {
        return horas;
    }

    public int getCosteH() {
        return costeH;
    }

    public int getCosteM() {
        return costeM;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCosteH(int costeH) {
        this.costeH = costeH;
    }

    public void setCosteM(int costeM) {
        this.costeM = costeM;
    }
    
    public int costeCategoria(){
        int total;
        total=costeM+(costeH*horas);
        return total;
    }
}

class Empresa implements Comparable<Empresa>{
    
    private String nombre;
    private ArrayList<Categoria> categorias;
    private int orden;
    
    public Empresa(){
        
    }

    public Empresa(String nombre, ArrayList<Categoria> categorias, int orden) {
        this.nombre = nombre;
        this.categorias = categorias;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public int getOrden() {
        return orden;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", horas=" + horas() + ", presupuesto=" + presupuesto() + '}';
    }    
    
    public int presupuesto(){
        int total=0;
        for(Categoria c:categorias){
            total=total+c.costeCategoria();
        }
        return total;
    }
    
    public int horas(){
        int total=0;
        for(Categoria c:categorias){
            total=total+c.getHoras();
        }
        return total;
    }
    
    public Categoria buscar(Categoria c){
        for(Categoria cat:categorias){
            if(c.getCategoria().equals(cat.getCategoria())){
                return cat;
            }
        }
        return null;
    }

    @Override
    public int compareTo(Empresa t) {
        int resultado;
        resultado=Integer.compare(this.presupuesto(),t.presupuesto());
        if (resultado!=0){
            return resultado;
        }
        else{
            resultado=Integer.compare(this.horas(),t.horas());
            if(resultado!=0){
                return resultado;
            }
            else{
                return Integer.compare(this.orden,t.orden);
            }
        }
    }
}

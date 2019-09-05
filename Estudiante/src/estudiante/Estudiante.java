
package estudiante;

public class Estudiante {
    
    private String nombre;
    private int codigo;
    private double nota;
    
    public Estudiante(){
    }
    
    public Estudiante(String nombre, int codigo, double nota){
        this.nombre=nombre;
        this.codigo=codigo;
        this.nota=nota;
    }
    
    public String getNombre(){
           return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getCodigo(){
           return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public double getNota(){
           return nota;
    }
    
    public void setNota(double nota){
        this.nota=nota;
    }
}

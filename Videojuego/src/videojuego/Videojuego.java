
package videojuego;

public class Videojuego {
    
    private String titulo;
    private Time horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Time horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public Time getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }
    
    public Videojuego (){
        Time t=new Time(10,0);
        this.horasEstimadas=t;
        this.entregado=false;
    }

    public Videojuego (String titulo, Time horasEst){
        this.titulo=titulo;
        this.horasEstimadas=horasEst;
    }
    
    public void entregar(){
        this.entregado=true;
    }
    
    public void devolver(){
        this.entregado=false;
    }
    
    public boolean isEntregado(){
        return this.entregado;
    }
    
    public String toString (){
        return "Campañia: "+this.compania+" \n"+"Genero: "+this.genero+" \n"+"Titulo: "+this.titulo+" \n"+"Horas Estimadas: "+this.horasEstimadas+" \n"+"Entregado: "+this.entregado;
    }
}

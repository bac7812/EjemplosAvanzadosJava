
package calzado;

public class Calzado {

    private double numero;
    private double precio;
    private int existencias;
    private String tipo;
    private String sexo;
    
    public Calzado(){
        
    }

    public Calzado(double numero, double precio, int existencias, String tipo, String sexo) {
        this.numero = numero;
        this.precio = precio;
        this.existencias = existencias;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getTallaUK (){
        switch (String.valueOf(this.numero)){
            case "36.0":
                return "3";
            case "36.5":
                return "3.5";
            case "37.0":
                return "4";
            case "37.5":
                return "4.5";
            case "38.0":
                return "5";
            case "38.5":
                return "5.5";
            case "39.0":
                return "6";
            case "39.5":
                return "6.5";
            case "40.0":
                return "7";
            case "41.0":
                return "7.5";
            case "42.0":
                return "8";
            case "42.5":
                return "8.5";
            case "43.0":
                return "9";
            case "44.0":
                return "9.5";
            case "44.5":
                return "10";
            default: return "número erroneo";
        }
    }
    
    public String getTallaUS (){
        switch (String.valueOf(this.numero)){
            case "36.0":
                return "5.5";
            case "36.5":
                return "6";
            case "37.0":
                return "6.5";
            case "37.5":
                return "7";
            case "38.0":
                return "7.5";
            case "38.5":
                return "8";
            case "39.0":
                return "8.5";
            case "39.5":
                return "9";
            case "40.0":
                return "9.5";
            case "41.0":
                return "10";
            case "42.0":
                return "10.5";
            case "42.5":
                return "11";
            case "43.0":
                return "11.5";
            case "44.0":
                return "12";
            case "44.5":
                return "12.5";
            default: return "número erroneo";
        }
    }
}
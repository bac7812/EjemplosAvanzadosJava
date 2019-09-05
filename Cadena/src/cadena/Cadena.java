
package cadena;

public class Cadena {
    
    private String texto;
    
    public Cadena(){
        
    }
    
    public Cadena (String texto){
        this.texto=texto;
    }
    
    public String getTexto(){
        return texto;
    }
    
    public void setTexto(String texto){
        this.texto=texto;
    }
    
    public boolean palindroma(){
        String cad="";
        
        for (int i=texto.length()-1; i>=0; i--){
            cad=cad+this.texto.charAt(i);
        }
        return (cad.equals(this.texto));
    }
    
    public int cuentaVocales() {
        int contVocales=0;
        for (int i=0; i<texto.length(); i++){
            char c=texto.charAt(i);
            if (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                contVocales++;
            }
        }
        return contVocales;
    }
    
    public boolean esNumero(){
        boolean esnum=true;
        for (int i=0; i<texto.length(); i++){
            char c=texto.charAt(i);
            if ((int)c<48 || (int)c>57){
                esnum=false;
            }
        }
        return esnum;
    }
}
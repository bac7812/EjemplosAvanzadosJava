
package fecha;

public class Fecha {

    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public void incrementate(int d){
        
        for (int i=0; i<d; i++){
            dia++;
            switch (mes){
                case 1:
                    if (dia>31){
                        mes++;
                        dia=1;
                    }
                case 2:
                    //if (dia>28){
                    if ((bisiesto()==false&&dia>28) || (bisiesto()==true && dia>29)){
                        mes++;
                        dia=1;
                    }
                case 3:
                    if (dia>30){
                        mes++;
                        dia=1;
                    }
                case 4:
                    if (dia>30){
                        mes++;
                        dia=1;
                    }
                case 5:
                    if (dia>31){
                        mes++;
                        dia=1;
                    }
                case 6:
                    if (dia>30){
                        mes++;
                        dia=1;
                    }
                case 7:
                    if (dia>31){
                        mes++;
                        dia=1;
                    }
                case 8:
                    if (dia>31){
                        mes++;
                        dia=1;
                    }
                case 9:
                    if (dia>30){
                        mes++;
                        dia=1;
                    }
                case 10:
                    if (dia>31){
                        mes++;
                        dia=1;
                    }
                case 11:
                    if (dia>30){
                        mes++;
                        dia=1;
                    }
                case 12:
                    if (dia>31){
                        mes=1;
                        dia=1;
                        anyo++;
                    }
            }
        }
    }
    private String mesLetra(){
        switch (this.mes){
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default: return "mes erroneo";
        }
    }
    
    public void imprimete(){
        System.out.println(this.dia+"-"+mesLetra()+"-"+anyo);
    }
    
    public boolean bisiesto(){
        if ((anyo%4==0 && (anyo%100!=0))||(anyo%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
}
package hora;

public class Llamada {

    private String numeroTelefono;
    private Hora comienzoLlamada;
    private Hora finLlamada;

    public Llamada(String numeroTelefono, Hora comienzoLlamada, Hora finLlamada) {
        this.numeroTelefono = numeroTelefono;
        this.comienzoLlamada = comienzoLlamada;
        this.finLlamada = finLlamada;
    }

    public void setComienzoLlamada(Hora comienzoLlamada) {
        this.comienzoLlamada = comienzoLlamada;
    }

    public void setFinLlamada(Hora finLlamada) {
        this.finLlamada = finLlamada;
    }

    public void escribeHoraComienzo() {
        System.out.println(this.getComienzoLlamada().getHora() + ":" + this.getComienzoLlamada().getMinutos() + ":" + this.getComienzoLlamada().getSegundos());
    }

    public void escribeHoraFin() {
        System.out.println(this.getFinLlamada().getHora() + ":" + this.getFinLlamada().getMinutos() + ":" + this.getFinLlamada().getSegundos());
    }

    public int duracionLlamada() {
        int segundosC = (this.getComienzoLlamada().getHora()) * 3600 + (this.getComienzoLlamada().getMinutos()) * 60 + (this.getComienzoLlamada().getSegundos());
        int segundosF = (this.getFinLlamada().getHora()) * 3600 + (this.getFinLlamada().getMinutos()) * 60 + (this.getFinLlamada().getSegundos());
        int duracion = segundosF - segundosC;
        if (duracion < 0) {
            return -1;

        } else {
            return duracion;
        }
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Hora getComienzoLlamada() {
        return comienzoLlamada;
    }

    public Hora getFinLlamada() {
        return finLlamada;
    }
}

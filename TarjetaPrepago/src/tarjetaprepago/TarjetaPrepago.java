
package tarjetaprepago;

public class TarjetaPrepago {

    private String numeroTelefono;
    private String nif;
    private double saldo;
    private Tiempo consumo;

    public TarjetaPrepago() {

    }

    public TarjetaPrepago(String numeroTelefono, String nif, double saldo) {
        this.numeroTelefono = numeroTelefono;
        this.nif = nif;
        this.saldo = saldo;
    }

    public void ingresarSaldo(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void enviarMensaje(int mensajes) {
        saldo = saldo - (mensajes * 0.09);
    }

    public void llamadaRealizada(int seg) {
        saldo = saldo - (0.15 + seg * 0.01);
        int minutos = seg / 60;
        int segundos = seg % 60;
        consumo = new Tiempo(minutos, segundos);
    }

    public String consultarTelefono() {
        return numeroTelefono;
    }

    public String consultarNif() {
        return nif;
    }

    public void establecerTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void establecerNif(String nif) {
        this.nif = nif;
    }

    public void establecerSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String consultarNumero() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public Tiempo getConsumo() {
        return consumo;
    }
}

class Tiempo {

    int minutos;
    int segundo;

    public Tiempo(int minutos, int segundo) {
        this.minutos = minutos;
        this.segundo = segundo;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundo() {
        return segundo;
    }
}

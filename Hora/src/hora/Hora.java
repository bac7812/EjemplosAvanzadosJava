package hora;

public class Hora {

    public Hora() {
        
    }
    
    private int hora = 0;
    private int minutos = 0;
    private int segundos = 0;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        if (hora > 23 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0) {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
        if (hora > 23 || hora < 0) {
            this.hora = 0;
            minutos = 0;
            segundos = 0;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        if (minutos > 59 || minutos < 0) {
            this.minutos = 0;
            hora = 0;
            segundos = 0;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        if (segundos > 59 || segundos < 0) {
            this.segundos = 0;
            hora = 0;
            minutos = 0;
        }
    }

    public void setHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minutos = minuto;
        this.segundos = segundo;
        if (hora > 23 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0) {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public void reiniciaHora() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public void reiniciaHora(int hora) {
        this.hora = 12;
        this.minutos = 0;
        this.segundos = 0;
    }

    public void incrementaHora(int segundo) {
        for (; segundo > 0; segundo--) {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }
    }

    public String getHora24() {
        String hora24;

        hora24 = hora + ":" + minutos + ":" + segundos;
        return hora24;
    }

    public String getHora12() {
        String hora12;

        if (hora == 0) {
            hora12 = (hora + 12) + ":" + minutos + ":" + segundos + " AM";
        } else if (hora >= 1 && hora <= 11) {
            hora12 = hora + ":" + minutos + ":" + segundos + " AM";
        } else if (hora == 12) {
            hora12 = hora + ":" + minutos + ":" + segundos + " PM";
        } else {
            hora12 = (hora - 12) + ":" + minutos + ":" + segundos + " PM";
        }
        return hora12;
    }
}

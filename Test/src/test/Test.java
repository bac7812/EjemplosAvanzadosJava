
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

    public static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Pregunta> plantilla=new ArrayList<Pregunta>();
        ArrayList<Alumno> listaTest=new ArrayList<Alumno>();
        CargarDatos(plantilla);
        CargarTest(listaTest);
        evaluar(plantilla, listaTest);
        listarResultados(listaTest);
    }
    
    public static void CargarDatos(ArrayList<Pregunta> plantilla){
        int npreguntas=teclado.nextInt();
        teclado.nextLine();
        String linea;
        for(int i=0; i<npreguntas; i++){
            linea=teclado.nextLine();
            String [] datos=linea.split("-");
            Pregunta pregunta=new Pregunta(Integer.parseInt(datos[0]),datos[1]);
            plantilla.add(pregunta);
        }
    }
    
    public static void CargarTest(ArrayList<Alumno> listaTest){
        String nombre=teclado.nextLine();
        while(!nombre.toUpperCase().equals("FIN")){
            ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
            String datos=teclado.nextLine();
            while(!datos.toUpperCase().equals("0-O")){
                String [] res=datos.split("-");
                Pregunta respuesta=new Pregunta(Integer.parseInt(res[0]),res[1]);
                preguntas.add(respuesta);
                datos=teclado.nextLine();
            }
            Alumno alumno=new Alumno(nombre, preguntas);
            listaTest.add(alumno);
            nombre=teclado.nextLine();
        }
    }
    
    public static void evaluar(ArrayList<Pregunta>plantilla, ArrayList<Alumno> listaTest){
        for (Alumno alumno:listaTest){
            for(Pregunta p:alumno.getRespuestas()){
                int pos=p.getNumero()-1;
                Pregunta preguntaCorrecta=plantilla.get(pos);
                if(preguntaCorrecta.getLetraCorrecta().equals(p.getLetraCorrecta())){
                    alumno.incrementarAcertadas();
                }
                else{
                    alumno.incremetarFalladas();
                }
                alumno.obtenerEnBlanco(plantilla.size());
                alumno.obtenerNota(plantilla.size());
            }
        }
    }
    
    public static void borraralumno(String nombrealumno, ArrayList<Alumno> listaTest){
        for(Alumno a:listaTest){
            if(!nombrealumno.toUpperCase().equals(a.getNombre().toUpperCase())){
                listaTest.remove(a);
            }
        }
    }
    
    public static void evaluaralumno(int nalum, ArrayList<Pregunta>plantilla, ArrayList<Alumno> listaTest){
        Alumno a=listaTest.get(nalum-1);
        for(Pregunta p:a.getRespuestas()){
            int pos=p.getNumero()-1;
                Pregunta preguntaCorrecta=plantilla.get(pos);
                if(preguntaCorrecta.getLetraCorrecta().equals(p.getLetraCorrecta())){
                    a.incrementarAcertadas();
                }
                else{
                    a.incremetarFalladas();
                }
            a.obtenerEnBlanco(plantilla.size());
            a.obtenerNota(plantilla.size());
            System.out.println(a.toString());
        }
    }
    
    public static void listarResultados(ArrayList<Alumno> listaTest){
        Collections.sort(listaTest);
        for(Alumno alum:listaTest){
            System.out.println(alum.toString());
        }
    }
}

class Pregunta{
    
    private int numero;
    private String letraCorrecta;

    public Pregunta(int numero, String letraCorrecta) {
        this.numero = numero;
        this.letraCorrecta = letraCorrecta;
    }

    public int getNumero() {
        return numero;
    }

    public String getLetraCorrecta() {
        return letraCorrecta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLetraCorrecta(String letraCorrecta) {
        this.letraCorrecta = letraCorrecta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "numero=" + numero + ", letraCorrecta=" + letraCorrecta + '}';
    }
}

class Alumno implements Comparable<Alumno>{
    
    private String nombre;
    private int acertadas;
    private int falladas;
    private int enBlanco;
    private ArrayList<Pregunta> respuestas;
    private double nota;

    public Alumno(String nombre, ArrayList<Pregunta> respuestas) {
        this.nombre = nombre;
        this.acertadas = 0;
        this.falladas = 0;
        this.enBlanco = 0;
        this.respuestas = respuestas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAcertadas() {
        return acertadas;
    }

    public int getFalladas() {
        return falladas;
    }

    public int getEnBlanco() {
        return enBlanco;
    }

    public ArrayList<Pregunta> getRespuestas() {
        return respuestas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAcertadas(int acertadas) {
        this.acertadas = acertadas;
    }

    public void setFalladas(int falladas) {
        this.falladas = falladas;
    }

    public void setEnBlanco(int enBlanco) {
        this.enBlanco = enBlanco;
    }

    public void setRespuestas(ArrayList<Pregunta> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", acertadas=" + acertadas + ", falladas=" + falladas + ", enBlanco=" + enBlanco + ", nota=" + nota +", respuestas=" + respuestas + '}';
    }
    
    public void incrementarAcertadas(){
        acertadas++;
    }
    
    public void incremetarFalladas(){
        falladas++;
    }
    
    public void obtenerEnBlanco(int total){
        enBlanco=total-(acertadas+falladas);
    }
    
    public void obtenerNota(int total){
        double puntos=10/total;
        nota=acertadas*puntos-(falladas*(puntos/2));
    }
    
    @Override
    public int compareTo(Alumno a){
        int resultado=Double.compare(a.nota, this.nota);
        if(resultado!=0){
            return resultado;
        }
        else{
            return a.nombre.compareTo(this.nombre);
        }
    }
}

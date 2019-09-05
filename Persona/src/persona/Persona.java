
package persona;

public class Persona {
    
    private String nombre="";
    private int edad=0;
    private String dni="";
    private char sexo=' ';
    private double peso=0.0;
    private double altura=0.0;

    /* Constructor por defecto */
    
    public Persona() {
        
    }
    /* Constructor con  parametros nombre, dni, sexo y edad */
    
    public Persona(String nombre,char sexo,int edad ) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;        
    }

    /* constructor que recibe como parametros  todos los atributos */
    
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        this.sexo=sexo;
    }
    
    /* Declararacion de los métodos públicos para cada parámetro*/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
       this.sexo=sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    /*calcularIMC(): calculará si la persona está en su peso ideal .
    El IMC se calcula a partir de la fórmula: peso(kg)/talla^2. 
    El método devuelve un string con IMC correspondiente
    */
    
    public String calcularIMC() {
        String categoriaIMC = "";
        double imc =this.peso / Math.pow(this.altura, 2);
        imc=Math.rint(imc*10)/10; 
        if (imc < 18.5) categoriaIMC = "Por debajo del peso";
        else if ((imc >= 18.5) && (imc <= 24.9)) categoriaIMC = "Saludable";
        else if ((imc >= 25.0) && (imc <= 29.9)) categoriaIMC = "Con sobrepeso";
        else if((imc >= 30) && (imc <= 39.9)) categoriaIMC = "Obeso";
        else  categoriaIMC = "Obesidad extrema o de alto riesgo";
        return categoriaIMC;      
    }
    
    /* Metodo  que indica si es mayor de edad, devolviendo un booleano..
    */
   
    public boolean esMayorDeEdad() {
        return (edad >= 18);
    }
    
    /* Método para compruebar que el sexo introducido es correcto. Si no es correcto, sera H. 
    Entendiendo por correcto H o M , en el caso de que este en minúscula  se convertirán a mayúsculas..    
    */
    
    public void comprobarSexo() {
        this.sexo=String.valueOf(sexo).toUpperCase().charAt(0);
        if ((sexo != 'H') && (sexo != 'M')) this.sexo = 'H';
    }

    /* Devuelve  toda la informacion de persona en un único string
    */
    
    @Override
    public String toString() {
        return "nombre: " + nombre + "\n edad:" + edad + "\n dni:" + dni + "\n sexo:" + sexo + "\n peso:" + peso + "\n altura:" + altura ;
    }
    
    /* ComprobarDNI():El método devolverá true o false después de comprobar que está formado por 8 números
    y que el noveno carácter es una letra. También se comprobará que la letra
    es la correspondiente al número, invocando al método ObtenerLetra(). 
    */
    
    public boolean ComprobarDNI() 
    {  int pos=0;
       while( ((int)dni.charAt(pos)>=48&&(int)dni.charAt(pos)<=57) && pos<8)
                    pos++;
       return  (obtenerLetra()==dni.charAt(8) && pos==8 && dni.trim().length()==9);
           
    }
    
    public char obtenerLetra() {
       String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
       int numero = Integer.parseInt(dni.substring(0, 8));
       return  letras.charAt(numero % 23);
    }
    
}
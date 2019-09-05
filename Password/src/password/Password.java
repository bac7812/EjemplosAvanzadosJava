
package password;

import java.util.Random;

public class Password {
   
    String contraseña;
    int longitud = 8;
  
    public Password(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte() {
        char c;
        int m = 0, mi = 0, n = 0;
        for (int i = 0; i < longitud; i++) {
            int ascii = (int) (contraseña.charAt(i));
            if (ascii >= 65 && ascii <= 90) {
                m++;
            }
            if (ascii >= 97 && ascii <= 122) {
                mi++;
            }
            if (ascii >= 48 && ascii <= 57) {
                n++;
            }
        }
        return (m > 2 && mi > 3 && n >3);
    }

    public void generarPass() {
        String pass = ""; int ascii;
        Random rnd = new Random();
        for (int i = 0; i < longitud; i++) {
           
            do {
                ascii = (int) (rnd.nextDouble() * 74 + 48);
                
            } while ((ascii >= 58 && ascii <=64) || (ascii >= 91 && ascii <= 96));
            pass += (char) ascii;
        }
        contraseña = pass;
    }
}
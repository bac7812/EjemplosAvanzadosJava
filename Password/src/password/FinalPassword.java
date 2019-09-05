
package password;

public class FinalPassword {
    
    public static void main(String[] args) {
       Password pass=new Password(15);
       pass.generarPass();
       System.out.println(pass.getContraseña()+" -- "+pass.esFuerte());
    }
}

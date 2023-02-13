
package ejerciciosnormales14;

import Movil.Movil;
import ServicioTelefono.ServicioTelefono;

/**
 * @author Abel
 */
public class TelefonoMovil {

   
    public static void main(String[] args) {
        ServicioTelefono A = new ServicioTelefono();
        Movil a1 = A.cargarCelular();
        A.ingresarCodigo(a1);
       
     
        
    }
    
}

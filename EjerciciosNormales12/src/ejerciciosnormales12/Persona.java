
package ejerciciosnormales12;

import EntidadPersona.EntidadPersona;
import ServicioPersona.ServicioPersona;

/**
 * @author Abel
 */
public class Persona {


    public static void main(String[] args) {
        ServicioPersona A = new ServicioPersona();
        EntidadPersona a1 = A.crearPersona();
        A.calcularEdad(a1);
        A.menorQue(a1);
        A.mostrarPersona(a1);
    }
    
}

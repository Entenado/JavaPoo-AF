
package ejerciciosnormales3;


import EntidadesOperaciones.Operaciones;
import ServiciolOperaciones.Servicios;


public class Operacion {

    
    public static void main(String[] args) {
        
        Servicios sm = new Servicios();
        Operaciones n1 = sm.crearOperacion();
        sm.sumar(n1);
        sm.restar(n1);
        sm.multiplicar(n1);
        sm.dividir(n1);
    }
    
}

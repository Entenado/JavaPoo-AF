
package ejercicionormal6;

import Entidad.EntidadesCafetera;
import Servicios.cafeteraServicios;

/**
 * @author Abel
 */
public class Cafetera {

    
    public static void main(String[] args) {
        
    
    
    cafeteraServicios a1 = new cafeteraServicios();
    EntidadesCafetera m1 = a1.Cafe();
    a1.llenarCafetera(m1);
    a1.servirTaza(m1);
    a1.vaciarCafetera(m1);
    a1.agregarCafe(m1);
    
    
    }
}

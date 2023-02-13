
package ejerciciosnormales4;

import EntidadesRectangulo.Entidad;
import ServicioRecatngulo.Servicios;


public class Rectangulo {

   
    public static void main(String[] args) {
        
        Servicios R = new Servicios ();
        Entidad a1 = R.crearRecangulo();
        R.SuperficieR(a1);
        R.perimetroR(a1);
        
        
    }
    
}

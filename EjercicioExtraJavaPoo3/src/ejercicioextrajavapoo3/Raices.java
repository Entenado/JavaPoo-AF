
package ejercicioextrajavapoo3;

import EntidadesRaices.EntidadesRaices;
import SciosRaices.SciosRaices;

/**
 *
 */
public class Raices {

    
    public static void main(String[] args) {
       SciosRaices a1 = new SciosRaices();
        EntidadesRaices A = a1.getDiscriminante();
        a1.calcular(A);
    }
    
}

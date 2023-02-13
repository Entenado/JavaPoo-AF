
package ejerciciosnormales8;

import EntidadCadena.EntidadCadena;
import ServicioCadena.ServicioCadena;

/**
 * @author Abel
 */
public class Cadena {

  
    public static void main(String[] args) {
        
        ServicioCadena A = new ServicioCadena();
        EntidadCadena a1 = A.crearFrase();
        System.out.println("La frase invertida es: ");
        A.mostrarVocales(a1);
        A.invertirFrase(a1);
        A.vecesRepetida(a1);
        A.compararLongitud(a1);
        A.unirFrases(a1);
        A.reemplazar(a1);
        A.contiene(a1);
                
    }
    
}

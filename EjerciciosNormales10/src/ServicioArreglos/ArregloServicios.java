
package ServicioArreglos;

import ArreglosEntidades.EntidadesArreglo;
import java.util.Arrays;


/**
 * @author Abel
 */
public class ArregloServicios {
    
  public EntidadesArreglo inicio (EntidadesArreglo a1){
      
      for (int i = 0; i < a1.getCadena1().length; i++) {
        a1.setCadena1((int) (10 * Math.random()), i);
        }
        System.out.println(Arrays.toString(a1.getCadena1()));
        return a1;
      }
  
  public EntidadesArreglo Ordenar (EntidadesArreglo a1){
  
      Arrays.sort(a1.getCadena1());
      System.out.println("lo numeros ordenanos son: " + Arrays.toString(a1.getCadena1()));
      for (int i = 0; i < 10; i++) {
          a1.setCadena2(a1.getCadena1()[i], i);
      }
      Arrays.fill(a1.getCadena2(), 10, 20, (int)(double)0.5);
      System.out.println("Los numeros ordenados son: " + Arrays.toString(a1.getCadena2() ));
      return a1;
  }
      
  }
  
 
  



package ScioVentas;

import EntidadesVenta.EntidadesVenta;
import java.util.Scanner;


public class ScioVentas {
    Scanner leer = new Scanner(System.in);
    public EntidadesVenta ventas(){
        EntidadesVenta a1 = new EntidadesVenta();
    
        double ventas[] = new double[30];
        System.out.println("Se ingresan las 30 ventas del mes");
        int contador = 0;
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("venta"+ (i+1));
            ventas[i]=(10000*Math.random());
            System.out.println(ventas[i]);
            if (ventas[i]>2000) {
                contador = contador +1;
            }
        }
        
        /*int k = 0;
        int total = 0;
        while(<30){
        
             if (ventas[k]>=2000) {
                 System.out.println(ventas[k]);
                 total++;
            }
             k++;
        }   */
        System.out.println("El total de ventas mayores a 2000 es: " +  contador);
        return a1;
    }
}

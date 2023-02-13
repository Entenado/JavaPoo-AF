
package Servicioyt2;

import Entidadyt2.Entidadyt2;
import java.util.Scanner;



public class Servicioyt2 {
    
    
    public Entidadyt2 Decuento(){
        
    Entidadyt2 a1 = new Entidadyt2();
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese las piezas de pan que desea comprar");
   a1.setCantidadCompra(leer.nextInt());
   a1.setPrecioTotal(5);
   double precioFinal = 0;
        if (a1.getCantidadCompra()<=50) {
            precioFinal=(a1.getCantidadCompra()*a1.getPrecioTotal());
            System.out.println("el total es de: " + precioFinal);
        }else if(a1.getCantidadCompra()>=50 && a1.getCantidadCompra()<=100){
            a1.setPrecioTotal(a1.getPrecioTotal()-0.5);
             precioFinal=(a1.getCantidadCompra()*a1.getPrecioTotal());
              System.out.println("el total es de: " + precioFinal);
        }else if (a1.getCantidadCompra()>100){
        
            a1.setPrecioTotal(a1.getPrecioTotal()-1);
            precioFinal=(a1.getCantidadCompra()*a1.getPrecioTotal());
              System.out.println("el total es de: " + precioFinal);
        }
        
        return a1;
    }
}

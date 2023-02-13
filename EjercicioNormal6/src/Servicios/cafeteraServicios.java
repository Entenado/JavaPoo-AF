
package Servicios;

import Entidad.EntidadesCafetera;
import java.util.Scanner;

/**
 * @author Abel
 */
public class cafeteraServicios {
    Scanner leer = new Scanner(System.in);
    
    int llenar;
    int llenarTaza;
    int faltante;
    int sobrante;
    int vaciar;
    int agregar;
    public EntidadesCafetera Cafe(){
    
        EntidadesCafetera a1 = new EntidadesCafetera();
        System.out.println("Ingrese la capacidad máxima de la cafetera");
        a1.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la cantidad actual de café");
        a1.setCantidadActual(leer.nextInt());
        System.out.println("Ingrese el tamaño de la taza a llenar");
        a1.setTamañoTaza(leer.nextInt());
        System.out.println("Ingrese la cantidad de café que quiera reponer a la cafetera");
        a1.setAgregar(leer.nextInt());
        return a1;
    }
    
    public void llenarCafetera(EntidadesCafetera a1){
    
       
       llenar = a1.getCapacidadMaxima();
       
       System.out.println("al llenar la cafetera, los ml de la cafetera son:" + llenar );
       
    }
    
    public void servirTaza(EntidadesCafetera a1){
    
        System.out.println("El tamaño de la taza es: " + a1.getTamañoTaza());
        if (a1.getCantidadActual() == a1.getTamañoTaza()) {
            System.out.println("La taza se llenó por completo y en la cafetera no hay mas café");
        }else if(a1.getTamañoTaza()> a1.getCantidadActual()){
            faltante = a1.getTamañoTaza() - a1.getCantidadActual();
            System.out.println("Faltarán para llenar la taza :" + faltante);
            
        }else{
             sobrante = llenar - a1.getTamañoTaza();
             System.out.println("Se llenó la taza, lo que queda en la cafetera es: " + sobrante);
            
        }
    
    }
    
    public void vaciarCafetera(EntidadesCafetera a1){
             vaciar = a1.getCantidadActual();
             vaciar = 0;
       
            System.out.println("Lo que queda en la cafetera al vaciarla es: " + vaciar);
    }
    
    public void agregarCafe(EntidadesCafetera a1){
    
           
           agregar = vaciar + a1.getAgregar();
           System.out.println("Luego de agregar la cantidad de café indicada, en la cafetera hay: " + agregar);
           
    }
    
}

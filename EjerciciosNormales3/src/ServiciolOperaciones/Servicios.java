
package ServiciolOperaciones;

import EntidadesOperaciones.Operaciones;
import java.util.Scanner;


public class Servicios {
    int resultado;
    int resultado1;
    int resultado2;
    int resultado3;
    
    Scanner leer = new Scanner(System.in);
    
    public Operaciones crearOperacion(){
    
        Operaciones n1 = new Operaciones();
        System.out.println("Ingrese el numero 1 y el numero 2");
        n1.setNumero1(leer.nextInt());
        n1.setNumero2(leer.nextInt());
        
      //Operaciones n2 = new Operaciones();
      //System.out.println("Ingrese el numero 2");
      //n2.setNumero2(leer.nextInt());
        
        return n1;
    }
    
    public void sumar(Operaciones n1){
    
        resultado = n1.getNumero1() + n1.getNumero2();
        System.out.println("La suma de los numeros es: " + resultado);
        
    }
    
     public void restar(Operaciones n1){
    
        resultado1 = n1.getNumero1() - n1.getNumero2();
        System.out.println("La resta de los numeros es: " + resultado1);
  
     }
     
     public void multiplicar(Operaciones n1){
    
        resultado2 = n1.getNumero1() * n1.getNumero2();
        if(n1.getNumero2()== 0){
            System.out.println("Al multiplicar por cero, se retornará cero");
        }
        System.out.println("La rmultiplicacion de los numeros es: " + resultado2);
  
     }
     
     public void dividir(Operaciones n1){
    
        resultado3 = n1.getNumero1() / n1.getNumero2();
        System.out.println("La division de los numeros es: " + resultado3);
  
     }
        
}

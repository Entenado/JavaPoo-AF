
package ServicioRecatngulo;

import EntidadesRectangulo.Entidad;
import java.util.Scanner;


public class Servicios {
    
    int Superficie;
    int Perimetro;
    
    Scanner leer = new Scanner (System.in);
    
    public Entidad crearRecangulo(){
    
        Entidad a1 = new Entidad();
        System.out.println("Ingrese base e ingrese altura del rectangulo");
        a1.setBase(leer.nextInt());
        a1.setAltura(leer.nextInt());
        
        return a1;
    }
    
     public void SuperficieR(Entidad a1){
    
        Superficie = (a1.getBase() * a1.getAltura());
        System.out.println("La superficie del rectángulo es de: " + Superficie);
        
    }
    
    
    
    public void perimetroR(Entidad a1){
    
        Perimetro = (a1.getBase() + a1.getAltura()) * 2 ;
        System.out.println("El perimetro del rectángulo es de: " + Perimetro);
        
             System.out.println();
          for (int b = 1; b <= a1.getAltura(); b++){
           
              
              for(int c = 1; c <=(a1.getBase()); c++){
                  if (b == 1 || b == a1.getAltura() || c == 1 || c == a1.getBase()) {
                      
                       System.out.print(" * ");
                       
                  }else{
                      System.out.print("   ");
                  }
  
                 
              }
              System.out.println();
          }
          
       
    }
    
    }
     
    


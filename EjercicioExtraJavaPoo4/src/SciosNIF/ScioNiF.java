
package SciosNIF;

import EntidadesNIF.EntidadesNIF;
import java.util.Arrays;
import java.util.Scanner;


public class ScioNiF {
    Scanner leer = new Scanner(System.in);
    
    public EntidadesNIF crearNif(){
    EntidadesNIF a1 = new EntidadesNIF();
  
        System.out.println("Ingrese el numero del DNI");
        a1.setDNI(leer.nextInt());
       int num = 0 ;
        
         char ite[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
//    char arreglo2[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
    
   
       // num = (int)a1.getDNI()%23;
        char letra = ite[(int) a1.getDNI()%23];
        
        System.out.println(a1.getDNI() + " _ " + letra);
        return a1;
    }
    
    
    
    
}

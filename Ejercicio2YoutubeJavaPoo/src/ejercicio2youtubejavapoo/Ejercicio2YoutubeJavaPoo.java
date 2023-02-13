
package ejercicio2youtubejavapoo;

import Entidadyt2.Entidadyt2;
import Servicioyt2.Servicioyt2;
import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio2YoutubeJavaPoo {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
      int a[]= new int[5];
      int b[]= new int [5];
     // int c []= new int [10];
      
        for (int i = 0; i < a.length; i++) {
            a[i] = leer.nextInt();
            b[i] = leer.nextInt();
            
        }
     System.out.println("los numeros son: "+ Arrays.toString(a)  );
      System.out.println("los numeros son: "+ Arrays.toString(b)  );
        
      
      int c[] = {a[0],b[0],a[1],b[1],a[2],b[2],a[3],b[3],a[4],b[4]};
        System.out.println("la mezcla re arrays será: " + Arrays.toString(c));
    }  
    }
    

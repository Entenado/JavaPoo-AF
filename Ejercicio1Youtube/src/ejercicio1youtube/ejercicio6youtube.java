
package ejercicio1youtube;

import java.util.Arrays;
import java.util.Scanner;


public class ejercicio6youtube {
     public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
         int arreglo []= new int[10];
         int num = 0;
         
         for (int i = 0; i < arreglo.length; i++) {
             arreglo[i]=leer.nextInt();
             System.out.println("los numeros son: " + Arrays.toString(arreglo));
         }
         Arrays.sort(arreglo);
         System.out.println("los numeros son: " + Arrays.toString(arreglo));
        
     }
}


package ej4youtube;


public class metodoStaticRandom {

    public static void main(String[] args) {
      
        int A[]= new int[10];
        //int min=A[0];
        
        
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random()*100);
            System.out.println("Los numeros random son: " + A[i]);
            
           // if (A[i]<min) 
             // min = A[i] ; 
            
        }
        int min=A[0];
        
        for (int i = 1; i < A.length; i++) {
            if (A[i]<min) 
              min = A[i] ;
        }
        System.out.println("El minimo será: " + min);
       
    }
    
}

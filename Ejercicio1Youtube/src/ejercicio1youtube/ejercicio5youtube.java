
package ejercicio1youtube;

import java.util.Scanner;


public class ejercicio5youtube {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int matriz [][]=new int [3] [3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Introduce un numero ");
                int num=leer.nextInt();
                matriz[i][j]= num;
                
            }
        }
        System.out.println("Imprimir numeros de la matriz");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                
                System.out.print(matriz[i][j] + "\t");
            }
        }
        
        
    }
    
    
}

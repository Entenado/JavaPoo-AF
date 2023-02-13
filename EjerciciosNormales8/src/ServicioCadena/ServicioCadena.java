
package ServicioCadena;

import EntidadCadena.EntidadCadena;
import java.util.Scanner;

/**
 * @author Abel
 */
public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in);
 
    public EntidadCadena crearFrase(){
    
        EntidadCadena a1 = new EntidadCadena();
        System.out.println("Ingrese frase");
        a1.setFrase(leer.nextLine().toLowerCase());
        
        a1.setLongitudFrase(a1.getFrase().length());
        System.out.println("La longitud de la frase es: " + a1.getLongitudFrase());
        return a1;
    }
    
    public int mostrarVocales(EntidadCadena a1){
     int contador = 0;
                
        for (int i = 0; i < a1.longitudFrase; i++) {
            if ((a1.getFrase().charAt(i) == 'a') || (a1.getFrase().charAt(i) == 'e') || (a1.getFrase().charAt(i) == 'i') || (a1.getFrase().charAt(i) == 'o') || (a1.getFrase().charAt(i) == 'u')) {
                
                contador = contador + 1;
                
            }
           
        }
        System.out.println("La cantidad de vocales son: " + contador);
        return contador;
    }
    
    public void invertirFrase (EntidadCadena a1){
    
        
        for (int i = a1.longitudFrase; i > 0; i--) {
            
            System.out.print(a1.getFrase().charAt(i-1));
            
        }
    
        System.out.println("  ");
    }
    
    public void vecesRepetida (EntidadCadena a1){
    char caracter;
    
        System.out.println("Seleccione caracter");
        int contador = 0;
        caracter = leer.next().toLowerCase().charAt(0);
        for (int i = 0; i < a1.getLongitudFrase(); i++) {
            if (a1.getFrase().charAt(i) == caracter) {
                 contador = contador +1;
            }
           
            
        }
        System.out.println("La cantidad de caracteres que se repiten son: " + contador);
    }
    
    public void compararLongitud (EntidadCadena a1){
    
        System.out.println("Ingrese la nueva frase");
        leer.nextLine();
        String nuevaFrase = leer.nextLine();
        int Longitud = 0;
        
        
        Longitud = nuevaFrase.length();
        
        if (a1.getLongitudFrase() == Longitud) {
            System.out.println("Las longitudes son iguales");
        }else{
            System.out.println("Las longitudes no son iguales");
        }
       
    }
    
    public void unirFrases (EntidadCadena a1){
    
        System.out.println("Ingrese una nueva frase");
        String nuevaFrase = leer.nextLine();
        
        System.out.println("Las frases son: " + a1.getFrase().concat( " " +  nuevaFrase) );
    }
    
    public void reemplazar (EntidadCadena a1){
    
        System.out.println("Ingrese el caracter con el cual quiere que se reemplace 'a'" );
        char nuevoCaracter = leer.next().charAt(0);
        
        System.out.println("La frase será: " + a1.getFrase().replace('a', nuevoCaracter));
        
    }
       
    public boolean contiene (EntidadCadena a1){
        boolean letraR;
        System.out.println("Ingrese una letra con la cual desea comprobar si la misma está contenida en la frase");
        String letra = leer.next();
    
        
        if (a1.getFrase().contains(letra)) {
            letraR = true;
            System.out.println("La frase contiene la letra " + letraR);
        }else{
        letraR = false;
            System.out.println("La frase no contiene la letra " + letraR);
        }
        return letraR;
    }
        
   
  
}

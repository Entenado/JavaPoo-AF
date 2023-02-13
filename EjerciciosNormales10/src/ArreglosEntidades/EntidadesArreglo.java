
package ArreglosEntidades;

/**
 * @author Abel
 */
public class EntidadesArreglo {
    
 public int[] cadena1 = new int[50];
 public int[] cadena2 = new int[20];
    

    public EntidadesArreglo() {
    }

    public int[] getCadena1() {
        return cadena1;
    }
    
     public int[] getCadena2() {
        return cadena2;
    }

    public void setCadena1(int[] cadena1) {
        this.cadena1 = cadena1;
        
    }

    public void setCadena2(int[] cadena2) {
        this.cadena2 = cadena2;
    }

    public void setCadena1(int cadena1, int i){
    
        this.cadena1[i]= cadena1;
    }
    
     public void setCadena2(int cadena2, int i){
    
        this.cadena2[i]= cadena2;
    }
   

    

    
 
 
}

   

    

    
    
    
    


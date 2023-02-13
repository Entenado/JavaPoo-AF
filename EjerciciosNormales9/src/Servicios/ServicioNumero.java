
package Servicios;

import EntidadesEj9.Matematicas;


/**
 * @author Abel
 */
public class ServicioNumero {
    
   public Matematicas generarNumeros(){
   
       Matematicas a1 = new Matematicas();
       a1.setNumero1((float) (Math.random())*10);
       a1.setNumero2((float) (Math.random())*10);
       
       return a1;
   }
   
  
   public float devolverMayor(Matematicas a1){     
       return  Math.max(a1.getNumero1(), a1.getNumero2());
        
    }
   
   public int calcularPotencia(Matematicas a1){             
        return  (int) Math.pow(Math.round(devolverMayor(a1)),Math.round(Math.min(a1.getNumero1(), a1.getNumero2())));
    }
   
   public float calcularRaiz(Matematicas a1){
   
       return (float) Math.sqrt(Math.abs(Math.min(a1.getNumero1(), a1.getNumero2())));
   }
   
   
           
}

   
   
      
       
   
    



package ejerciciosnormales7;

import EntidadPersona.EntidadPersona;
import PersonaServicio.ServicioP;

/**
 * @author Abel
 */
public class Persona {

   
  
    public static void main(String[] args) {
        double porcentajeEdad;
        double porcentajeIMC;
        
          ServicioP A = new ServicioP();
          
        EntidadPersona a1 = A.crearPersona();
        A.sexoPersona(a1);
        A.calcularIMC(a1);
        A.mayorDeEdad(a1);
        
        
        EntidadPersona a2 = A.crearPersona();
        A.sexoPersona(a2);
        A.calcularIMC(a2);
        A.mayorDeEdad(a2);
        
        
        EntidadPersona a3 = A.crearPersona();
        A.sexoPersona(a3);
        A.calcularIMC(a3);
        A.mayorDeEdad(a3);
        
        EntidadPersona a4 = A.crearPersona();
        A.sexoPersona(a4);
        A.calcularIMC(a4);
        A.mayorDeEdad(a4);
        System.out.println("   ");
        System.out.println("---------------------------------------");  
        porcentajeIMC = (A.calcularIMC(a1) + A.calcularIMC(a2)+ A.calcularIMC(a3) + A.calcularIMC(a4))/4;
                
        System.out.println("El porcentaje de IMC es: " + porcentajeIMC);
        if (porcentajeIMC < 20) {
             System.out.println("El promedio de las personas están por debajo de su peso ideal, dando un resultado: " + porcentajeIMC);
        }else if (porcentajeIMC <= 25 && porcentajeIMC >= 20){
             System.out.println("El promedio de las personas están en su peso ideal, dando por resultado: " + porcentajeIMC);
        }else {
             System.out.println("El promedio de las personas tienen sobrepeso, dando por resultado: " + porcentajeIMC);
        }
        System.out.println("  ");
        System.out.println(" ------------------- ");
 //Falta retornar un booleano en el caso de que la persona sea mayor de edad, se podría hacer un contador por cada "true" 
 // que retorne el méotdo, voy a pasar al siguiente ejercicio, recordar modificar eso en este.
        porcentajeEdad = (A.mayorDeEdad(a1) + A.mayorDeEdad(a2) + A.mayorDeEdad(a3) + A.mayorDeEdad(a4))/4;
             
        if (porcentajeEdad >= 18) {
            System.out.println("El promedio de las personas son mayores de edad" + porcentajeEdad );
        }else{
            System.out.println("El promedio de las personas son menores de edad" + porcentajeEdad );
        }

        
           }

    }  
        
        
        
        
        
        
        
     
      
        
        
   
    
  

 

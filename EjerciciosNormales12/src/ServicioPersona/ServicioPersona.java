
package ServicioPersona;

import EntidadPersona.EntidadPersona;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Abel
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    public EntidadPersona crearPersona(){
    
        EntidadPersona a1 = new EntidadPersona();
        System.out.println("Ingrese nombre de la persona");
        a1.setNombre(leer.nextLine());
        System.out.println("Ingrese el año en que nacio");
        a1.setAño(leer.nextInt());
        System.out.println("Ingrese el mes en que nació");
        a1.setMes(leer.nextInt());
        System.out.println("Ingrese el dia en que nació");
        a1.setDia(leer.nextInt());
        Date fecha = new Date(a1.getAño()-1900, a1.getMes()-1, a1.getDia());
        
        a1.setNacimiento(fecha);
        
        return a1;
    }
    
    public void calcularEdad(EntidadPersona a1){
    
        LocalDate fechaActual = LocalDate.now();
        
        LocalDate edadP = LocalDate.of(a1.getAño(), a1.getMes(), a1.getDia());
        
        System.out.println("Segunda fecha es: " + fechaActual);
        
        System.out.println( );
        
        Period periodo = Period.between(edadP, fechaActual);
        System.out.println(" La persona tiene " +  periodo.getYears() + " años " + periodo.getMonths() + " meses " + periodo.getDays() + " dias " );
       
    }
    
    public boolean menorQue(EntidadPersona a1){
        System.out.println("Ingrese en que año nació la nueva persona, para definir si es mayor o menor a la persona ingresada por parámetro");
       int nuevoAño = leer.nextInt();
       boolean menorQue = false;
        
        
        
        if (nuevoAño > a1.getAño()) {
            System.out.println("La edad de la persona ingresada es menor a la ingresada por parametro");
            menorQue = true;
        }else if(nuevoAño < a1.getAño()){
            System.out.println("La edad de la persona ingresada es mayor a la ingresada por paramatro");
            menorQue = false;
        }
        
        /*LocalDate persona = LocalDate.of(a1.getAño(), a1.getMes(), a1.getDia());
        LocalDate nuevaPersona = LocalDate.of(nuevoAño-1900, nuevoMes-1, nuevoDia);
     
        Period periodoo = Period.between(nuevaPersona, persona);
        System.out.println(periodoo.toString());*/
        return menorQue;
    }
    
    public void mostrarPersona (EntidadPersona a1){
        System.out.println("---------------------------------");
        System.out.println(  );
        System.out.println("el nombre es: " + a1.getNombre());
        System.out.println("la fecha de nacimiento es: " + a1.getNacimiento());
    }
    
}


package ejerciciosnormales11;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;



/**
 * @author Abel
 */
public class Fecha {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el año");
        int year= leer.nextInt();
        System.out.println("Ingrese el mes");
        int month= leer.nextInt();
        System.out.println("Ingrese el dia");
        int day= leer.nextInt();
        
       LocalDate primerFecha = LocalDate.of(year,month, day);
       LocalDate fechaActual = LocalDate.now();
       
        System.out.println("Primera fecha: " + primerFecha);
        System.out.println("Fecha Actual: "  + fechaActual);
        
        System.out.println();
        
        Period periodo = Period.between(primerFecha, fechaActual);
        System.out.println("Diferencia en años: " + periodo.getYears());
        System.out.println("Diferencia en meses: " + periodo.getMonths());
        System.out.println("Diferencia en dias: " + periodo.getDays());
    }
}

    


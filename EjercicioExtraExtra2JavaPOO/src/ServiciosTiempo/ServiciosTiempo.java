
package ServiciosTiempo;

import EntidadesTiempo.EntidadesTiempo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class ServiciosTiempo {
    Scanner leer = new Scanner(System.in);
    
   public  EntidadesTiempo imprimirHoraCompleta (){
      EntidadesTiempo a1 = new EntidadesTiempo();
        System.out.println("La hora es:");
        a1.setHoras(leer.nextInt());
        System.out.println("Ingrese minutos");
        a1.setMinutos(leer.nextInt());
        System.out.println("Ingrese segundos");
        a1.setSegundos(leer.nextInt());
       // LocalDateTime hoy = LocalDateTime.parse("2022-02-06M 19: 39: 45.184");
       
        LocalDateTime hoy = LocalDateTime.of(2023, Month.FEBRUARY, 1, a1.getHoras(), a1.getMinutos(), a1.getSegundos());
        
        
        System.out.println("la hora es: " + hoy.getHour() + ":" + hoy.getMinute() + ":" + hoy.getSecond());
        return a1;
    }
}

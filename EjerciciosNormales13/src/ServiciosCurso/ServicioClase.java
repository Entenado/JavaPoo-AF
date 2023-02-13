
package ServiciosCurso;

import EntidadesCurso.EntidadesCurso;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Abel
 */
public class ServicioClase {
    Scanner leer = new Scanner(System.in);
    
    
    public void cargarAlumnos(){
   
      
    
     String alumnos[] = {leer.next(),leer.next(), leer.next(),leer.next(),leer.next()};   
     
        
       /* for (int i = 0; i < a1.getAlumnos().length; i++) {
            a1.setAlumnos(alumnos);
        }
        System.out.println(Arrays.toString(a1.getAlumnos()));
     return a1;*/
       for(String i: alumnos){
           System.out.println("Nombre del alumno : " + i);
       }
       
    }
    
    public EntidadesCurso crearCurso (){
      // EntidadesCurso a2
      EntidadesCurso a2 = new EntidadesCurso();
       System.out.println("Ingrese el nombre del curso ");
       a2.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia del curso");
        a2.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        a2.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora del curso");
        a2.setPrecioPorHora(leer.nextInt());
        System.out.println("Ingrese el turno ");
        a2.setTurno(leer.next());
        System.out.println("Ingrese lo alumnos que asisten al curso");
        cargarAlumnos();
        
        return a2;
    }
    
    public void calcularGananciaSemanal(EntidadesCurso a2){
    
        int gananciaSemanal = (a2.getCantidadHorasPorDia()*a2.getPrecioPorHora()*5*a2.getCantidadDiasPorSemana());
        System.out.println("El curso se llama: " + a2.getNombreCurso() + " Posee una cantidad de horas por dia de: " + a2.getCantidadHorasPorDia() + " Se cursa " + a2.getCantidadDiasPorSemana() + " por semana " + " El turno es " + a2.getTurno() );    
        System.out.println("la ganancia semanal será" + gananciaSemanal);
    }
    
}

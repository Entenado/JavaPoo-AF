
package PersonaServicio;

import EntidadPersona.EntidadPersona;
import java.util.Scanner;

/**
 * @author Abel
 */
public class ServicioP {
    Scanner leer = new Scanner(System.in);
    //String sexoP;
    Double calculo;
    int IMC;
    
    
    public EntidadPersona crearPersona(){
    
        EntidadPersona a1 = new EntidadPersona();
        System.out.println("Ingrese el nombre de la persona");
        a1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        a1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona, h si es hombre, m si es mujer, o para otro");
        a1.setSexo(leer.next());
        System.out.println("Ingrese el peso de la persona");
        a1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        a1.setAltura(leer.nextDouble());
        
        return a1;
    }

    public void sexoPersona(EntidadPersona a1) {
        if ("m".equals(a1.getSexo()) || "h".equals(a1.getSexo()) || "o".equals(a1.getSexo())) {
            System.out.println("La persona es de genero: " + a1.getSexo());
        }else{
            System.out.println("Genero incorrecto");
        }
    }
    
    public Double calcularIMC(EntidadPersona a1){
    
        calculo = a1.getPeso() / Math.pow(a1.getAltura(), 2);
        if (calculo < 20) {
            IMC = -1;
            System.out.println(" La persona está por debajo de su peso ideal ");
        }else if(calculo <= 25 && calculo >= 20){
            IMC = 0;
            System.out.println(" La persona está en su peso ideal ");
        }else {
            IMC = +1;
            System.out.println(" La persona tiene sobrepeso " );
    }
        return calculo;
    }
    
    public int mayorDeEdad(EntidadPersona a1){
        int edad = 0;
        if (a1.getEdad() >= 18) {
            edad = a1.getEdad();
            System.out.println(" La persona es mayor de edad ");
                 
        }else {
            edad = a1.getEdad();
            System.out.println(" La persona es menor de edad ");
        }
        return edad;
    }

  
}

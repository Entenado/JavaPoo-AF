
package ejerciciosnormales9;

import EntidadesEj9.Matematicas;
import Servicios.ServicioNumero;

public class Matematica {

  
    public static void main(String[] args) {
       
        Matematicas numero = new Matematicas();
        ServicioNumero aux = new ServicioNumero();
        numero.setNumero1((float) Math.random()*10);
        numero.setNumero2((float)Math.random()*10);
        System.out.println(numero.getNumero1());
        System.out.println(numero.getNumero2());
        
        System.out.println(aux.devolverMayor(numero));
        System.out.println(aux.calcularPotencia(numero));
        System.out.println(aux.calcularRaiz(numero));
    }
    
}

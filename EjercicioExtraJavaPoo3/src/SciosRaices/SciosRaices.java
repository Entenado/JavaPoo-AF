
package SciosRaices;

import EntidadesRaices.EntidadesRaices;
import java.util.Scanner;

/**
 * @author Abel
 */
public class SciosRaices {
    Scanner leer = new Scanner(System.in);
    public EntidadesRaices getDiscriminante (){
    EntidadesRaices a1 = new EntidadesRaices();
        System.out.println("Ingrese a");
        a1.setA(leer.nextInt());
        System.out.println("Ingrese b");
        a1.setB(leer.nextInt());
        System.out.println("Ingrese c");
        a1.setC(leer.nextInt());
        //double discrim = (Math.pow(a1.getB(), 2)) - (4 * a1.getA() * a1.getC());

        return a1;
    }
    
    public boolean tieneRaices(EntidadesRaices a1){
    boolean retorno = false; 
        double raices1 = -a1.getB() + Math.sqrt((Math.pow(a1.getB(), 2)) - (4 * a1.getA() * a1.getC()))/(2*a1.getA());
        double raices2 = -a1.getB() - Math.sqrt((Math.pow(a1.getB(), 2)) - (4 * a1.getA() * a1.getC()))/(2*a1.getA());
        
        if (raices1 > 0 && raices2 > 0) {
            System.out.println("primera raiz" + raices1 + "segunda raiz" + raices2);
             retorno = true;
        }else { retorno = false; }
        return retorno;
    }
    
    public boolean  tieneRaiz (EntidadesRaices a1){
        boolean retorno2 = false;
    
    double raices1 = -a1.getB() + Math.sqrt((Math.pow(a1.getB(), 2)) - (4 * a1.getA() * a1.getC()))/(2*a1.getA());
    double raices2 = -a1.getB() - Math.sqrt((Math.pow(a1.getB(), 2)) - (4 * a1.getA() * a1.getC()))/(2*a1.getA());
        if (raices1 > 0 || raices2 > 0) {
            retorno2 = true;
            System.out.println("primera raiz" + raices1 + "segunda raiz" + raices2);
    }else{retorno2 = false;}
     return retorno2;   
    }
    
    public void obtenerRaices (EntidadesRaices a1){
    
        tieneRaices(a1);
        
    }
    
    public void obtenerRaiz (EntidadesRaices a1){
    
        tieneRaiz(a1);
    }
    
    public void calcular (EntidadesRaices a1){
    
        if (tieneRaices(a1) == true) {
            obtenerRaices(a1);
        }else if(tieneRaiz(a1) == true){
        
            obtenerRaiz(a1);
        }else{System.out.println("No se encontraron raices en los metodos");}
        
    }
    
    
}

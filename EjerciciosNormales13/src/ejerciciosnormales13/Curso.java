
package ejerciciosnormales13;

import EntidadesCurso.EntidadesCurso;
import ServiciosCurso.ServicioClase;

/**
 * @author Abel
 */
public class Curso {

    
    public static void main(String[] args) {
        ServicioClase A = new ServicioClase();
        EntidadesCurso a1 = A.crearCurso();
        A.calcularGananciaSemanal(a1);
        
        
        /*EntidadesCurso a1 = new EntidadesCurso();
        ServicioClase A = new ServicioClase();
        A.crearCurso(a1);
        A.calcularGananciaSemanal(a1);*/
        
        
    }
    
}

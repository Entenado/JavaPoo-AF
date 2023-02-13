
package ServicioTelefono;

import Movil.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Abel
 */
public class ServicioTelefono {
    Scanner leer = new Scanner(System.in);
    public Movil cargarCelular(){
    
        Movil a1 = new Movil();
        System.out.println("Ingrese la marca del celular");
        a1.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo del celular");
        a1.setModelo(leer.next().charAt(0));
        System.out.println("Ingrese la capacidad de la memoria Ram");
        a1.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el precio del producto");
        a1.setPrecio(leer.nextInt());
        System.out.println("Inrese el almacenamiento del movil");
        a1.setAlmacenamiento(leer.nextInt());
        
        return a1;
    }
    
    public void ingresarCodigo (Movil a1){
      Movil a2 = new Movil();
     
      int Cod[] = {leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextInt()} ; 
        for (int i = 0; i < a2.getCodigo().length; i++) {
            a2.setCodigo(Cod);
        }
        
        System.out.println(Arrays.toString(a2.getCodigo()));
        // pasar por un do while y luego usar un integer para que no tome 2 valores a la hora de completar el codigo;
    }
    
    
}

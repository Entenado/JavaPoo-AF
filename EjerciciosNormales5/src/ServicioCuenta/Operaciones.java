
package ServicioCuenta;

import EntidadesCuenta.DatosCuenta;
import java.util.Scanner;


public class Operaciones {
   
    int totalIngreso;
    int porcentaje;
    int totalRetiro;
    int totalExtraccionR;
    
    Scanner leer = new Scanner(System.in);
    
    public DatosCuenta crearCuenta(){
    
        DatosCuenta a1 = new DatosCuenta();
        System.out.println("Ingrese el dni del usuario: ");
        a1.setDniCliente(leer.nextInt());
        System.out.println("Ingrese el numero de cuenta del usuario");
        a1.setNumeroDeCuenta(leer.nextInt());
        System.out.println("Ingrese el saldo del cliente");
        a1.setSaldoActual(leer.nextInt());
        System.out.println("Ingrese el monto a ingresar");
        a1.setIngreso(leer.nextInt());
        System.out.println("Ingrese el monto a retirar");
        a1.setRetiro(leer.nextInt());
        
        return a1;
    }
    
    
    public void Ingresar(DatosCuenta a1){
    
       totalIngreso = a1.getSaldoActual() + a1.getIngreso();
        
        System.out.println("Al ingresar el monto seleccionado, su monto acutal es de: " + totalIngreso);
        
    }
    
     public void retirar(DatosCuenta a1){
        
        System.out.println("Ingrese el monto a retirar");
        
        if (a1.getRetiro()<totalIngreso) {
            
            totalRetiro = totalIngreso - a1.getRetiro();
             System.out.println("Su monto actual es de: " + totalRetiro );
        }else{
             System.out.println("No posee fondos suficientes");
             System.out.println("Su saldo actual es 0");
          
            
        }       
        
    }

    
    public void extraccionRapida (DatosCuenta a1){
    
        System.out.println("A continuación retirará el 20% de su saldo actual");
        porcentaje = (int) (totalRetiro * 0.2); 
        
        totalExtraccionR = totalRetiro - porcentaje;
        
        System.out.println("Su saldo actual es de: " + totalExtraccionR);
    }
    
    public void consultarSaldo (DatosCuenta a1){
    
        System.out.println("El saldo disponible en su cuenta es de: " + totalExtraccionR);
    }
    public void consultarDatos (DatosCuenta a1){
    
        System.out.println("Los datos de la cuenta son los siguientes:" + "Dni del cliente: " + a1.getDniCliente() + " " + "Numero de cuenta: " +a1.getNumeroDeCuenta() + " " + "Saldo actual: " +  totalExtraccionR);
    }
}


package ejerciciosnormales5;


import EntidadesCuenta.DatosCuenta;
import ServicioCuenta.Operaciones;


public class CuentaBancaria {

    public static void main(String[] args) {
       
        
        Operaciones A = new Operaciones();
        DatosCuenta a1 = A.crearCuenta();
        A.Ingresar(a1);
        A.retirar(a1);
        A.extraccionRapida(a1);
        A.consultarSaldo(a1);
        A.consultarDatos(a1);
    }
    
}

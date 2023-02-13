
package EntidadesCuenta;

public class DatosCuenta {
    
    int numeroDeCuenta;
    long dniCliente; 
    int saldoActual;
    private int ingreso;
    private int retiro;  
    int totalIngreso;
    int totalRetiro;
    


    public DatosCuenta() {
        
    }

    public DatosCuenta(int numeroDeCuenta, long dniCliente, int saldoActual, int ingreso, int retiro, int totalIngreso, int totalRetiro) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.ingreso = ingreso;
        this.retiro = retiro;
        this.totalIngreso = totalIngreso;
        this.totalRetiro = totalRetiro;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getTotalIngreso() {
        
        return totalIngreso;
    }

    public void setTotalIngreso(int totalIngreso) {
        
        this.totalIngreso = totalIngreso;
    }

    public int getTotalRetiro() {
        return totalRetiro;
    }

    public void setTotalRetiro(int totalRetiro) {
        this.totalRetiro = totalRetiro;
    }

    @Override
    public String toString() {
        return "DatosCuenta{" + "numeroDeCuenta=" + numeroDeCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + ", ingreso=" + ingreso + ", retiro=" + retiro + ", totalIngreso=" + totalIngreso + ", totalRetiro=" + totalRetiro + '}';
    }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

   


package EntidadesVenta;


public class EntidadesVenta {
    
    double ventasMes[];
    int ventasMayores;

    public EntidadesVenta() {
    }

    public EntidadesVenta(double[] ventasMes, int ventasMayores) {
        this.ventasMes = ventasMes;
        this.ventasMayores = ventasMayores;
    }

    public double[] getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double[] ventasMes) {
        this.ventasMes = ventasMes;
    }

    public int getVentasMayores() {
        return ventasMayores;
    }

    public void setVentasMayores(int ventasMayores) {
        this.ventasMayores = ventasMayores;
    }
    
}

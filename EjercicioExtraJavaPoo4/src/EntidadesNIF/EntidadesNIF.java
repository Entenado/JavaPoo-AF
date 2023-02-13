
package EntidadesNIF;

public class EntidadesNIF {
    
    int DNI;
    char letra[];

    public EntidadesNIF() {
    }

    public EntidadesNIF(int DNI, char[] letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char[] getLetra() {
        return letra;
    }

    public void setLetra(char[] letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "EntidadesNIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }

    
}

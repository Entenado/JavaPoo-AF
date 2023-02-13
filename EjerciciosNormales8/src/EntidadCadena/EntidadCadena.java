
package EntidadCadena;

/**
 * @author Abel
 */
public class EntidadCadena {
     
    public String frase;
    public int longitudFrase;

    public EntidadCadena() {
    }

    public EntidadCadena(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    @Override
    public String toString() {
        return "EntidadCadena{" + "frase=" + frase + ", longitudFrase=" + longitudFrase + '}';
    }
    
    
    
}

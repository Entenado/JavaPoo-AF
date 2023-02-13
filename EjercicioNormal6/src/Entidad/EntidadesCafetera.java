
package Entidad;

/**
 * @author Abel
 */
public class EntidadesCafetera {
    
    int capacidadMaxima;
    int cantidadActual;
    int tamañoTaza;
    int agregar;

    public EntidadesCafetera() {
    }

    public EntidadesCafetera(int capacidadMaxima, int cantidadActual, int tamañoTaza, int agregar) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.tamañoTaza = tamañoTaza;
        this.agregar = agregar;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getTamañoTaza() {
        return tamañoTaza;
    }

    public void setTamañoTaza(int tamañoTaza) {
        this.tamañoTaza = tamañoTaza;
    }

    public int getAgregar() {
        return agregar;
    }

    public void setAgregar(int agregar) {
        this.agregar = agregar;
    }

    @Override
    public String toString() {
        return "EntidadesCafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + ", tama\u00f1oTaza=" + tamañoTaza + ", agregar=" + agregar + '}';
    }

    

  
    
    
}

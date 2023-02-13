
package EntidadPersona;

import java.util.Date;

/**
 * @author Abel
 */
public class EntidadPersona {
    
    String nombre;
    Date nacimiento;
    int año;
    int mes;
    int dia;

    public EntidadPersona() {
    }

    public EntidadPersona(String nombre, Date nacimiento, int año, int mes, int dia) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "EntidadPersona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", a\u00f1o=" + año + ", mes=" + mes + ", dia=" + dia + '}';
    }

    
    
    
}

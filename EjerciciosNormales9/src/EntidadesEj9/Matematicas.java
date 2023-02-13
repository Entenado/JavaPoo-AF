
package EntidadesEj9;


public class Matematicas {
    
     float numero1;
     float numero2;
    
     
    
  //  numero.setNum1((float) Math.random() * 10);

    public Matematicas() {
    }

    public Matematicas(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematicas{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

  
    

    
}

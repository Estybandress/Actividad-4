
package Resultado;


public class Experiencia extends TestClasificacion {
    
    private double cantidadaños = 0;
    private double puntaje = 0;

    public Experiencia() {
    
    System.out.println("1 opcione -  6 meses a 1 años");
    System.out.println("2 opcione -  1 años a 2 años");
    System.out.println("3 opcione -  2 años en adelante");
        
    } 
     public void porcentaje (double opcion ){
         
         if (opcion == 1 ){
         puntaje = 3.5 * 0.33;
         }
         if (opcion == 2 ){
         puntaje = 6.5 *0.33;
         }
          if (opcion == 3 ){
         puntaje = 9.5 *0.33;
         }
    
    }

    public double getCantidadaños() {
        return cantidadaños;
    }

    public void setCantidadaños(double cantidadaños) {
        this.cantidadaños = cantidadaños;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
     
}

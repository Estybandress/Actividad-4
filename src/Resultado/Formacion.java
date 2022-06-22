

package Resultado;

 class Formacion extends TestClasificacion{
     
     private double bachillerato = 0;
     private double  pregrado = 0;
     private double posgradosymaestrias = 0;
     private double puntaje = 0;

    public Formacion() {
        System.out.println("Opciones 1 Bachiller");
        System.out.println("Opciones 2 Pregrado");
        System.out.println("Opciones 3 Posgrado y Maestria");
        
    } 
     public void porcentaje (int opcion ){
         
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

    public double getBachillerato() {
        return bachillerato;
    }

    public void setBachillerato(double bachillerato) {
        this.bachillerato = bachillerato;
    }

    public double getPregrado() {
        return pregrado;
    }

    public void setPregrado(double pregrado) {
        this.pregrado = pregrado;
    }

    public double getPosgradosymaestrias() {
        return posgradosymaestrias;
    }

    public void setPosgradosymaestrias(double posgradosymaestrias) {
        this.posgradosymaestrias = posgradosymaestrias;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
 
    
}

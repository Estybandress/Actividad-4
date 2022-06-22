
package Resultado;


public class RelacionesSociales extends TestClasificacion {
    
    private double bienestarEmocional = 0;
    private double Interview = 0;
    private double puntaje= 0;    
   

    public RelacionesSociales() {
    
        
        
    }
    
    public void porcentaje (double saludmental, double entrevista ){
        
        if (saludmental>=1&&saludmental<=3 ){
            setBienestarEmocional(3);
         }
        if (saludmental>=4&&saludmental<=7 ){
           setBienestarEmocional(6);
           
         }
        if (saludmental>=8&&saludmental<=10 ){
          setBienestarEmocional(9);
           
         }
         
         if (entrevista>=1&&entrevista<=3){
             setInterview(3);
           }
         if (entrevista>=4&&entrevista<=7){
           setInterview(6);
           }
         if (entrevista>=8&&entrevista<=10){
          setInterview(9);
           }
         
        setPuntaje((getBienestarEmocional()+getInterview())*0.33);
    }

    public double getBienestarEmocional() {
        return bienestarEmocional;
    }

    public void setBienestarEmocional(double bienestarEmocional) {
        this.bienestarEmocional = bienestarEmocional;
    }

    public double getInterview() {
        return Interview;
    }

    public void setInterview(double Interview) {
        this.Interview = Interview;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }


    
    
    
}

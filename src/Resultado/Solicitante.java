
package Resultado;


public class  Solicitante extends TestClasificacion{
  
    
    private String nombresolicitante; 
    private int numeIden; 

    public Solicitante(String nombresolicitante, int numeIden) {
        this.nombresolicitante = nombresolicitante;
        this.numeIden = numeIden;
 
    
    }

    public String getNombresolicitante() {
        return nombresolicitante;
    }

    public void setNombresolicitante(String nombresolicitante) {
        this.nombresolicitante = nombresolicitante;
    }

    public int getNumeIden() {
        return numeIden;
    }

    public void setNumeIden(int numeIden) {
        this.numeIden = numeIden;
    }
    
    
    
}
   


package Resultado;

import java.util.Scanner;


public class Resultado {

       public static void porcentajeTotal (double Formacion, double RelacionesSociales, double Experiencia){
         double porcentajeTotal = 0;

         porcentajeTotal = Formacion+RelacionesSociales+Experiencia;
         System.out.println("La suma de promedio es "+ (porcentajeTotal*100)/10);  

         
         }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
       Solicitante miempleado = new Solicitante("Esteban Duran",1015431883);       
       System.out.println("El nombre y apellido  del solicitante a la vacante  es: "+miempleado.getNombresolicitante());
       System.out.println("Numero de indentidad :"+miempleado.getNumeIden());
        System.out.println(" ");
        
        
        System.out.println("Selecciones una opcion para calcular su Formacion");
        Formacion miformacion = new Formacion();
        int opcionformacion = 0;
        opcionformacion = sc.nextInt();
        miformacion.porcentaje(opcionformacion);
        System.out.println("Valores de puntajes en Formacion");
        System.out.println("Bachiller 3.5");
        System.out.println("Pregrado 6.5");
        System.out.println("Postgrado y maestries 9.5");
        System.out.println("Su puntaje y promedio de 33.3 es  "+miformacion.getPuntaje());
        
        System.out.println("");
        
        System.out.println("Ingresa valores para calcular sus Relaciones Sociales ");
        RelacionesSociales mirelayentre = new RelacionesSociales();
        
        System.out.println("Ingrese puntaje Salud Mental");
        double saludm = sc.nextDouble();
        System.out.println("Ingrese puntaje Entrevista");
        double interview = sc.nextDouble();
        mirelayentre.porcentaje(saludm, interview);
        System.out.println("la suma de  salud emocional y entrevista "+mirelayentre.getPuntaje());
       
        
        
        System.out.println(" ");
        System.out.println("Selecciones una opciones para calcular su experiencia");
        Experiencia miexpericia = new Experiencia();
        int miexperiencia = sc.nextInt();
        miexpericia.porcentaje(miexperiencia);
        System.out.println("Valores de puntajes en Experiencia");
        System.out.println("6 meses a 1 años  3.5");
        System.out.println("1 años a 2 años   6.5");
        System.out.println("2 años en adelante 9.5");
        System.out.println("Su puntaje y promedio de 33.3 es  "+miexpericia.getPuntaje());
        
        System.out.println(" ");
        System.out.println("Su promedio totalizado es ");
        porcentajeTotal(miformacion.getPuntaje(),mirelayentre.getPuntaje(),miexpericia.getPuntaje());
        System.out.println("Si su porcentaje es menor o igual a 50 no esta calificado para la vacante");
        System.out.println("Si su porcentaje es mayor o igual a 51 esta calificado para la vacante");
        System.out.println("Esta calificado para la vacante");
        
     }

         
}

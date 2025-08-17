// ANALISIS
/* Entradas: 1, el radio proporcionado por el usuario. (double)
* Salidas: 2. Una, el area del circulo dado ese radio (double), la otra
* el volumen de la esfera que tenga el radio del usuario.
* Ejemplo: Si radio = 3, area = 28,28 aprox. volumen = 113,098 aprox.
*/ 

import java.util.Scanner;
import java.lang.Math.*;


public class Circulosyesferas {
    
 public static void main(String[] args) {

    Scanner escaner = new Scanner(System.in);

        double radio, volumen, area;

         System.out.println("Hola!! Cuál es el radio del círculo? ");
        radio = escaner.nextDouble();
        escaner.nextLine();

        area = calcular_area(radio);
        System.out.println("El area de la esfera es: " + area);

        volumen = calcularVolumen(radio);
        System.out.println("El volumen de la esfera es: " + volumen);


     }

     /**
      * Descripcion: El metodo calcularVolumen toda un radio r y aplica la formula
      * del volumen de esfera para calcular dicho volumen.
      * @param double r El radio proporcionado por el usuario.
      * @return double El volumen de la esfera con radio r.
      */
     public static double calcularVolumen(double r) {
         return Math.pow(r, 3) * (4.0/3.0) * Math.PI;
     }

     /**
      * Descripción: El método calcular_area toma un radio r y aplica la fórmula del aréa de una esfera
      *para calcular dicha área.
      * @param doble r es el radio proporcionado por el usuario
      * @return double el area de la esfera con radio r.
      */
      
    public static double calcular_area(double r) {
         return Math.PI * r * r;
     }
    
    

}
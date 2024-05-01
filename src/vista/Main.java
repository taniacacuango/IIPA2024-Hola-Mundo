/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

/**
 *
 * @author PC14
 */
 
public class Main {
   
    public static void main(String[] args) {

         int numeroParejas = 5; // Número inicial de parejas de conejos
         int numeroCrias = 3; // Número de crías por pareja por año
         double tMortalidad = 0.20; // Tasa de mortalidad anual (20%)
         int tiempo = 5; // Período de tiempo en años
         int poblacionAnual = 0; // Población de conejos al inicio de cada año
         int poblacionFinal = 0; // Población final de conejos al final del período de tiempo
         
         for (int i = 1; i <= tiempo; i++) {
             poblacionAnual += numeroParejas * 2; // Cada pareja tiene 2 conejos
             int muertes = (int) (poblacionAnual * tMortalidad); // Calcular el número de conejos que mueren
             poblacionAnual -= muertes; // Actualizar la población restando las muertes
             int nuevasCrias = poblacionAnual * numeroCrias; // Calcular el número de nuevas crías
             poblacionAnual += nuevasCrias; // Añadir las nuevas crías a la población
             
             System.out.println("Año " + i + ": Población = " + poblacionAnual + ", Muertes = " + muertes);
         }
         
         poblacionFinal = poblacionAnual;
         System.out.println("Población final después de " + tiempo + " años: " + poblacionFinal);
    }
}


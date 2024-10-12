package es.ies.puerto;
/**
 * @autor alexfdb
 * @version 1.0.0
 * Un Jedi está entrenando para aprender a usar la Fuerza. El nivel de poder de 
 * la Fuerza se calcula sumando dos valores de concentración. Si la suma de los 
 * niveles de concentración es mayor a 100, el programa debe indicar que el Jedi 
 * ha alcanzado un nivel avanzado, mostrando como salida "Nivel avanzado". Si es 
 * menor o igual a 100, el programa debe indicar que el Jedi aún es un aprendiz, 
 * mostrando en la salida "Nivel de aprendiz".
 */
import java.util.Scanner;
public class Ejercicio1 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Introduzca el primer nivel de concentración");
       float concentracion1 = escaner.nextFloat();
       System.out.println("Introduzca el segundo nivel de concentración");
       float concentracion2 = escaner.nextFloat();
       float sumaConcentracion = (concentracion1 +  concentracion2);
       boolean nivelAvanzado = (sumaConcentracion > 100);
       if (nivelAvanzado) {
        System.out.println("Nivel avanzado");
       } else {
        System.out.println("Nivel de aprendiz");
       }
       escaner.close();
    }      
}
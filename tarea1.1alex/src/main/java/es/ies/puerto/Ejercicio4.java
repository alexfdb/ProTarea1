package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara una variable de tipo boolean que indique si una persona es mayor de edad 
 * (true o false). Asigna un valor y muéstralo por pantalla.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        byte edad = 29;
        boolean mayorEdad = (edad>=18);
        System.out.println("¿La edad ingresada declara que es mayor de edad? " + mayorEdad + ".");
    }
}
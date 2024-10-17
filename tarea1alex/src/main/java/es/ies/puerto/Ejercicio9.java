package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara una variable int que contenga tu año de nacimiento. Calcula y muestra 
 * tu edad actual utilizando otra variable para el año actual.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int anioNacimiento = 1994;
        int anioActual = 2024;
        int edad = (anioActual - anioNacimiento);
        System.out.println("El año de nacimiento es el " + anioNacimiento + " y el año actual es el " + anioActual + ".");
        System.out.println("Por lo tanto la edad es de " + edad + " años." );
    }
}
package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara una variable double para almacenar la raíz cuadrada de 2. Usa la 
 * clase Math para calcular el valor y muéstralo por pantalla.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        double numero1 = 2d;
        double raizCuadradaNumero1 = Math.sqrt(numero1);
        System.out.println("La raiz cuadrada de " + numero1 + " es " + raizCuadradaNumero1 + ".");
    }
}
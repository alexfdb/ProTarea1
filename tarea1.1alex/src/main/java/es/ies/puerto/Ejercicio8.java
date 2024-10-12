package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara una variable de tipo float para almacenar el valor de pi (3.1416) y 
 * otra para el radio de un círculo. Calcula el área del círculo usando la 
 * fórmula Área = pi * radio * radio.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        float pi = 3.1416f;
        float radioCirculo = 22.54f;
        float areaCirculo = pi * (radioCirculo * radioCirculo);
        System.out.println("El radio del circulo es de " + radioCirculo + " metros.");
        System.out.println("El area del circulo es de " + areaCirculo + " metros cuadrados.");
    }
}
package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un programa que convierta grados Celsius a Fahrenheit. Usa variables 
 * de tipo double para los cálculos.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        float gradosCelsius = 22.5f;
        float gradosFahrenheit = 0.0f;
        float conversionCelsiusFahrenheit = (gradosCelsius * 9.0f / 5.0f) + 32.0f;
        gradosFahrenheit = conversionCelsiusFahrenheit;
        System.out.println("La temperatura es " + gradosCelsius + " grados Celsius.");
        System.out.println("La temperatura tras la conversión es " + gradosFahrenheit + " grados Fahrenheit.");
    }
}
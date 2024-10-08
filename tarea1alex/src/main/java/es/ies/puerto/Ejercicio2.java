package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Declara dos variables de tipo double para almacenar el precio de dos productos. 
 * Calcula la suma y muestra el resultado.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        double precioArticulo1 = 2.53d;
        double precioArticulo2 = 7.89d;
        double sumaPrecioArticulos = (precioArticulo1 + precioArticulo2);
        System.out.println("El precio del articulo 1 es de " + precioArticulo1 + " $.");
        System.out.println("El precio del articulo 2 es de " + precioArticulo2 + " $.");
        System.out.println("La suma de los precios de los articulos da " + sumaPrecioArticulos + " $.");
    }
}
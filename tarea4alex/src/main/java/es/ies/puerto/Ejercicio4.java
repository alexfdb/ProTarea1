package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un cazador de tesoros ha recolectado una lista de objetos en el orden en que 
 * los encontró. Escribe un programa que invierta el orden de los objetos en su 
 * inventario para mostrar el último objeto primero.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String[] inventario = {"Espada", "Escudo", "Poción", "Gema", "Mapa"};
        for (int i = 0; i < inventario.length / 2; i++) {
                String intercambio = inventario[i];
                inventario[i] = inventario[inventario.length - 1 -i];
                inventario[inventario.length - 1 -i] = intercambio;
        }
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i]);
        }
    }
}
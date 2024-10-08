package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En la Tierra Media, varios objetos mágicos han sido encontrados, pero los héroes están buscando 
 * específicamente el "Anillo Único". Escribe un programa que determine si el Anillo Único está en el 
 * inventario.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        String[] objetosMagicos = {"Palantir", "Anillo Único", "Espada de Elendil", "Capa Élfica"};
        for (int i = 0; i < objetosMagicos.length; i++) {
            boolean objetoBuscado = (objetosMagicos[i].equals("Anillo Único"));
            if (objetoBuscado) {
                System.out.println("Anillo Único se encuentra en el inventario.");
            }
        }
    }
}
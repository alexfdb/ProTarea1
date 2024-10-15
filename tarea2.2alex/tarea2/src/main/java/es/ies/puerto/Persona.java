package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.1.0
 * Ejercicio 1 Crea una clase llamada Persona con los atributos nombre y edad. 
 * Define un constructor que inicialice estos valores.
 * Ejercicio 2 Modifica la clase Persona para que tenga métodos getter y setter 
 * para el atributo edad.
 */

public class Persona {

    private String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    //Validaciones
    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
    }

    private void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Setters
    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        validarEdad(edad);
        this.edad = edad;
    }

    //toString
    public String toString(){
        return "Persona{" + 
                "Nombre: " + nombre +
                "/ Edad: " + edad +
                '}';
    }
}
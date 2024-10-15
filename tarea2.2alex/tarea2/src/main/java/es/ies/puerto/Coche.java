package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.1.0
 * Ejercicio 3 Crea una clase Coche con los atributos marca, modelo y año. 
 * Incluye un constructor y métodos getter y setter para cada atributo.
 * Ejercicio 4 Modifica la clase Coche para que el setter del atributo año solo 
 * permita valores mayores o iguales a 1886 (año de creación del primer coche).
 */

public class Coche {

    private static final int ANIO_MINIMO = 1886;
    private static final int ANIO_MAXIMO = 2024;
    
    private String marca;
    private String modelo;
    private int anio;

    //Constructor

    public Coche(String marca, String modelo, int anio) {
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
    }

    //Validaciones
    private void validarMarca(String marca){
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser nulo o vacío");
        }
    }

    private void validarModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
        throw new IllegalArgumentException("El modelo no puede ser nulo o vacío");
        }
    }

    private void validarAnio(int anio) {
        if (anio < 1886 || anio > 2024) {
            throw new IllegalArgumentException("El año debe estar entre " + ANIO_MINIMO + " y " + ANIO_MAXIMO + ".");
        }
    }

    //Getters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAnio(){
        return anio;
    }

    //Setters
    public void setMarca(String marca){
        validarMarca(marca);
        this.marca = marca;
    }

    public void setModelo(String modelo){
        validarModelo(modelo);
        this.modelo = modelo;
    }

    public void setAnio(int anio){
        validarAnio(anio);
        this.anio = anio;
    }

    //Para imprimir información

    public String toString() {
        return "Coche{" +
               "Marca: " + marca +
               "/ Modelo: " + modelo +
               "/ Anio: " + anio +
               '}';
    }
}
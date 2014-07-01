/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_list;

/**
 *
 * @author kenan
 */
public class Alumnos {
    
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String apellido;

    /**
     * Get the value of apellido
     *
     * @return the value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    private int edad;

    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    private double promedio;

    /**
     * Get the value of promedio
     *
     * @return the value of promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Set the value of promedio
     *
     * @param promedio new value of promedio
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumnos(String nombre, String apellido, int edad, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
    }

}

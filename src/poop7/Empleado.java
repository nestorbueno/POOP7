/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * La clase Empleado modela a un trabajador con atributos básicos como nombre,
 * número de empleado y sueldo. Proporciona métodos para acceder y modificar 
 * estos atributos, además de un método para aumentar el sueldo en función de 
 * un porcentaje.
 * 
 * @author poo03alu36
 */
public class Empleado {
    private String nombre;        // Nombre del empleado
    private int numEmpleado;      // Número único de identificación del empleado
    private float sueldo;         // Sueldo del empleado

    /**
     * Constructor vacío que permite crear un empleado sin inicializar atributos.
     */
    public Empleado() {
    }

    /**
     * Constructor que inicializa un empleado con un nombre, número de empleado y sueldo.
     * 
     * @param nombre El nombre del empleado.
     * @param numEmpleado El número de identificación del empleado.
     * @param sueldo El sueldo del empleado.
     */
    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de empleado.
     * 
     * @return El número de identificación del empleado.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Establece el número de empleado.
     * 
     * @param numEmpleado El nuevo número de identificación del empleado.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Obtiene el sueldo del empleado.
     * 
     * @return El sueldo del empleado.
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado.
     * 
     * @param sueldo El nuevo sueldo del empleado.
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Aumenta el sueldo del empleado en función de un porcentaje de aumento.
     * El aumento se realiza sobre el sueldo actual.
     * 
     * @param porcentajeDeAumento El porcentaje por el cual se incrementará el sueldo.
     */
    public void aumentarSueldo(int porcentajeDeAumento){
        sueldo += sueldo * porcentajeDeAumento / 100;
        System.out.println("");  
    }

    /**
     * Devuelve una representación en cadena del objeto Empleado, incluyendo el 
     * nombre, número de empleado y sueldo.
     * 
     * @return Una cadena que representa el estado del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}


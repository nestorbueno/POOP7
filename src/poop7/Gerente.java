/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * La clase Gerente extiende la clase Empleado y añade un atributo adicional llamado
 * presupuesto, que representa el monto que el gerente puede manejar. Esta clase
 * hereda todos los atributos y métodos de la clase Empleado.
 * 
 * @author poo03alu36
 */
public class Gerente extends Empleado {
    private float presupuesto; // Presupuesto que maneja el gerente

    /**
     * Constructor vacío que permite crear un gerente sin inicializar atributos.
     */
    public Gerente() {
    }

    /**
     * Constructor que inicializa un gerente con un presupuesto, nombre, número de empleado y sueldo.
     * 
     * @param presupuesto El presupuesto que maneja el gerente.
     * @param nombre El nombre del gerente.
     * @param numEmpleado El número de empleado del gerente.
     * @param sueldo El sueldo del gerente.
     */
    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo); // Llama al constructor de la clase Empleado
        this.presupuesto = presupuesto;
    }

    /**
     * Obtiene el presupuesto del gerente.
     * 
     * @return El presupuesto actual del gerente.
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto del gerente.
     * 
     * @param presupuesto El nuevo presupuesto que se asignará al gerente.
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Asigna un presupuesto al gerente.
     * 
     * @param presupuesto El presupuesto que se asignará al gerente.
     * @return El presupuesto asignado.
     */
    public float asignarPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    /**
     * Devuelve una representación en cadena del objeto Gerente, incluyendo
     * los atributos heredados de Empleado y el presupuesto del gerente.
     * 
     * @return Una cadena que representa el estado del gerente.
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}

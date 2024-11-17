package zoologico;

/**
 * Clase que modela un Pastor Alemán, heredando de la clase Perro.
 * Esta clase representa un perro de trabajo que típicamente tiene un entrenamiento de guardia 
 * o trabaja con la policía. Se asume que todos los pastores alemanes son perros de guardia.
 */
public class PastorAleman extends Perro {
    private int nivelObediencia;
    private String tipoEntrenamiento;

    /**
     * Constructor vacío para crear un Pastor Alemán sin inicializar atributos.
     */
    public PastorAleman() {
    }

    /**
     * Constructor que inicializa los atributos de un Pastor Alemán.
     * 
     * @param nombre El nombre del Pastor Alemán.
     * @param edad La edad del Pastor Alemán.
     * @param especie La especie (Perro).
     * @param peso El peso del Pastor Alemán.
     * @param habitat El hábitat del Pastor Alemán.
     * @param raza La raza del perro (Pastor Alemán).
     * @param colorPelaje El color del pelaje.
     * @param nivelObediencia El nivel de obediencia del Pastor Alemán.
     * @param tipoEntrenamiento Tipo de entrenamiento que recibió el Pastor Alemán.
     */
    public PastorAleman(String nombre, int edad, String especie, float peso, String habitat, String raza, String colorPelaje, int nivelObediencia, String tipoEntrenamiento) {
        super(nombre, edad, especie, peso, habitat, raza, colorPelaje, false, 100, false);  // Llama al constructor de la superclase (Perro)
        this.nivelObediencia = nivelObediencia;
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    /**
     * Obtiene el nivel de obediencia del Pastor Alemán.
     * 
     * @return El nivel de obediencia (por ejemplo, en una escala del 1 al 100).
     */
    public int getNivelObediencia() {
        return nivelObediencia;
    }

    /**
     * Establece el nivel de obediencia del Pastor Alemán.
     * 
     * @param nivelObediencia El nuevo nivel de obediencia del perro.
     */
    public void setNivelObediencia(int nivelObediencia) {
        this.nivelObediencia = nivelObediencia;
    }

    /**
     * Obtiene el tipo de entrenamiento que ha recibido el Pastor Alemán.
     * 
     * @return El tipo de entrenamiento (por ejemplo, "Guardia", "Rescate").
     */
    public String getTipoEntrenamiento() {
        return tipoEntrenamiento;
    }

    /**
     * Establece el tipo de entrenamiento que ha recibido el Pastor Alemán.
     * 
     * @param tipoEntrenamiento El nuevo tipo de entrenamiento del perro.
     */
    public void setTipoEntrenamiento(String tipoEntrenamiento) {
        this.tipoEntrenamiento = tipoEntrenamiento;
    }

    /**
     * Método que simula que el Pastor Alemán está vigilando una zona.
     * Se asume que todos los pastores alemanes son perros de guardia.
     */
    public void vigilar() {
        System.out.println(getNombre() + " está vigilando la zona.");
    }

    /**
     * Método que simula que el Pastor Alemán obedece una orden.
     * Se imprime el nivel de obediencia al obedecer una orden.
     */
    public void obedecerOrden() {
        System.out.println(getNombre() + " obedece una orden con un nivel de obediencia de " + nivelObediencia + ".");
    }

    /**
     * Método que simula que el Pastor Alemán está entrenando en su tipo de entrenamiento.
     */
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando en " + tipoEntrenamiento + ".");
    }

    /**
     * Método que simula que el Pastor Alemán está trabajando con la policía.
     * Este método asume que todos los Pastores Alemanes trabajan con la policía, 
     * por lo que no requiere validación con if-else.
     */
    public void trabajarConPolicia() {
        System.out.println(getNombre() + " está trabajando con la policía.");
    }

    /**
     * Método que simula que el Pastor Alemán está ladrando fuertemente.
     */
    public void ladrarFuerte() {
        System.out.println(getNombre() + " está ladrando fuertemente.");
    }

    /**
     * Método toString que devuelve una representación en cadena de los atributos del Pastor Alemán.
     * 
     * @return Una cadena con los valores de los atributos heredados y propios de Pastor Alemán.
     */
    @Override
    public String toString() {
        return super.toString() + " PastorAleman{" + "nivelObediencia=" + nivelObediencia + ", tipoEntrenamiento=" + tipoEntrenamiento + '}';
    }
}

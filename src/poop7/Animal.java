package zoologico;

/**
 * Clase base que modela un Animal con atributos y métodos generales.
 * Esta clase contiene atributos comunes a todos los animales, como nombre, edad, especie, peso y hábitat.
 * También proporciona métodos para acceder y modificar estos atributos.
 */
public class Animal {
    private String nombre;
    private int edad;
    private String especie;
    private float peso;
    private String habitat;

    /**
     * Constructor vacío para crear un animal sin inicializar atributos.
     */
    public Animal() {
    }

    /**
     * Constructor que inicializa todos los atributos del animal.
     * 
     * @param nombre El nombre del animal.
     * @param edad La edad del animal.
     * @param especie La especie a la que pertenece el animal.
     * @param peso El peso del animal.
     * @param habitat El hábitat natural del animal.
     */
    public Animal(String nombre, int edad, String especie, float peso, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.habitat = habitat;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del animal.
     * 
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del animal.
     * 
     * @return La edad del animal.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del animal.
     * 
     * @param edad La nueva edad del animal.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la especie del animal.
     * 
     * @return La especie del animal.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie del animal.
     * 
     * @param especie La nueva especie del animal.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene el peso del animal.
     * 
     * @return El peso del animal.
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Establece el peso del animal.
     * 
     * @param peso El nuevo peso del animal.
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el hábitat del animal.
     * 
     * @return El hábitat del animal.
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Establece el hábitat del animal.
     * 
     * @param habitat El nuevo hábitat del animal.
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * Método toString que devuelve una representación en cadena del animal.
     * Incluye los atributos del animal: nombre, edad, especie, peso y hábitat.
     * 
     * @return Una cadena que describe el estado del animal.
     */
    @Override
    public String toString() {
        return "Animal(" + "nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", peso=" + peso + ", habitat=" + habitat + ')';
    }
}

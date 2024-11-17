package zoologico;

/**
 * Clase que modela un Perro, heredando de la clase Animal.
 * Los perros pueden tener características como raza, color de pelaje, si son de caza, nivel de energía
 * y si están entrenados. Esta clase también incluye métodos específicos de comportamiento para los perros.
 */
public class Perro extends Animal {
    private String raza;
    private String colorPelaje;
    private boolean esDeCaza;
    private int nivelEnergia;
    private boolean esEntrenado;

    /**
     * Constructor vacío para crear un perro sin inicializar atributos.
     */
    public Perro() {
    }

    /**
     * Constructor que inicializa los atributos de un perro.
     * 
     * @param nombre El nombre del perro.
     * @param edad La edad del perro.
     * @param especie La especie del perro.
     * @param peso El peso del perro.
     * @param habitat El hábitat del perro.
     * @param raza La raza del perro.
     * @param colorPelaje El color del pelaje del perro.
     * @param esDeCaza Indica si el perro es de caza.
     * @param nivelEnergia El nivel de energía del perro.
     * @param esEntrenado Indica si el perro está entrenado.
     */
    public Perro(String nombre, int edad, String especie, float peso, String habitat, String raza, String colorPelaje, boolean esDeCaza, int nivelEnergia, boolean esEntrenado) {
        super(nombre, edad, especie, peso, habitat);  // Llama al constructor de la superclase (Animal)
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.esDeCaza = esDeCaza;
        this.nivelEnergia = nivelEnergia;
        this.esEntrenado = esEntrenado;
    }

    /**
     * Obtiene la raza del perro.
     * 
     * @return La raza del perro.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza del perro.
     * 
     * @param raza La nueva raza del perro.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtiene el color del pelaje del perro.
     * 
     * @return El color del pelaje del perro.
     */
    public String getColorPelaje() {
        return colorPelaje;
    }

    /**
     * Establece el color del pelaje del perro.
     * 
     * @param colorPelaje El nuevo color del pelaje del perro.
     */
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    /**
     * Verifica si el perro es de caza.
     * 
     * @return true si el perro es de caza, false en caso contrario.
     */
    public boolean isEsDeCaza() {
        return esDeCaza;
    }

    /**
     * Establece si el perro es de caza.
     * 
     * @param esDeCaza true si el perro es de caza, false en caso contrario.
     */
    public void setEsDeCaza(boolean esDeCaza) {
        this.esDeCaza = esDeCaza;
    }

    /**
     * Obtiene el nivel de energía del perro.
     * 
     * @return El nivel de energía del perro (por ejemplo, en una escala de 1 a 100).
     */
    public int getNivelEnergia() {
        return nivelEnergia;
    }

    /**
     * Establece el nivel de energía del perro.
     * 
     * @param nivelEnergia El nuevo nivel de energía del perro.
     */
    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    /**
     * Verifica si el perro está entrenado.
     * 
     * @return true si el perro está entrenado, false en caso contrario.
     */
    public boolean isEsEntrenado() {
        return esEntrenado;
    }

    /**
     * Establece si el perro está entrenado.
     * 
     * @param esEntrenado true si el perro está entrenado, false en caso contrario.
     */
    public void setEsEntrenado(boolean esEntrenado) {
        this.esEntrenado = esEntrenado;
    }

    // Métodos específicos de la clase Perro.

    /**
     * Método que simula que el perro está ladrando.
     * Muestra un mensaje indicando que el perro está ladrando.
     */
    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

    /**
     * Método que simula que el perro está corriendo.
     * Muestra un mensaje indicando que el perro está corriendo.
     */
    public void correr() {
        System.out.println(getNombre() + " está corriendo.");
    }

    /**
     * Método que simula que el perro está buscando algo.
     * Muestra un mensaje indicando que el perro está buscando.
     */
    public void buscar() {
        System.out.println(getNombre() + " está buscando.");
    }

    /**
     * Método que simula que el perro está olfateando.
     * Muestra un mensaje indicando que el perro está olfateando.
     */
    public void olfatear() {
        System.out.println(getNombre() + " está olfateando.");
    }

    /**
     * Método que simula que el perro está saltando.
     * Muestra un mensaje indicando que el perro está saltando.
     */
    public void saltar() {
        System.out.println(getNombre() + " está saltando.");
    }

    /**
     * Método toString que devuelve una representación en cadena del perro.
     * Incluye los atributos heredados de Animal y los específicos de Perro.
     * 
     * @return Una cadena con los atributos del perro.
     */
    @Override
    public String toString() {
        return super.toString() + " Perro{" + "raza=" + raza + ", colorPelaje=" + colorPelaje + ", esDeCaza=" + esDeCaza + ", nivelEnergia=" + nivelEnergia + ", esEntrenado=" + esEntrenado + '}';
    }
}

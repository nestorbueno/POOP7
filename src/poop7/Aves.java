package zoologico;

/**
 * Clase que modela un Ave, heredando de la clase Animal.
 * Se añaden atributos y métodos específicos para las aves, como el tipo de plumaje,
 * si pueden volar, el número de huevos que pueden poner, entre otros.
 */
public class Aves extends Animal {
    private String tipoPlumaje;
    private boolean vuela;
    private int numeroHuevos;
    private String colorPlumas;
    private int velocidadVuelo;

    /**
     * Constructor vacío para crear un ave sin inicializar atributos.
     */
    public Aves() {
    }

    /**
     * Constructor que inicializa los atributos de un ave.
     * 
     * @param nombre El nombre del ave.
     * @param edad La edad del ave.
     * @param especie La especie del ave.
     * @param peso El peso del ave.
     * @param habitat El hábitat del ave.
     * @param tipoPlumaje El tipo de plumaje del ave.
     * @param vuela Indica si el ave puede volar.
     * @param numeroHuevos Número de huevos que puede poner el ave.
     * @param colorPlumas El color de las plumas del ave.
     * @param velocidadVuelo La velocidad de vuelo del ave (en km/h).
     */
    public Aves(String nombre, int edad, String especie, float peso, String habitat, String tipoPlumaje, boolean vuela, int numeroHuevos, String colorPlumas, int velocidadVuelo) {
        super(nombre, edad, especie, peso, habitat);  // Llama al constructor de la clase padre (Animal)
        this.tipoPlumaje = tipoPlumaje;
        this.vuela = vuela;
        this.numeroHuevos = numeroHuevos;
        this.colorPlumas = colorPlumas;
        this.velocidadVuelo = velocidadVuelo;
    }

    /**
     * Obtiene el tipo de plumaje del ave.
     * 
     * @return El tipo de plumaje del ave.
     */
    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    /**
     * Establece el tipo de plumaje del ave.
     * 
     * @param tipoPlumaje El nuevo tipo de plumaje del ave.
     */
    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    /**
     * Verifica si el ave puede volar.
     * 
     * @return true si el ave puede volar, false en caso contrario.
     */
    public boolean isVuela() {
        return vuela;
    }

    /**
     * Establece si el ave puede volar.
     * 
     * @param vuela true si el ave puede volar, false en caso contrario.
     */
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    /**
     * Obtiene el número de huevos que el ave puede poner.
     * 
     * @return El número de huevos que puede poner el ave.
     */
    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    /**
     * Establece el número de huevos que el ave puede poner.
     * 
     * @param numeroHuevos El nuevo número de huevos que puede poner el ave.
     */
    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    /**
     * Obtiene el color de las plumas del ave.
     * 
     * @return El color de las plumas del ave.
     */
    public String getColorPlumas() {
        return colorPlumas;
    }

    /**
     * Establece el color de las plumas del ave.
     * 
     * @param colorPlumas El nuevo color de las plumas del ave.
     */
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    /**
     * Obtiene la velocidad de vuelo del ave (en km/h).
     * 
     * @return La velocidad de vuelo del ave en km/h.
     */
    public int getVelocidadVuelo() {
        return velocidadVuelo;
    }

    /**
     * Establece la velocidad de vuelo del ave (en km/h).
     * 
     * @param velocidadVuelo La nueva velocidad de vuelo del ave.
     */
    public void setVelocidadVuelo(int velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    /**
     * Método que simula el vuelo del ave.
     * Si el ave puede volar, muestra un mensaje indicando la velocidad de vuelo.
     * Si el ave no puede volar, indica que no puede volar.
     */
    public void volar() {
        if (vuela) {
            System.out.println(getNombre() + " está volando a una velocidad de " + velocidadVuelo + " km/h.");
        } else {
            System.out.println(getNombre() + " no puede volar.");
        }
    }

    /**
     * Método que simula que el ave ha puesto huevos.
     * Muestra un mensaje indicando cuántos huevos ha puesto el ave.
     */
    public void ponerHuevos() {
        System.out.println(getNombre() + " ha puesto " + numeroHuevos + " huevos.");
    }

    /**
     * Método que simula que el ave está cantando.
     * Muestra un mensaje indicando que el ave está cantando.
     */
    public void cantar() {
        System.out.println(getNombre() + " está cantando.");
    }

    /**
     * Método que simula que el ave está limpiando sus plumas.
     * Muestra un mensaje indicando que el ave está limpiando sus plumas.
     */
    public void limpiarPlumas() {
        System.out.println(getNombre() + " está limpiando sus plumas.");
    }

    /**
     * Método que simula que el ave está planeando en el aire.
     * Si el ave puede volar, muestra un mensaje indicando que está planeando.
     * Si no puede volar, muestra un mensaje indicando que no puede planear.
     */
    public void planear() {
        if (vuela) {
            System.out.println(getNombre() + " está planeando en el aire.");
        } else {
            System.out.println(getNombre() + " no puede planear.");
        }
    }

    /**
     * Método toString que devuelve una representación en cadena del ave.
     * Incluye los atributos heredados de Animal y los específicos de Aves.
     * 
     * @return Una cadena con los atributos del ave.
     */
    @Override
    public String toString() {
        return super.toString() + " Aves{" + "tipoPlumaje=" + tipoPlumaje + ", vuela=" + vuela + ", numeroHuevos=" + numeroHuevos + ", colorPlumas=" + colorPlumas + ", velocidadVuelo=" + velocidadVuelo + '}';
    }
}


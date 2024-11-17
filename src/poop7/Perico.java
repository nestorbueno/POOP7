package zoologico; 

  

/** 

* Clase que modela un Perico, heredando de la clase Aves. 

* Los pericos son conocidos por su habilidad para imitar sonidos, por lo que esta clase 

* incluye un atributo y un método específico para esta habilidad. 

*/ 

public class Perico extends Aves { 

    private String vocabulario;  // Representa las palabras que el perico puede imitar. 

    private boolean esDomestico; // Indica si el perico es doméstico o salvaje. 

  

    /** 

     * Constructor vacío para crear un perico sin inicializar atributos. 

     */ 

    public Perico() { 

    } 

  

    /** 

     * Constructor que inicializa los atributos de un Perico. 

     *  

     * @param nombre El nombre del perico. 

     * @param edad La edad del perico. 

     * @param especie La especie del perico. 

     * @param peso El peso del perico. 

     * @param habitat El hábitat del perico. 

     * @param tipoPlumaje El tipo de plumaje del perico. 

     * @param vuela Indica si el perico puede volar. 

     * @param numeroHuevos El número de huevos que puede poner el perico. 

     * @param colorPlumas El color de las plumas del perico. 

     * @param velocidadVuelo La velocidad de vuelo del perico (en km/h). 

     * @param vocabulario Las palabras o sonidos que el perico puede imitar. 

     * @param esDomestico Indica si el perico es doméstico. 

     */ 

    public Perico(String nombre, int edad, String especie, float peso, String habitat, String tipoPlumaje, boolean vuela, int numeroHuevos, String colorPlumas, int velocidadVuelo, String vocabulario, boolean esDomestico) { 

        super(nombre, edad, especie, peso, habitat, tipoPlumaje, vuela, numeroHuevos, colorPlumas, velocidadVuelo);  // Llama al constructor de la superclase (Aves) 

        this.vocabulario = vocabulario; 

        this.esDomestico = esDomestico; 

    } 

  

    /** 

     * Obtiene el vocabulario del perico, es decir, las palabras o sonidos que puede imitar. 

     *  

     * @return El vocabulario del perico. 

     */ 

    public String getVocabulario() { 

        return vocabulario; 

    } 

  

    /** 

     * Establece el vocabulario del perico, es decir, las palabras o sonidos que puede imitar. 

     *  

     * @param vocabulario El nuevo vocabulario del perico. 

     */ 

    public void setVocabulario(String vocabulario) { 

        this.vocabulario = vocabulario; 

    } 

  

    /** 

     * Verifica si el perico es doméstico. 

     *  

     * @return true si el perico es doméstico, false en caso contrario. 

     */ 

    public boolean isEsDomestico() { 

        return esDomestico; 

    } 

  

    /** 

     * Establece si el perico es doméstico. 

     *  

     * @param esDomestico true si el perico es doméstico, false en caso contrario. 

     */ 

    public void setEsDomestico(boolean esDomestico) { 

        this.esDomestico = esDomestico; 

    } 

  

    /** 

     * Método que simula que el perico está imitando sonidos o palabras. 

     * Muestra un mensaje indicando qué palabras o sonidos está imitando el perico. 

     */ 

    public void imitarSonidos() { 

        System.out.println(getNombre() + " está imitando sonidos o palabras: " + vocabulario + "."); 

    } 

  

    /** 

     * Método que simula que el perico está volando. 

     * Si el perico puede volar, muestra un mensaje indicando la velocidad de vuelo. 

     * Si el perico no puede volar, indica que no puede volar. 

     */ 

    @Override 

    public void volar() { 

        if (isVuela()) { 

            System.out.println(getNombre() + " esta volando a una velocidad de " + getVelocidadVuelo() + " km/h."); 

        } else { 

            System.out.println(getNombre() + " no puede volar."); 

        } 

    } 

  

    /** 

     * Método toString que devuelve una representación en cadena del perico. 

     * Incluye los atributos heredados de Aves y los específicos de Perico. 

     *  

     * @return Una cadena con los atributos del perico. 

     */ 

    @Override 

    public String toString() { 

        return super.toString() + " Perico{" + "vocabulario=" + vocabulario + ", esDomestico=" + esDomestico + '}'; 

    } 

} 
package zoologico; 

  

/** 

* Clase que modela una Paloma, heredando de la clase Aves. 

* Las palomas son conocidas por su capacidad de orientación, por lo que esta clase 

* incluye un atributo y un método específico para esta habilidad. 

*/ 

public class Paloma extends Aves { 

    private boolean esMensajera;  // Indica si la paloma es mensajera. 

    private String destino;       // Representa el destino al que la paloma puede volar. 

  

    /** 

     * Constructor vacío para crear una paloma sin inicializar atributos. 

     */ 

    public Paloma() { 

    } 

  

    /** 

     * Constructor que inicializa los atributos de una Paloma. 

     *  

     * @param nombre El nombre de la paloma. 

     * @param edad La edad de la paloma. 

     * @param especie La especie de la paloma. 

     * @param peso El peso de la paloma. 

     * @param habitat El hábitat de la paloma. 

     * @param tipoPlumaje El tipo de plumaje de la paloma. 

     * @param vuela Indica si la paloma puede volar. 

     * @param numeroHuevos El número de huevos que puede poner la paloma. 

     * @param colorPlumas El color de las plumas de la paloma. 

     * @param velocidadVuelo La velocidad de vuelo de la paloma (en km/h). 

     * @param esMensajera Indica si la paloma es mensajera. 

     * @param destino El destino al que la paloma puede volar. 

     */ 

    public Paloma(String nombre, int edad, String especie, float peso, String habitat, String tipoPlumaje, boolean vuela, int numeroHuevos, String colorPlumas, int velocidadVuelo, boolean esMensajera, String destino) { 

        super(nombre, edad, especie, peso, habitat, tipoPlumaje, vuela, numeroHuevos, colorPlumas, velocidadVuelo);  // Llama al constructor de la superclase (Aves) 

        this.esMensajera = esMensajera; 

        this.destino = destino; 

    } 

  

    /** 

     * Verifica si la paloma es mensajera. 

     *  

     * @return true si la paloma es mensajera, false en caso contrario. 

     */ 

    public boolean isEsMensajera() { 

        return esMensajera; 

    } 

  

    /** 

     * Establece si la paloma es mensajera. 

     *  

     * @param esMensajera true si la paloma es mensajera, false en caso contrario. 

     */ 

    public void setEsMensajera(boolean esMensajera) { 

        this.esMensajera = esMensajera; 

    } 

  

    /** 

     * Obtiene el destino al que la paloma puede volar. 

     *  

     * @return El destino de la paloma. 

     */ 

    public String getDestino() { 

        return destino; 

    } 

  

    /** 

     * Establece el destino al que la paloma puede volar. 

     *  

     * @param destino El nuevo destino de la paloma. 

     */ 

    public void setDestino(String destino) { 

        this.destino = destino; 

    } 

  

    /** 

     * Método que simula que la paloma está volando hacia su destino. 

     * Si la paloma es mensajera, muestra un mensaje indicando que está volando hacia el destino. 

     * Si no es mensajera, muestra un mensaje indicando que no tiene un destino. 

     */ 

    public void volarHaciaDestino() { 

        if (esMensajera) { 

            System.out.println(getNombre() + " está volando hacia " + destino + "."); 

        } else { 

            System.out.println(getNombre() + " no tiene un destino asignado."); 

        } 

    } 

  

    /** 

     * Método que sobrescribe el comportamiento de volar. 

     * Si la paloma puede volar, muestra un mensaje indicando la velocidad de vuelo. 

     * Si no puede volar, muestra que no puede hacerlo. 

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

     * Método toString que devuelve una representación en cadena de la paloma. 

     * Incluye los atributos heredados de Aves y los específicos de Paloma. 

     *  

     * @return Una cadena con los atributos de la paloma. 

     */ 

    @Override 

    public String toString() { 

        return super.toString() + " Paloma{" + "esMensajera=" + esMensajera + ", destino=" + destino + '}'; 

    } 

} 
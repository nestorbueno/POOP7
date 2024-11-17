package zoologico;

/**
 * Clase que modela un Dalmata, heredando de la clase Perro.
 * Los Dálmatas son conocidos por su característico pelaje manchado, por lo que esta clase 
 * incluye un atributo específico para representar el número de manchas que tiene un Dalmata.
 */
public class Dalmata extends Perro {
    private int numeroManchas;

    /**
     * Constructor que inicializa los atributos de un Dalmata.
     * 
     * @param nombre El nombre del Dalmata.
     * @param edad La edad del Dalmata.
     * @param especie La especie a la que pertenece (Perro).
     * @param peso El peso del Dalmata.
     * @param habitat El hábitat del Dalmata.
     * @param raza La raza del perro (Dalmata).
     * @param colorPelaje El color del pelaje del Dalmata (Blanco con manchas negras).
     * @param numeroManchas El número de manchas que tiene el Dalmata.
     */
    public Dalmata(String nombre, int edad, String especie, float peso, String habitat, String raza, String colorPelaje, int numeroManchas) {
        super(nombre, edad, especie, peso, habitat, raza, colorPelaje, false, 80, true);  // Llama al constructor de la superclase (Perro)
        this.numeroManchas = numeroManchas;
    }

    /** 
     * Obtiene el número de manchas del Dalmata. 
     *  
     * @return El número de manchas del Dalmata. 
     */
    public int getNumeroManchas() {
        return numeroManchas;
    }

    /** 
     * Establece el número de manchas del Dalmata. 
     *  
     * @param numeroManchas El nuevo número de manchas del Dalmata. 
     */
    public void setNumeroManchas(int numeroManchas) {
        this.numeroManchas = numeroManchas;
    }

    /**
     * Método que muestra el número de manchas del Dalmata.
     * Este método imprime un mensaje indicando cuántas manchas tiene el Dalmata.
     */
    public void mostrarManchas() {
        System.out.println(getNombre() + " tiene " + numeroManchas + " manchas.");
    }

    /** 
     * Método toString que devuelve una representación en cadena del Dalmata. 
     * Incluye los atributos heredados de Perro y el número de manchas específico de Dalmata. 
     *  
     * @return Una cadena con los atributos del Dalmata. 
     */
    @Override
    public String toString() {
        return super.toString() + " Dalmata{" + "numeroManchas=" + numeroManchas + '}';
    }
}

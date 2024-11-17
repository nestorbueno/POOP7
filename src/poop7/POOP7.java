package poop7;

import zoologico.Animal;
import zoologico.Perro;
import zoologico.Aves;
import zoologico.Dalmata;
import zoologico.PastorAleman;
import zoologico.Perico;
import zoologico.Paloma;

/**
 *
 * @author poo03alu36
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar y trabajar con la clase Empleado y Gerente
        Empleado empleado = new Empleado("Eric", 321184593, 200000f);
        Empleado empleado2 = new Empleado("Nestor", 75383292, 1000000f);
        System.out.println(empleado);
        System.out.println(empleado2);

        empleado.aumentarSueldo(10);
        System.out.println(empleado);

        Gerente gerente = new Gerente(1000, "Oscar", 321, 23221);
        System.out.println(gerente);
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        gerente2.setPresupuesto(15000);
        System.out.println(gerente2);
        gerente2.setNombre("Sergio");
        System.out.println(gerente2);
        System.out.println(gerente2.getNombre());

        // Instanciar y trabajar con la clase Animal
        Animal animal = new Animal("Leon", 5, "Felino", 190.5f, "Sabana");
        System.out.println(animal);

        // Instanciar y trabajar con la clase Perro
        Perro perro = new Perro("Max", 3, "Canino", 30.0f, "Casa", "Labrador", "Marron", false, 80, true);
        System.out.println(perro);
        perro.ladrar();
        perro.correr();

        // Instanciar y trabajar con la clase Aves
        Aves ave = new Aves("Aguila", 4, "Ave", 6.5f, "Montanas", "Plumas largas", true, 2, "Marron", 80);
        System.out.println(ave);
        ave.volar();
        ave.cantar();

        // Instanciar y trabajar con la clase Dalmata
        Dalmata dalmata = new Dalmata("Pongo", 5, "Canino", 30.0f, "Casa", "Dalmata", "Blanco con manchas negras", 101);
        System.out.println(dalmata);
        dalmata.mostrarManchas();

        // Instanciar y trabajar con la clase PastorAleman
        PastorAleman pastorAleman = new PastorAleman("Rex", 4, "Canino", 35.0f, "Policia", "Pastor Aleman", "Negro y Marrón", 95, "Guardia");
        System.out.println(pastorAleman);
        pastorAleman.vigilar();
        pastorAleman.obedecerOrden();

        // Instanciar y trabajar con la clase Perico
        Perico perico = new Perico("Loro", 2, "Ave", 1.2f, "Selva", "Plumas cortas", true, 3, "Verde", 50, "Hola", true);
        System.out.println(perico);
        perico.imitarSonidos();

        // Instanciar y trabajar con la clase Paloma
        Paloma paloma = new Paloma("Paloma Blanca", 3, "Ave", 0.5f, "Ciudad", "Plumas cortas", true, 1, "Blanca", 60, true, "Paris");
        System.out.println(paloma);
        paloma.volarHaciaDestino();
    }
}

package co.com.sofka.ejerciciodos;


import java.util.Arrays;
import java.util.List;

/**
 * Clase encargada de tener todos la lista de insultos a
 * comprar en el resto del programa.
 * @author Hernan Velasquez
 * @version 1.0
 */
public class Word {
    public static List<String> obtenerPalabras(){
        List<String> words = Arrays.asList(
                "malparido",
                "careverga",
                "hp",
                "tu madre",
                "gonorrea",
                "joda"
        );
        return words;
    }
}

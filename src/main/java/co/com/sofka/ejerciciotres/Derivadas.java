package co.com.sofka.ejerciciotres;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Clase encargada de realizar las derivadas dando solicion al ejercico
 * tres del documento de trabajo
 * @author Hernan Velasquez
 * @version 1.0
 */
public class Derivadas {
    /**
     * Metodo encargado de realizar las derivadas de las funciones
     * @param coeficiente el coeficiente base de trabajo
     * @param exponente el exponeente a elevar la base
     * @return la funcion base de derivada en forma de string
     */
    public String derivar(Double coeficiente, Double exponente) {
        BiFunction<Double, Double, Double> coeficienteResult = (coef, expo) -> coef * expo;
        Function<Double, Double> exponenteResult = (expo) -> expo - 1;
        return coeficienteResult.apply(coeficiente,exponente)+ "x^"+ exponenteResult.apply(exponente);
    }

}

package co.com.sofka.ejerciciotres;

import java.util.function.BiFunction;

/**
 * Clase encargada de realizar las Integrales dando solicion al ejercico
 * tres del documento de trabajo
 * @author Hernan Velasquez
 * @version 1.0
 */
public class Integrales {
    /**
     * Metodo encargado de hacer la integrarl de datos.
     * @param coeficiente
     * @param exponente
     * @return en forma de string la integral resuelta
     */
    public String integrar(Double coeficiente, Double exponente) {
        BiFunction<Double, Double, Double> coeficienteResult = this::validation;
        return coeficienteResult.apply(coeficiente, exponente)+"x^"+ exponenteResult(exponente);
    }

    /**
     * Meoto en cargado de relizar la validacion de datos, en la ecuacion
     * para relizar la validacio de la integral
     * @param coeficiente
     * @param exponent
     * @return la validacion de la ecuacion a validar los datos para realzar la ecuación
     */
    private Double validation(Double coeficiente, Double exponent){
        return (coeficiente/(exponent+1) == 1) ? 1.0 : coeficiente /(exponent+1);
    }

    /**
     * Metodo encargado de realizar la suma del exponenete ingresado
     * @param expo
     * @return el exponente ingresado mas uno
     */
    private Double exponenteResult(Double expo){
        return expo + 1;
    }

}

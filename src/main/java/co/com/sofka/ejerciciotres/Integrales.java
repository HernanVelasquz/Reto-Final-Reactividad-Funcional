package co.com.sofka.ejerciciotres;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Integrales {
    public String integrar(Double coeficiente, Double exponente) {
        BiFunction<Double, Double, Double> coeficienteResult = this::validation;
        return coeficienteResult.apply(coeficiente, exponente) +"x^" + exponenteResult(exponente);
    }

    private Double validation(Double coeficiente, Double exponent){
        return (coeficiente/(exponent+1) == 1) ? 1.0 : coeficiente /(exponent+1);
    }

    private Double exponenteResult(Double expo){
        return expo + 1;
    }
}

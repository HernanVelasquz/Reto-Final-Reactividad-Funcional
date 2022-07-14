package co.com.sofka.ejerciciotres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DerivadasTest {
    @InjectMocks
    Derivadas derivadas;

    @Test
    void testDerivadaUno(){
        var value = derivadas.derivar(5.0,4.0);
        Assertions.assertEquals("20.0x^3.0", value);
    }

    @Test
    void testDerivadaDos(){
        var value = derivadas.derivar(6.0,3.2);
        Assertions.assertEquals("19.200000000000003x^2.2", value);
    }

    @Test
    void testDerivadaTres(){
        var value = derivadas.derivar(8.0,3.0);
        Assertions.assertEquals("24.0x^2.0", value);
    }
}
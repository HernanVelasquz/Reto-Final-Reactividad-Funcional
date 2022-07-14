package co.com.sofka.ejerciciotres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class IntegralesTest {

    @InjectMocks
    Integrales integrar;

    @Test
    void testIntegrarUno(){
        var value = integrar.integrar(20.0,3.0);
        Assertions.assertEquals("5.0x^4.0", value);
    }

    @Test
    void testIntegrarDos(){
        var value = integrar.integrar(19.200000000000003,2.2);
        Assertions.assertEquals("6.000000000000001x^3.2", value);
    }

    @Test
    void testIntegrarTres(){
        var value = integrar.integrar(24.0,2.0);
        Assertions.assertEquals("8.0x^3.0", value);
    }
}
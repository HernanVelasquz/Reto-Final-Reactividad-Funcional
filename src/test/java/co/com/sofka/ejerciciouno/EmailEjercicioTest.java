package co.com.sofka.ejerciciouno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmailEjercicioTest {

    @InjectMocks
    EmailEjercicio emailEjercicio;

    @Test
    void distinctEmail() {
        var vales = emailEjercicio.emailsRepetidos();
        Assertions.assertEquals(33, vales.size());
    }

    @Test
    void emailFiltro() {
        var homails = emailEjercicio.filterHotmail();
        var gmail = emailEjercicio.filterGmail();
        var outlook = emailEjercicio.filterOutlook();
        Assertions.assertEquals(4, homails.size());
        Assertions.assertEquals(17, gmail.size());
        Assertions.assertEquals(17, outlook.size());
    }

    @Test
    void validatonEmails() {
        var emails = emailEjercicio.validationFormatEmail();
        Assertions.assertEquals(40, emails.size());
    }

    @Test
    void numbersEmails() {
        var amountsEmails = emailEjercicio.amountsEmails();
        Assertions.assertEquals(40, amountsEmails);
    }

    @Test
    void numbersTypeEmails() {
        var amountsOutlook = emailEjercicio.countEmailsOutlook();
        var amountsGmail = emailEjercicio.countEmailsGmail();
        var amountsHotmal = emailEjercicio.countEmailsHotmail();
        Assertions.assertEquals(17, amountsOutlook);
        Assertions.assertEquals(17, amountsGmail);
        Assertions.assertEquals(4, amountsHotmal);
    }

    @Test
    void testEmailsEnviados() {
        var emailsEnviados = emailEjercicio.emailsEnviados();
        System.out.println(emailsEnviados);
//        Assertions.assertEquals(40, amountsEmails);
    }
}
package co.com.sofka.ejerciciouno;

import java.util.List;
import java.util.stream.Collectors;

public class EmailEjercicio {
   private final List<Email> emails;

    public EmailEjercicio(){
        emails = List.of(
                new Email("hernan@gmail.com", true),
                new Email("2001g8tor@gmail.com",false),
                new Email("2001g8tor@gmail.com",false),
                new Email("2001soni@gmail.com", true),
                new Email("2dsherrill@gmail.com",true),
                new Email("2dsherrill@gmail.com",true),
                new Email("2dsherrill@gmail.com",false),
                new Email("dr.soma85@gmail.com", false),
                new Email("dranilkamath@gmail.com",true),
                new Email("dkvijaykumar@gmail.edu",false),
                new Email("dogarmull_99@yahoo.com",true),
                new Email("dorairajan@jipmer.edu", false),
                new Email("dorairajan_ln@gmail.com",true),
                new Email("dr.soma85@gmail.com", false),
                new Email("dranilkamath@gmail.com", true),
                new Email("dkvijaykumar@gmail.edu", true),
                new Email("dogarmull_99@hotmail.com",true),
                new Email("dpm@gmail.com",false),
                new Email("drpratapdas@outlook.com",true),
                new Email("drpremrajp@outlook.com",false),
                new Email("drrajivsarin@outlook.com",true),
                new Email("drsasatyajit@outlook.com", false),
                new Email("drskjindal@outlook.com",true),
                new Email("drsradhika@outlook.com", false),
                new Email("drsvkane@outlook.com",true),
                new Email("drtrajkumar@outlook.com", false),
                new Email("drvikramkate@outlook.com",true),
                new Email("drvinay3@outlook.com",false),
                new Email("drvineettalwar@outlook.com",true),
                new Email("drvk@outlook.org",false),
                new Email("durgatosh@outlook.in",false),
                new Email("elangovansundar@outlook.com",true),
                new Email("ellora@outlook.in",false),
                new Email("elsa.ke@outlook.com",true),
                new Email("dr.elango2@gmail.com", true),
                new Email("dr.soma85@gmail.com",false),
                new Email("dr_deepaagrawal@outlook.com",false),
                new Email("drabapna@hotmail.com",true),
                new Email("dranilkamath@hotmail.com", false),
                new Email("drbharath.r@hotmail.com",true),
                new Email("drchaturhotmail.com",false),
                new Email("drdalelahotmail.com",true));
    }

    /**
     * Metodo encargado de realizar la validacion si existen correos repetidos
     *
     * @return lista de correos repetidos en una nueva lista
     */
    public List<String> emailsRepetidos(){
        return emails.stream()
                .map(Email::getEmail)
                .distinct()
                .filter(email -> email.contains("@"))
                .collect(Collectors.toList());
    }

    /**
     * Metodo encarfado de filtrar los correos con dominio de hotmail
     * donde se retornara un nueva lista con los correos nuevos que sean hotmail
     * @return Lista de correos con dominio de hotmail
     */
    public List<String> filterHotmail(){
        return emails.stream()
                .map(Email::getEmail)
                .filter(email -> email.contains("@hotmail"))
                .collect(Collectors.toList());
    }

    /**
     * Metodo encarfado de filtrar los correos con dominio de gmail
     * donde se retornara un nueva lista con los correos nuevos que sean gmail
     * @return Lista de correos con dominio de gmail
     */
    public List<String> filterGmail(){
        return emails.stream()
                .map(Email::getEmail)
                .filter(email -> email.contains("@gmail"))
                .collect(Collectors.toList());
    }

    /**
     * Metodo encarfado de filtrar los correos con dominio de outlook
     * donde se retornara un nueva lista con los correos nuevos que sean outlook
     * @return Lista de correos con dominio de outlook
     */
    public List<String> filterOutlook(){
        return emails.stream()
                .map(Email::getEmail)
                .filter(email -> email.contains("@outlook"))
                .collect(Collectors.toList());
    }

    /**
     * Metodo encargado de validar si los correos cuenta con @ para hacerlos validos
     * y retorna la lista con los correos validos.
     * @return Lista de correos validos, los cuales contienen el @
     */
    public List<String> validationFormatEmail(){
        return emails.stream()
                .map(Email::getEmail)
                .filter(email -> email.contains("@"))
                .collect(Collectors.toList());
    }

    /**
     * Funcion encargada de retornar los correos que se encuentran en la lista,
     * aplicando la validacion que tengan el @ para que estos sean validos.
     * @return numero de correos que hay en la lista que sean validos
     */
    public Long amountsEmails() {
        return emails.stream()
                .map(Email::getEmail)
                .filter(email -> email.contains("@"))
                .count();
    }
    /**
     * Funcion encargada de retornar el numero de correos que hay de Outlook,
     * @return numero de correos que hay en la lista que sean validos.
     */
    public Long countEmailsOutlook(){
        return  filterOutlook().stream()
                .count();
    }
    /**
     * Funcion encargada de retornar el numero de correos que hay de Gmail,
     * @return numero de correos que hay en la lista que sean validos.
     */
    public Long countEmailsGmail(){
        return filterGmail().stream()
                .count();
    }
    /**
     * Funcion encargada de retornar el numero de correos que hay de Hotmail,
     * @return numero de correos que hay en la lista que sean validos.
     */
    public Long countEmailsHotmail(){
        return filterHotmail().stream()
                .count();
    }

    public List<Object> emailsEnviados(){
        return emails.stream()
                .distinct()
                .filter(email -> email.getEmail().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .map(stadus -> {
                    if(stadus.getStado()){
                        stadus.modifyStad(!stadus.getStado());
                        return stadus;
                    }
                    return stadus;
                })
                .collect(Collectors.toList());
    }
}

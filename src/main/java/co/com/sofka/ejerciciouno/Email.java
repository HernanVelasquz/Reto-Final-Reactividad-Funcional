package co.com.sofka.ejerciciouno;

/**
 * Clase encargada de realizar
 * la validaion del email para los datos
 * @author Hernan Velasquez
 * @version 1.0
 */
public class Email {
        private String email;
        private Boolean stad;

    public Email(String email, Boolean stad) {
            this.email = email;
            this.stad = stad;
        }

        public String getEmail() {
            return email;
        }

    public Boolean getStado() {
        return stad;
    }

    public Boolean modifyStad(boolean stad) {
        stad = false;
        return stad;
    }
}

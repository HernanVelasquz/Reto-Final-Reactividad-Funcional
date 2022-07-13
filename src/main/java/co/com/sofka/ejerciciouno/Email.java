package co.com.sofka.ejerciciouno;

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

    public Boolean stad() {
        return stad;
    }

    public void modifyStad(boolean stad) {
        this.stad = false;
    }
}

package entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    // não faz sentido haver um client sem nome, email ou data de nascimento. por
    // isso nao usei sobrecarga de construtores

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }
}

package domain.model;

public class Person {

    private String name;
    private String email;
    private String password;

    public Person(String name, String email, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new DomainException("De naam van de persoon is niet ingevuld");
        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty())
            throw new DomainException("De email is niet ingevuld");
        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty())
            throw new DomainException("De password is niet ingevuld");
        this.password = password;
    }


}

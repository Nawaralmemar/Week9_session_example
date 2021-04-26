package domain.db;

import domain.model.DomainException;
import domain.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDatabase {
    private List<Person> persons = new ArrayList<>();

    public PersonDatabase() {
        Person person1 = new Person("Serhat", "serhat.erdogan@ucll.be","abc");
        Person person2 = new Person("Bob", "bob.debouwer@ucll.be","abc");
        this.voegToe(person1);
        this.voegToe(person2);

    }


    public void voegToe(Person person) {
        if (person == null)
            throw new DomainException("Geen geldige person om toe te voegen");
        if (this.vindPerson(person.getName())!=null)
            throw new DomainException("Er bestaat al een wijn met deze naam");
        this.persons.add(person);
    }

    public List<Person> getAllePersonen() {
        return persons;

    }


    public Person vindPerson(String naam) {
        if (naam == null || naam.trim().isEmpty())
            throw new DomainException("Geef de naam van de persoon die je wil zoeken");
        for (Person person : getAllePersonen()
        ) {
            if (person.getName().equals(naam))
                return person;
        }
        return null;
    }



}

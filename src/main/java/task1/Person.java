package task1;

import com.google.common.collect.ComparisonChain;

public class Person implements Comparable<Person>{
    private final String name;
    private final String surname;
    private final String email;

    public Person(String name, String surname, String email) throws IllegalArgumentException
    {
        if (name.matches("\\w+")) this.name = name;
        else throw new IllegalArgumentException("Invalid name " + name);
        if (surname.matches("\\w+")) this.surname = surname;
        else throw new IllegalArgumentException(("Invalid surname " + surname));
        if (email.matches("[\\w\\d.-]+@[\\w\\d]+\\.\\w+")) this.email = email;
        else throw new IllegalArgumentException("Invalid email " + email);
    }

    public int compareTo(Person p2)
    {
        return ComparisonChain.start()
                .compare(this.name, p2.name)
                .compare(this.surname, p2.surname)
                .compare(this.email, p2.email)
                .result();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString()
    {
        return name + " " + surname + " (" + email + ")";
    }
}

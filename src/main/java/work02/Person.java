package work02;

public class Person {

    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        if (testString(firstname) && testString(lastname)) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.id = nextId;
            nextId++;
        } else {
            throw new IllegalArgumentException("Invalid firstname or lastname");
        }
    }

    @Override
    public String toString() {
        return "Person(" + id + "," + firstname + "," + lastname + ")";
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (testString(firstname)) {
            this.firstname = firstname;
        } else {
            throw new IllegalArgumentException("Invalid firstname");
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (testString(lastname)) {
            this.lastname = lastname;
        } else {
            throw new IllegalArgumentException("Invalid lastname");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return id == person.id;
    }

    private boolean testString(String value) {
        return value != null && !value.isEmpty();
    }
}

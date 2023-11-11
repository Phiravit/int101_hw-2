package work02;
import work01.Utilitor;
public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        try {
            Utilitor.testString(firstname);
            Utilitor.testString(lastname);
        } catch (Exception e) {
            e.printStackTrace(); // or log the exception details
        }

        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person(")
                .append(id)
                .append(",")
                .append(firstname)
                .append(",")
                .append(lastname)
                .append(")");
        return stringBuilder.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        Utilitor.testString(firstname);
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        Utilitor.testString(lastname);
        this.lastname = lastname;
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
}

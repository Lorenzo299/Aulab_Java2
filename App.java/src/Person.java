public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void info() {
        System.out.println("Ciaoo sono " + name + " " + surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        Person p = (Person) obj;
        if (this.name == p.name && this.surname == p.surname) {
            return true;
        }

        return false;

    }
}

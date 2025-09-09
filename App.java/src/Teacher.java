public class Teacher extends Person {
    String subject;

    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }

    public void info() {
        System.out.println(
                "Buongiorno ragazzi sono la prof " + this.getName() + " " + this.getSurname() + " e insegno" + subject);
    }

}

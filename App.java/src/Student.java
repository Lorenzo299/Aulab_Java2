public class Student extends Person {

    String prefSub;

    public Student(String name, String surname, String prefSub) {
        super(name, surname);
        this.prefSub = prefSub;
    }

    public void info() {
        System.out.println("Salve io sono " + this.getName() + " " + this.getSurname()
                + " e la mia materia preferita è " + prefSub);
    }
}

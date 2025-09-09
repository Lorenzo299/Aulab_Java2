public class App {
    public static void main(String[] args) throws Exception {
        Person lorenzo = new Person("Lorenzo", "Gatti");

        lorenzo.info();

        Person federico = new Person("federico", "micio");

        federico.info();

        Teacher prof1 = new Teacher("Prima", "Prof", "Storia");
        Teacher prof2 = new Teacher("Seconda", "Proff", "Matematica");

        Student stud1 = new Student("Lello", "Bello", "Fisica");
        Student stud2 = new Student("Pino", "gino", "nessuna");

        System.out.println(prof1.equals(stud2));
        System.out.println(stud1.equals(stud2));
    }

}

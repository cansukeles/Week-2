public class Main {
    public static void main(String[] args) {
        Course matematik = new Course("Matematik", "101", "MAT", 0.2);
        Course fizik = new Course("fizik", "102", "FZK", 0.3);
        Course kimya = new Course("kimya", "101", "KMY", 0.4);

        Teacher t1 = new Teacher("Cansu Hoca", "030020", "MAT");
        Teacher t2 = new Teacher("Öncel Hoca", "030303", "FZK");
        Teacher t3 = new Teacher("Cüneyt Hoca", "040306", "KMY");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ayşe", 4, "123", matematik, fizik, kimya);
        s1.addBulkExamNote(100, 70,80);
        s1.addBulkExamSozluNote(90, 85, 75);
        s1.isPass();

        Student s2 = new Student("Fatma", 3, "234", matematik, fizik, kimya);
        s2.addBulkExamNote(40,30,20);
        s2.addBulkExamSozluNote(15, 30, 35);
        s2.isPass();


    }
}
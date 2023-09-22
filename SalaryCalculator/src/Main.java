public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Cansu", 1500, 38, 2020);
        Employee e2 = new Employee("Öncel", 800, 45, 2000);

        e1.getPrint();
        System.out.println("-------------");
        e2.getPrint();
    }
}
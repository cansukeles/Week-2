public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double tax = 0;
        if (this.salary >= 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    double bonus() {
        double bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        int year = (2021 - this.hireYear);
        double raiseSalary = 0;

        if (year < 10) {
            raiseSalary = this.salary + (this.salary * 0.05);
        }
        if (year > 9 && year < 20) {
            raiseSalary = this.salary + (this.salary * 0.10);
        }
        if (year > 19) {
            raiseSalary = this.salary + (this.salary * 0.15);
        }

        return raiseSalary;
    }

    void getPrint() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam maaş: " + (salary + raiseSalary() + bonus() - tax()));
    }
}

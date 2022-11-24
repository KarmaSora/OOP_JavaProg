package M5Paket;

public class Employe extends Person {
    private int salary;

    public Employe(int salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        if(salary >= 0)
            this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}


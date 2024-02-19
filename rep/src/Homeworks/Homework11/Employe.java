package Homeworks.Homework11;

class Employe {
    private String name;
    private double salary;
    private String department;

    public Employe(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }
}

package Homeworks.Homework11;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employe> employes;

    public Company() {
        this.employes = new ArrayList<>();
    }

    public void addEmploye(String name, double salary, String department) {
        Employe employe = new Employe(name, salary, department);
        employes.add(employe);
        System.out.println("Employe added " + name);
    }

    public void removeEmploye(String name) {
        employes.removeIf(employe -> employe.getName().equals(name));
        System.out.println("Employe removed " + name);
    }

    public void printAllEmployes() {
        for (Employe employe : employes) {
            System.out.println(employe.toString());
        }
    }

    public List<Employe> getEmployes() {
        return employes;
    }


    public static double calculateAverageSalary(List<Employe> employes) {
        if (employes.isEmpty()) {
            return 0.0;
        }

        double totalSalary = 0.0;
        for (Employe employe : employes) {
            totalSalary += employe.getSalary();
        }

        return totalSalary / employes.size();
    }
}

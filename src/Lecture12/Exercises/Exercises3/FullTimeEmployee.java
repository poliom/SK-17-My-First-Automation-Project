package Lecture12.Exercises.Exercises3;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String firstName, String lastName, double baseSalary) {
        super(id, firstName, lastName, baseSalary);
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }
}
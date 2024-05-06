package InheritanceChallenge1;

public class Employee extends Worker{

    private static long employeeId = 0;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        employeeId++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "endDate='" + endDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}

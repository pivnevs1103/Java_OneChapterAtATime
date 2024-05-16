package Learning_Records;

import java.util.Objects;

/*
    This is used to compare to the EmployeeRecord, to show how much less work you have to do with a record
 */
public class EmployeeClass {

    private final String name;
    private final int employeeID;

    public EmployeeClass(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public boolean equals(final Object o) {
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        EmployeeClass employee = (EmployeeClass) o;
        return Objects.equals(employeeID, employee.employeeID)
                && Objects.equals(name, employee.name);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}

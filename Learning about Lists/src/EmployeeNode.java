/*
The EmployeeNode class represents a node in the linked list. Each node contains an
Employee object and a reference to the next node in the list (next).
 */
public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }
}

package Learning_Records;

/*     RECORDS:
       - A fairly new addition to Java
       - Used to simply reduce the amount of code you have to write, in a case where you needed to create a simply
       class to just carry over data
       - EmployeeClass is what that class that carries over data, compare the amount of code you have to write compared
       to EmployeeRecord
       - Look at EmployeeClass vs EmployeeRecord
 */
public class Main {
    public static void main(String[] args) {

        EmployeeClass employee = new EmployeeClass("Sergey", 12345);
        System.out.println(employee.getName());
        System.out.println(employee);

        EmployeeRecord employeeRecord = new EmployeeRecord("Connor", 12346);
        // Notice how the getter doesnt have the word 'get' in it.
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.printWhatever();
    }
}

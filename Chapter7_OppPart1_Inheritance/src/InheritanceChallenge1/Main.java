package InheritanceChallenge1;

public class Main {
    public static void main(String[] args) {

        Employee worker = new Employee("Bedard", "11/03/2004", "01/01/2026");
        SalariedEmployee worker2 = new SalariedEmployee("Michkov", "11/03/1950",
                "01/01/2020", 35000);

        System.out.println(worker);
        System.out.println("Age = " + worker.getAge());
        System.out.println("Pay = " + worker.collectPay());

        System.out.println(worker2);
        System.out.println("Age = " + worker2.getAge());
        System.out.println("Pay = " + worker2.collectPay());
        worker2.retire();
        System.out.println("Jays bi-weekly paycheck is = $" + worker2.collectPay());

        HourlyEmployee worker3 = new HourlyEmployee("Kaprizov", "05/15/1997", "12/12/2023",
                    "10/19/2020", 15);
        System.out.println(worker3);
        System.out.println("Kaprisov paychecks = $" + worker3.collectPay());
        System.out.println("Kaprisov Holiday pay = $" + worker3.getDoublePay());
    }
}

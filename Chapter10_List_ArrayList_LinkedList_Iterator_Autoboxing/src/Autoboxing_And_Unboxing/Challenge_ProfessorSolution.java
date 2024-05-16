package Autoboxing_And_Unboxing;

import java.util.ArrayList;

record BankCustomer(String name, ArrayList<Double> transactions){
    public BankCustomer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}

public class Challenge_ProfessorSolution {
    public static void main(String[] args) {

        BankCustomer bob = new BankCustomer("Bob s", 1000);
        System.out.println(bob);

        NewBank bank = new NewBank("Chase");
        bank.addNewCostumer("Jane A", 500.0);
        System.out.println(bank);


        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", -75.01);
        bank.printStatement("jane a");

        bank.addNewCostumer("bob s", 25);
        bank.addTransaction("Bob S", 100);
        bank.printStatement("bob s");
    }
}

class NewBank{

    private String name;
    private ArrayList<BankCustomer> costumers = new ArrayList<>(5000);

    public NewBank(String name){
        this.name = name;
    }

    private BankCustomer getCustomer(String customerName){

        for(var bankCustomer : costumers){
            if(bankCustomer.name().equalsIgnoreCase(customerName)){
                return bankCustomer;
            }
        }
        System.out.println("Customer " + customerName + " wasnt found \n");

        return null;
    }

    public void addNewCostumer(String customerName, double initialDeposit){

        if(getCustomer(customerName) == null){
            BankCustomer customer = new BankCustomer(customerName, initialDeposit);
            costumers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount){
        BankCustomer customer = getCustomer(name);
        if(customer != null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){

        BankCustomer customer = getCustomer(customerName);
        if (customer == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions: ");
        for(double d : customer.transactions()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return "NewBank{" +
                "name='" + name + '\'' +
                ", costumers=" + costumers +
                '}';
    }
}

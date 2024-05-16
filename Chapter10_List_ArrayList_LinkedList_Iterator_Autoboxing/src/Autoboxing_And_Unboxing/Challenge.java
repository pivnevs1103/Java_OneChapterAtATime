package Autoboxing_And_Unboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Bank user = new Bank("Sergey Pivnev", "Credit");
        System.out.println(user);
        Bank user1 = new Bank("Sergey Pivnev", "Credit");
        Bank user2 = new Bank("Connor Bedard", "Credit");

    }
}

class Bank {
    private String name;
    private String type;
    private static ArrayList<Customer> customer = new ArrayList<>();
    int transactionHist = 0;

    public Bank(String name, String type) {
        this.name = name;
        this.type = type;

        creatingCustomer();
    }

    private void creatingCustomer(){
        addingCustomer(new Customer(name, type));
    }

    private Customer findCustomer(String name) {
        for (Customer cos : customer) {
            if (cos.getName().equals(name)) {
                return cos;
            }
        }
        return null;
    }

    private void addingCustomer(Customer client) {
        if (findCustomer(client.getName()) != null) {
            System.out.println("\n----------Customer: " + name.toUpperCase() + " is already in the dataBase, " +
                    "cant add him----------");
        }else {
            customer.add(client);
            System.out.println("\nNEW Client: " + name.toUpperCase() + " has been created and added!");
        }
        addingTransaction();
    }

    public void addingTransaction(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            showInfo();
            int input = scanner.nextInt();

            switch (input){
                case 1 -> showingBalance();
                case 2 -> transaction(2);
                case 3 -> transaction(1);
                case 4 -> flag = false;
                default -> System.out.println("You have selected something incorrect, please try again");
            }
        }
    }

    public void transaction(int value){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount: $ ");
        double money = scanner.nextDouble();

        switch (value){
            case 1 -> {findCustomer(name).addingTransaction(money);
            System.out.println("\n------->TRANSACTION DONE: You just Deposited: $" + money + " to your account");
            transactionHist++;
            }
            case 2 -> {findCustomer(name).addingTransaction(money * -1);
                System.out.println("\n------->TRANSACTION DONE: You just Withdrew: $" + money + " from your account");
                transactionHist++;
            }default -> System.out.println("You have entered something incorrect");

        }
    }

    public void showingBalance(){

        for(int i = 0; i < transactionHist; i++){
            double presentTrans = findCustomer(name).getTransaction(i);
            if(presentTrans < 0){
                System.out.println("*********************************************************************");
                System.out.println("TRANSACTION: " + i + ". You successfully WITHDREW $" + presentTrans +
                        " from your account");
            }else if(transactionHist < 1){
                System.out.println("You have completed 0 Transactions!");
            }else {
                System.out.println("*********************************************************************");
                System.out.println("TRANSACTION: " + i + ". You successfully DEPOSITED $" + presentTrans +
                        " from your account");
            }
        }
        System.out.println("\n##########################" +
                "\n# NAME: " + name + " ".repeat(3) + " #" +
                "\n# ACCOUNT TYPE: " + type + " ".repeat(2) + " #" +
                "\n# ACCOUNT BALANCE: $" + findCustomer(name).countingTotal() + "  #" +
                "\n##########################");
    }

    public void showInfo(){
        System.out.println("""
                \nPlease choose from the following menu:
                1. Show Account balance
                2. Withdraw Money
                3. Deposit money
                4. Quit""");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", transactionHist=" + transactionHist +
                '}';
    }
}

class Customer {

    private String name;
    private String bankType;
    private ArrayList<Double> transactions;

    public Customer(String name, String bankType){
        this.name = name;
        this.bankType = bankType;
        this.transactions = new ArrayList<Double>();
    }

    public String getName(){
        return name;
    }

    public double getTransaction(int index){
        return transactions.get(index);
    }

    public void addingTransaction(double value){
        transactions.add(value);
    }

    public double countingTotal(){
        double total = 0;
        for(double i : transactions){
            total += i;
        }
        return total;
    }
}

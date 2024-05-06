package BillsBurgerMasterChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Welcome! Would you like to place an order *****");
        System.out.print("""
                                Type '1' for yes
                            Type anything else for no
                """);

        int input = scanner.nextInt();

        if (input == 1) {
            initiatingProgram();
        }
    }
    public static void initiatingProgram(){
        Menu menu = new Menu();
        menu.printsInfo();
        }
}


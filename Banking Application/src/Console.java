import java.util.Scanner;

public class Console {


    //Function showing the main menu
    public static void showMenu(Account account) {
        char option ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + account.customerName + "!");
        System.out.println("Your ID is: " + account.customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            //Case 'A' allows the user to check their account balance
            if (option == 'A') {
                System.out.println("====================================");
                System.out.println("Balance = $" + account.balance);
                System.out.println("====================================");
                System.out.println();
                //Case 'B' allows the user to deposit money into their account using the 'deposit' function
            } else if (option == 'B') {
                System.out.println("Enter an amount to deposit: ");
                int amount = scanner.nextInt();
                Transactions.deposit(account, amount);
                System.out.println();
                //Case 'C' allows the user to withdraw money from their account using the 'withdraw' function
            } else if (option == 'C') {
                System.out.println("Enter an amount to withdraw: ");
                int amount2 = scanner.nextInt();
                Transactions.withdraw(account, amount2);
                System.out.println();
                //Case 'D' allows the user to view their most recent transaction using the 'getPreviousTransaction' function
            } else if (option == 'D') {
                System.out.println("====================================");
                Transactions.getPreviousTransaction(account);
                System.out.println("====================================");
                System.out.println();
                //Case 'E' calculates the accrued interest on the account after a number of years specified by the user
            } else if (option == 'E') {
                System.out.println("Enter how many years of accrued interest: ");
                int years = scanner.nextInt();
                CalculateInterest.calculateInterest(account, years);
                //Case 'F' exits the user from their account
            } else if (option == 'F') {
                System.out.println("====================================");

                //The default case let's the user know that they entered an invalid character and how to enter a valid one
            } else {
                System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
            }
        } while (option != 'F');
        System.out.println("Thank you for banking with us!");
    }
}

public class Transactions {

    //Function for Depositing money

    public static void deposit(Account account, int amount) {
        if (amount != 0) {
            account.balance = account.balance + amount;
            account.previousTransaction = amount;
        }
    }

    //Function for Withdrawing money

    public static void withdraw(Account account, int amount) {
        if (amount != 0) {
            account.balance = account.balance - amount;
            account.previousTransaction = -amount;
        }
    }

    //Function showing the previous transaction

    public static void getPreviousTransaction(Account account) {
        if (account.previousTransaction > 0) {
            System.out.println("Deposited: " + account.previousTransaction);
        } else if (account.previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(account.previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }
}

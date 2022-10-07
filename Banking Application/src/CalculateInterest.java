public class CalculateInterest {

    //Function calculating interest of current funds after a number of years

    public static void calculateInterest(Account account, int years) {
        double interestRate = .0185;
        double newBalance = (account.balance * interestRate * years) + account.balance;
        System.out.println("The current interest rate is " + (100 * interestRate) + "%");
        System.out.println("After " + years + " years, you balance will be: " + newBalance);
    }
}

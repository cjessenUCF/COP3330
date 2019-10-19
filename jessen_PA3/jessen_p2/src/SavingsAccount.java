public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

}

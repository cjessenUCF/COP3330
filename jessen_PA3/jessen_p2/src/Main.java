public class Main {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        saver1.modifyInterestRate(.04);
        saver2.modifyInterestRate(.04);

        int i;
        for(i = 0; i < 12; i++){

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println("Saver 1's balance at 4% annual interest rate for month " + (i + 1) + ": " + saver1.getSavingsBalance());
            System.out.println("Saver 2's balance at 4% annual interest rate for month " + (i + 1) + ": " + saver2.getSavingsBalance());
        }

        saver1.modifyInterestRate(.05);
        saver2.modifyInterestRate(.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 1's balance for the next month at 5% annual interest rate: " + saver1.getSavingsBalance());
        System.out.println("Saver 2's balance for the next month at 5% annual interest rate: " + saver2.getSavingsBalance());


    }
}

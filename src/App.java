import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "Moizés", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Alanna", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Liz", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Fatima", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}

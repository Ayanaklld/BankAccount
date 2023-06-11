import Accounts.CheckingAccount;
import Accounts.CreditAccount;
import Accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Cберегательный счет", 1500);
//       savingsAccount.transfer(savingsAccount, 300);

        CreditAccount creditAccount = new CreditAccount("Кредитный счет", 0);
//       creditAccount.transfer(savingsAccount, 700);

        CheckingAccount checkingAccount = new CheckingAccount("Рассчетный счет", 500);
//        checkingAccount.pay(600);
          checkingAccount.transfer(creditAccount, 500);
    }
}

package Accounts;

public class CreditAccount extends Account {
    private int creditBalance;

    public CreditAccount(String name, int creditBalance) {
        super(name);
        this.creditBalance = creditBalance;
    }

    @Override
    public void pay(int amount) {
        if (creditBalance <= 0  ) {
            creditBalance -= amount;
            System.out.printf("Вы заплатили %s, теперь ваш кредитный счет равен %s \n", amount, creditBalance);
        } else {
            System.out.println("Платеж невозможен.");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (creditBalance <= 0){
            creditBalance -= amount;
            account.addMoney(amount);
            System.out.printf("Деньги были переведены на %s. Cумма: %s тенге.\n", account.name, amount);
            System.out.println("Остаток на кредитном счете: " + getCreditBalance() + " тенге.");
        } else {
            System.out.println("Перевод невозможен.");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (creditBalance + amount > 0) {
            System.out.println("Пополните на ровный счет.");
        } else {
            creditBalance += amount;
            System.out.println("Кредитный счет: " + getCreditBalance());
        }
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
}

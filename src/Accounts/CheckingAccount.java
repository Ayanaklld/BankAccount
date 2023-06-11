package Accounts;

public class CheckingAccount extends Account{
    private int checkingBalance;

    public CheckingAccount(String name, int checkingBalance) {
        super(name);
        this.checkingBalance = checkingBalance;
    }

    @Override
    public void pay(int amount) {
        if (checkingBalance <= 0){
            checkingBalance -= amount;
            System.out.printf("Вы заплатили %s, теперь ваш расчетный счет равен %s \n", amount, checkingBalance);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (checkingBalance >= 0){
            checkingBalance -= amount;
            account.addMoney(amount);
            System.out.printf("Деньги были переведены на %s. Cумма: %s тенге.\n", account.name, amount);
            System.out.println("Остаток на расчетном счете: " + getCheckingBalance() + " тенге.");
        } else {
            System.out.println("Перевод невозможен.");
        }
    }

    @Override
    public void addMoney(int amount) {
        checkingBalance += amount;
        System.out.println("Счет быть пополнен на: " + amount + " тенге. Общая сумма на расчетном счете: " + getCheckingBalance() + " тенге.");
    }

    public int getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(int checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
}

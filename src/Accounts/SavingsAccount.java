package Accounts;

public class SavingsAccount extends Account {
    private int savingBalance;

    public SavingsAccount(String name, int savingBalance) {
        super(name);
        this.savingBalance = savingBalance;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Со сберегательного счета нельзя платить. ");
    }

    @Override
    public void transfer(Account account, int amount){
        if (savingBalance > amount) {
            System.out.printf("Деньги были переведены на %s. Cумма: %s тенге.\n", account.name, amount);
            savingBalance -= amount;
            account.addMoney(amount);
            System.out.println("Остаток на сберегательном счете: " + getSavingBalance() + " тенге.");
        } else {
            System.out.println("Перевод денег невозможен.");
        }
    }

    @Override
    public void addMoney(int amount) {
        savingBalance += amount;
        System.out.println("Счет быть пополнен на: " + amount + " тенге. Общая сумма на сберегательном счете: " + getSavingBalance() + " тенге.");
    }

    public int getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(int savingBalance) {
        this.savingBalance = savingBalance;
    }

}

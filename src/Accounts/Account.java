package Accounts;

public abstract class Account {
    final String name;

    protected Account(String name) {
        this.name = name;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

}

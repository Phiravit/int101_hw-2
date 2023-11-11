package work03;

import work01.Utilitor;
import work02.Person;

public class Account {

    private static long nextNo = 100_000_000;
    private final long no;
    private final Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null) {
            throw new NullPointerException("Owner cannot be null.");
        }

        this.owner = owner;
        this.balance = 0.0;

        long temporaryNo;

        do {
            int result;
            do {
                result = (int) Utilitor.computeIsbn10(nextNo);
                if (result == 10) {
                    nextNo++;
                }
            } while (result == 10);

            temporaryNo = 10 * nextNo + result;
            nextNo++;

        } while (Utilitor.testPositive((double) temporaryNo) <= 0);

        this.no = temporaryNo;

    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (Utilitor.testPositive(amount) <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        if (Utilitor.testPositive(amount) <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        double newBalance = this.balance - amount;

        if (Utilitor.testPositive(newBalance) <= 0) {
            throw new IllegalArgumentException("Withdrawal would result in a non-positive balance.");
        }

        this.balance = newBalance;
        return this.balance;
    }

    public void transfer(double amount, Account account) {
        if (account == null || account.withdraw(amount) <= 0) {
            throw new IllegalArgumentException("Invalid transfer: target account is null or cannot withdraw the specified amount.");
        }

        this.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account(" + no + "," + balance + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return this == account;
    }
}

package bankaccount;

public class BankAccount implements Comparable<BankAccount> {
    
    private String name;
    private int balance;


    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
        
    }
    
    public String getName() {
        return name;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public int compareTo(BankAccount other) {
        if (balance < other.balance)
            return -1;
        if (balance > other.balance)
            return 1;
        return 0;
    }
        
}

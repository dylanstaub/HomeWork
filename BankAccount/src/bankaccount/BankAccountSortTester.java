package bankaccount;

import java.util.*;

public class BankAccountSortTester {
    
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount("Dylan Staub", 1000000));
        accounts.add(new BankAccount("USA", -1400000000));
        accounts.add(new BankAccount("Richie Rich", 99999999));
        
        Collections.sort(accounts);
        for (BankAccount e: accounts)
            System.out.println(e.getName() + " " + e.getBalance());
    }
    
}

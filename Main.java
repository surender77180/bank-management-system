import java.util.*;

class Account {
    int balance;

    Account() {
        balance = 0;
    }

    int balanceInquiry(){
        return balance;
    }

    void credit(int amount) {
        balance += amount;
    }

}

public class Main {
    public static void main(String[] args) {
    
    Account ac = new Account();
     System.out.println(ac.balanceInquiry());   
    }
}

package Balance;

public class Account {
    int Balance;

    public Account() {
        Balance = 1000;
    }

    public Account(int Balance) {
        this.Balance = Balance;
    }

    public void Display_Balance() {
        System.out.println("The balance amount is " + Balance);
    }
}

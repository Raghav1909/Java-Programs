// Write a program to make a package Balance in which has an Account class with
// Display_Balance method in it.Import Balance package in another program to
// access the Display_Balance method of Account class.

import balance.Account;

public class PackageExample {
    public static void main(String[] args) {
        Account p1 = new Account(1000);
        p1.Display_Balance();
    }
}

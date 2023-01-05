/*
Write a main program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Print the balance, the monthly interest, and the date when this account was created,
without creating display method.


 */
package com.example.account.main;
//import fully qualified class name
import com.example.account.data.Account;
public class AccountImpl {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000);
       // account1.annualInterestRate = 12;
        account1.dateCreated = "15/01/2023";
        double monthlyInterest = account1.getMonthlyInterest();
        System.out.println("account1.balance = " + account1.balance);
        System.out.println("monthlyInterest = " + monthlyInterest);
        System.out.println("account1.dateCreated = " + account1.dateCreated);

    }
}

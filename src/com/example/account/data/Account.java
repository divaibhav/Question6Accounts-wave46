/*
Question 6
Design a class named Account that contains:
■ An int data field named id for the account (default 0).
■ A double data field named balance for the account (default 0).
■ A double data field named annualInterestRate that stores the current
interest rate (default 0). Assume all accounts have the same interest rate.
■ A String data field named dateCreated that stores the date when the
account was created.(05/01/2023)
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.

■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
 (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate.
monthlyInterestRate is annualInterestRate / 12.
Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
Write a main program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Print the balance, the monthly interest, and the date when this account was created,
without creating display method.

 */
package com.example.account.data;

public class Account {
    public int id;
    public double balance;
    public double annualInterestRate;
    public String dateCreated;
    public Account(){
        annualInterestRate = 12;
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 12;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() /100);
    }

}
